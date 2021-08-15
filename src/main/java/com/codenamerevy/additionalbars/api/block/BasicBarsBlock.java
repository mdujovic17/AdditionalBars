package com.codenamerevy.additionalbars.api.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public abstract class BasicBarsBlock extends Block implements CustomOxidizableBlock, SimpleWaterloggedBlock {
    protected OxidizationState oxidizationState;

    public BasicBarsBlock(Properties properties) {
        super(properties);
    }

    public BasicBarsBlock(OxidizationState oxidizationState, Properties properties) {
        super(properties);
        this.oxidizationState = oxidizationState;
    }
}
