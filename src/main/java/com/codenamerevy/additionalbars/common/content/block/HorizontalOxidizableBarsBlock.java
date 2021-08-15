package com.codenamerevy.additionalbars.common.content.block;

import com.codenamerevy.additionalbars.api.block.CustomOxidizableBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class HorizontalOxidizableBarsBlock extends HorizontalBarsSlabBlock implements CustomOxidizableBlock {

    private OxidizationState state;

    public HorizontalOxidizableBarsBlock(OxidizationState state, Properties properties) {
        super(properties);
        this.state = state;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, Random random) {
        this.onRandomTick(state, world, pos, random);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return CustomOxidizableBlock.getNext(state.getBlock()).isPresent();
    }

    @Override
    public OxidizationState getAge() {
        return this.state;
    }
}
