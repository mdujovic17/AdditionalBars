package com.gamma1772.additionalbars.content.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
* New Method for horizontal bars. Uses SlabBlock instead of regular block*/
public class HorizontalBarsSlabBlock extends SlabBlock implements SimpleWaterloggedBlock {

	private final ArrayList<String> blockTypes = new ArrayList<>();
	
	private static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	private static final VoxelShape SHAPE_BOT = Block.box(0.0F, 6.0F, 0.0F, 16.0F, 8.0F, 16.0F); //This is a bottom shape.
	private static final VoxelShape SHAPE_TOP = Block.box(0.0F, 6.0F + 8.0F, 0.0F, 16.0F, 8.0F + 8.0F, 16.0F); //This is a top shape.
	private static final VoxelShape SHAPE_COM = Shapes.or(SHAPE_BOT, SHAPE_TOP); //This is a combined shape

	public HorizontalBarsSlabBlock(Properties properties) {
		super(properties);
	}
	
	public HorizontalBarsSlabBlock(Properties properties, BlockType... types) {
		super(properties);
		if (types.length != 0) {
			for (BlockType type : types) {
				blockTypes.add(type.getText());
			}
		}
	}
	@Override
	public boolean useShapeForLightOcclusion(BlockState state) {
		return true;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		SlabType slabType = state.getValue(TYPE);

		return switch (slabType) {
			case DOUBLE -> SHAPE_COM;
			case TOP -> SHAPE_TOP;
			default -> SHAPE_BOT;
		};
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext ctx) {
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

	@Override
	public void appendHoverText(ItemStack stack, @org.jetbrains.annotations.Nullable BlockGetter getter, List<Component> tooltips, TooltipFlag flag) {
		if (!blockTypes.isEmpty()) {
			for ( String type : blockTypes) {
				if (type.equals("oxidizing") || type.equals("waxed")) {
					tooltips.add(new TranslatableComponent("tooltip.gamma1772." + type).withStyle(ChatFormatting.AQUA));
				}
				else if (!type.equals("regular")){
					if (!type.equals("nether")) {
						tooltips.add(new TranslatableComponent("tooltip.gamma1772." + type).withStyle(ChatFormatting.GREEN));
					}
					else {
						tooltips.add(new TranslatableComponent("tooltip.gamma1772." + type).withStyle(ChatFormatting.DARK_RED));
					}
				}
				else {
					tooltips.add(new TranslatableComponent("tooltip.gamma1772." + type).withStyle(ChatFormatting.GRAY));
				}
			}
		}
	}
}
