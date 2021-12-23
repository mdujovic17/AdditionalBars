package com.codenamerevy.additionalbars.content.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class HorizontalOxidizableBarsBlock extends HorizontalBarsSlabBlock implements WeatheringCopper {

    private WeatherState state;

    public HorizontalOxidizableBarsBlock(WeatherState state, Properties properties) {
        super(properties);
        this.state = state;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, Random random) {
        this.onRandomTick(state, world, pos, random);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    @Override
    public WeatherState getAge() {
        return this.state;
    }
}