package com.codenamerevy.additionalbars.api.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public abstract class BasicHorizontalBarsBlock extends SlabBlock implements CustomOxidizableBlock, SimpleWaterloggedBlock {
    protected OxidizationState oxidizationState;
    private static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final VoxelShape SHAPE_BOT = Block.box(0.0F, 6.0F, 0.0F, 16.0F, 8.0F, 16.0F); //This is a bottom shape.
    private static final VoxelShape SHAPE_TOP = Block.box(0.0F, 6.0F + 8.0F, 0.0F, 16.0F, 8.0F + 8.0F, 16.0F); //This is a top shape.
    private static final VoxelShape SHAPE_COM = Shapes.or(SHAPE_BOT, SHAPE_TOP); //This is a combined shape

    public BasicHorizontalBarsBlock(Properties properties) {
        super(properties);
    }

    public BasicHorizontalBarsBlock(OxidizationState oxidizationState, Properties properties) {
        super(properties);
        this.oxidizationState = oxidizationState;
    }
}
