package com.codenamerevy.additionalbars.api.block;

import com.codenamerevy.additionalbars.common.registry.ABBlocks;
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

public interface CustomOxidizableBlock extends ChangeOverTimeBlock<CustomOxidizableBlock.OxidizationState> {

    Map<Block, Block> OXIDIZE_UP = new ImmutableMap.Builder<Block, Block>().build();
    Supplier<BiMap<Block, Block>> OXIDIZE_INCREASE = Suppliers.memoize(() -> ImmutableBiMap.<Block, Block>builder()
            .put(ABBlocks.COPPER_BARS.get(), ABBlocks.EXPOSED_COPPER_BARS.get())
            .put(ABBlocks.EXPOSED_COPPER_BARS.get(), ABBlocks.WEATHERED_COPPER_BARS.get())
            .put(ABBlocks.WEATHERED_COPPER_BARS.get(), ABBlocks.OXIDIZED_COPPER_BARS.get())

            .put(ABBlocks.CROSSED_COPPER_BARS.get(), ABBlocks.CROSSED_EXPOSED_COPPER_BARS.get())
            .put(ABBlocks.CROSSED_EXPOSED_COPPER_BARS.get(), ABBlocks.CROSSED_WEATHERED_COPPER_BARS.get())
            .put(ABBlocks.CROSSED_WEATHERED_COPPER_BARS.get(), ABBlocks.CROSSED_OXIDIZED_COPPER_BARS.get())

            .put(ABBlocks.HORIZONTAL_COPPER_BARS.get(), ABBlocks.HORIZONTAL_EXPOSED_COPPER_BARS.get())
            .put(ABBlocks.HORIZONTAL_EXPOSED_COPPER_BARS.get(), ABBlocks.HORIZONTAL_WEATHERED_COPPER_BARS.get())
            .put(ABBlocks.HORIZONTAL_WEATHERED_COPPER_BARS.get(), ABBlocks.HORIZONTAL_OXIDIZED_COPPER_BARS.get())

            .put(ABBlocks.HORIZONTAL_CROSSED_COPPER_BARS.get(), ABBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.get())
            .put(ABBlocks.HORIZONTAL_CROSSED_EXPOSED_COPPER_BARS.get(), ABBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.get())
            .put(ABBlocks.HORIZONTAL_CROSSED_WEATHERED_COPPER_BARS.get(), ABBlocks.HORIZONTAL_CROSSED_OXIDIZED_COPPER_BARS.get())
            .build());
    Supplier<BiMap<Block, Block>> OXIDIZE_DECREASE = Suppliers.memoize(() -> OXIDIZE_INCREASE.get().inverse());

    static Optional<Block> getPrevious(Block block) {
        return Optional.ofNullable(OXIDIZE_DECREASE.get().get(block));
    }

    static Block getFirst(Block firstBlock) {
        Block block = firstBlock;

        for(Block block1 = OXIDIZE_DECREASE.get().get(firstBlock); block1 != null; block1 = OXIDIZE_DECREASE.get().get(block1)) {
            block = block1;
        }

        return block;
    }

    static Optional<BlockState> getPrevious(BlockState state) {
        return getPrevious(state.getBlock()).map((previous) -> previous.withPropertiesOf(state));
    }

    static Optional<Block> getNext(Block block) {
        return Optional.ofNullable(OXIDIZE_INCREASE.get().get(block));
    }

    static BlockState getFirst(BlockState state) {
        return getFirst(state.getBlock()).withPropertiesOf(state);
    }

    default Optional<BlockState> getNext(BlockState state) {
        return getNext(state.getBlock()).map((next) -> next.withPropertiesOf(state));
    }

    default float getChanceModifier() {
        return this.getAge() == OxidizationState.UNAFFECTED ? 0.75F : 1.0F;
    }

    enum OxidizationState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;
    }
}
