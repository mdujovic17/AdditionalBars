package com.gamma1772.additionalbars.content.block;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.Nullable;

public class WaxedBarsBlock extends BasicBarsBlock {
    private WeatherState state;
    OxidizableBarsBlock oxidizableBlock;
    public WaxedBarsBlock(Properties properties, OxidizableBarsBlock oxidizableBlock, BlockType... types) {
        super(properties, types);
        this.oxidizableBlock = oxidizableBlock;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if (ToolActions.AXE_WAX_OFF.equals(toolAction)) {
            return oxidizableBlock.withPropertiesOf(state);
        }
        return null;
    }
}
