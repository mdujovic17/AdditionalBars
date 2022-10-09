package com.gamma1772.additionalbars.content.block;

import com.google.common.collect.BiMap;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.Nullable;

public class OxidizableBarsBlock extends BasicBarsBlock implements WeatheringBars {

    private OxidizableBarsBlock prevBlock, nextBlock;
    private WaxedBarsBlock waxedBlock;
    private WeatherState state;

    /** @Deprecated */
    private OxidizableBarsBlock(WeatherState state, Properties properties) {
        super(properties);
        this.state = state;
    }

    public OxidizableBarsBlock(WeatherState state, Properties properties, BlockType... types) {
        super(properties, types);
        this.state = state;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        this.onRandomTick(state, world, pos, random);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return WeatheringBars.getNext((OxidizableBarsBlock) state.getBlock()).isPresent();
    }

    @Override
    public WeatherState getAge() {
        return this.state;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if (ToolActions.AXE_SCRAPE.equals(toolAction)) {
            if (this.state != WeatherState.UNAFFECTED && WeatheringBars.getPrevious(this).isPresent()) {
                return WeatheringBars.getPrevious(this).get().withPropertiesOf(state);
            }
        }

        return null;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack stackInHand = player.getItemInHand(hand);
        if (stackInHand.getItem().equals(Items.HONEYCOMB)) {
            if (player instanceof ServerPlayer serverPlayer) {
                CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger(serverPlayer, pos, stackInHand);
            }
            if (!player.isCreative()) {
                stackInHand.shrink(1);
            }
            level.setBlock(pos, waxedBlock.withPropertiesOf(state), 11);
            level.levelEvent(player, 3003, pos, 0);
            return InteractionResult.sidedSuccess(level.isClientSide());
        }

        return InteractionResult.PASS;
    }

    private OxidizableBarsBlock setPrevBlock(OxidizableBarsBlock prevBlock) {
        this.prevBlock = prevBlock;
        return this;
    }

    private OxidizableBarsBlock setNextBlock(OxidizableBarsBlock nextBlock) {
        this.nextBlock = nextBlock;
        return this;
    }

    private OxidizableBarsBlock setWaxedBlock(WaxedBarsBlock waxedBlock) {
        this.waxedBlock = waxedBlock;
        return this;
    }

    public OxidizableBarsBlock setBlocks(OxidizableBarsBlock prevBlock, OxidizableBarsBlock nextBlock, WaxedBarsBlock waxedBlock) {
        setPrevBlock(prevBlock).setNextBlock(nextBlock).setWaxedBlock(waxedBlock);
        return this;
    }
}
