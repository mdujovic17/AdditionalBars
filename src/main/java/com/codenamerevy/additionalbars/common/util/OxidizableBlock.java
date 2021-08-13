package com.codenamerevy.additionalbars.common.util;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public class OxidizableBlock implements ChangeOverTimeBlock<OxidizableBlock.OxidizationState> {

    Supplier<BiMap<Block, Block>> OXIDIZE;
    Supplier<BiMap<Block, Block>> DEOXIDIZE = Suppliers.memoize(() -> OXIDIZE.get().inverse());

    @Override
    public Optional<BlockState> getNext(BlockState state) {
        return Optional.empty();
    }

    @Override
    public float getChanceModifier() {
        return this.getAge() == OxidizationState.UNAFFECTED ? 0.75F : 1.0F;
    }

    @Override
    public OxidizationState getAge() {
        return null;
    }

    public static enum OxidizationState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;
    }
}
