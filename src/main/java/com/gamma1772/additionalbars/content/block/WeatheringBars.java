package com.gamma1772.additionalbars.content.block;

import com.gamma1772.additionalbars.registries.ABBlocks;
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public interface WeatheringBars extends WeatheringCopper {
    Supplier<BiMap<OxidizableBarsBlock, OxidizableBarsBlock>> NEXT_BARS_BLOCK = Suppliers.memoize(() -> ImmutableBiMap.<OxidizableBarsBlock, OxidizableBarsBlock>builder()
            .put(ABBlocks.COPPER_BARS.get(), ABBlocks.EXPOSED_COPPER_BARS.get())
            .put(ABBlocks.EXPOSED_COPPER_BARS.get(), ABBlocks.WEATHERED_COPPER_BARS.get())
            .put(ABBlocks.WEATHERED_COPPER_BARS.get(), ABBlocks.OXIDIZED_COPPER_BARS.get())
            .put(ABBlocks.CROSSED_COPPER_BARS.get(), ABBlocks.CROSSED_EXPOSED_COPPER_BARS.get())
            .put(ABBlocks.CROSSED_EXPOSED_COPPER_BARS.get(), ABBlocks.CROSSED_WEATHERED_COPPER_BARS.get())
            .put(ABBlocks.CROSSED_WEATHERED_COPPER_BARS.get(), ABBlocks.CROSSED_OXIDIZED_COPPER_BARS.get()).build());
    Supplier<BiMap<OxidizableBarsBlock, OxidizableBarsBlock>> PREV_BARS_BLOCK = Suppliers.memoize(() -> NEXT_BARS_BLOCK.get().inverse());

    static Optional<OxidizableBarsBlock> getPrevious(OxidizableBarsBlock block) {
        return Optional.ofNullable(PREV_BARS_BLOCK.get().get(block));
    }

    static Optional<OxidizableBarsBlock> getNext(OxidizableBarsBlock block) {
        return Optional.ofNullable(NEXT_BARS_BLOCK.get().get(block));
    }

    default Optional<BlockState> getNext(BlockState state) {
        return getNext((OxidizableBarsBlock) state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    static Optional<BlockState> getPrevious(BlockState state) {
        return getPrevious((OxidizableBarsBlock) state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }
}
