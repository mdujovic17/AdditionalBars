package com.codenamerevy.additionalbars.common.content.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.SlabBlock;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class HorizontalBarsSlabBlock extends SlabBlock implements IWaterLoggable {

	private static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	private static final VoxelShape SHAPE_BOT = Block.makeCuboidShape(0.0F, 6.0F, 0.0F, 16.0F, 8.0F, 16.0F); //This is a bottom shape.
	private static final VoxelShape SHAPE_TOP = Block.makeCuboidShape(0.0F, 6.0F + 8.0F, 0.0F, 16.0F, 8.0F + 8.0F, 16.0F); //This is a top shape.
	private static final VoxelShape SHAPE_COM = VoxelShapes.or(SHAPE_BOT, SHAPE_TOP); //This is a combined shape

	public HorizontalBarsSlabBlock(Properties properties) {
		super(properties);
	}

	@Override
	public boolean isTransparent(BlockState state) {
		return true;
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		SlabType slabType = state.get(TYPE);

		switch(slabType) {
			case DOUBLE:
				return SHAPE_COM;
			case TOP:
				return SHAPE_TOP;
			default:
				return SHAPE_BOT;
		}
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext ctx) {
		BlockPos blockPos = ctx.getPos();
		BlockState blockState = ctx.getWorld().getBlockState(blockPos);
		FluidState fluidState = ctx.getWorld().getFluidState(blockPos);

		if (blockState.isIn(this)) {
			return blockState.with(TYPE, SlabType.DOUBLE).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
		} else {
			BlockState blockState2 = this.getDefaultState().with(TYPE, SlabType.BOTTOM).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
			Direction direction = ctx.getFace();
			return direction != Direction.DOWN && (direction == Direction.UP || !(ctx.getHitVec().y - (double)blockPos.getY() > 0.5D)) ? blockState2 : blockState2.with(TYPE, SlabType.TOP);
		}
	}
}
