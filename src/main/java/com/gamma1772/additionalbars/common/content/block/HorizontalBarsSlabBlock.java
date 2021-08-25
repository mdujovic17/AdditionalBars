package com.gamma1772.additionalbars.common.content.block;

import net.minecraft.block.*;
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
/*
* New Method for horizontal bars. Uses SlabBlock instead of regular block*/
public class HorizontalBarsSlabBlock extends SlabBlock implements IWaterLoggable {

	private static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	private static final VoxelShape SHAPE_BOT = Block.box(0.0F, 6.0F, 0.0F, 16.0F, 8.0F, 16.0F); //This is a bottom shape.
	private static final VoxelShape SHAPE_TOP = Block.box(0.0F, 6.0F + 8.0F, 0.0F, 16.0F, 8.0F + 8.0F, 16.0F); //This is a top shape.
	private static final VoxelShape SHAPE_COM = VoxelShapes.or(SHAPE_BOT, SHAPE_TOP); //This is a combined shape

	public HorizontalBarsSlabBlock(Properties properties) {
		super(properties);
	}

	@Override
	public boolean useShapeForLightOcclusion(BlockState state) {
		return true;
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		SlabType slabType = state.getValue(TYPE);

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
		BlockPos blockPos = ctx.getClickedPos();
		BlockState blockState = ctx.getLevel().getBlockState(blockPos);
		FluidState fluidState = ctx.getLevel().getFluidState(blockPos);

		if (blockState.is(this)) {
			return blockState.setValue(TYPE, SlabType.DOUBLE).setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
		} else {
			BlockState blockState2 = this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
			Direction direction = ctx.getClickedFace();
			return direction != Direction.DOWN && (direction == Direction.UP || !(ctx.getClickLocation().y - (double)blockPos.getY() > 0.5D)) ? blockState2 : blockState2.setValue(TYPE, SlabType.TOP);
		}
	}
}
