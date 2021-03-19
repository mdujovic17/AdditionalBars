package com.codenamerevy.additionalbars.common.registry;

import com.codenamerevy.additionalbars.common.AdditionalBars;
import com.codenamerevy.additionalbars.common.content.block.BlockBarsBase;
import com.codenamerevy.additionalbars.common.content.block.HorizontalBarsSlabBlock;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.swing.text.html.BlockView;

public class ABBlocks
{
    private static Boolean never(BlockState blockState, IBlockReader blockView, BlockPos blockPos, EntityType<?> entityType) { return false; }
    private static boolean never(BlockState blockState, IBlockReader blockView, BlockPos blockPos) { return false; }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdditionalBars.MODID);
    public static final DeferredRegister<Block> BYG_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdditionalBars.MODID);

    public static final RegistryObject<Block> GOLD_BARS                         = BLOCKS.register("gold_bars", () -> createBarsBlock(Material.IRON, MaterialColor.GOLD, SoundType.METAL, ToolType.PICKAXE, 5.0f, 6.0f));
    public static final RegistryObject<Block> ACACIA_BARS                       = BLOCKS.register("acacia_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> BIRCH_BARS                        = BLOCKS.register("birch_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> JUNGLE_BARS                       = BLOCKS.register("jungle_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> OAK_BARS                          = BLOCKS.register("oak_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> DARK_OAK_BARS                     = BLOCKS.register("dark_oak_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> SPRUCE_BARS                       = BLOCKS.register("spruce_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> CRIMSON_BARS                      = BLOCKS.register("crimson_bars", () -> createBarsBlock(Material.NETHER_WOOD, MaterialColor.CRIMSON_NYLIUM, SoundType.NYLIUM));
    public static final RegistryObject<Block> WARPED_BARS                       = BLOCKS.register("warped_bars", () -> createBarsBlock(Material.NETHER_WOOD, MaterialColor.WARPED_NYLIUM, SoundType.NYLIUM));

    public static final RegistryObject<Block> CROSSED_IRON_BARS                 = BLOCKS.register("crossed_iron_bars", () -> createBarsBlock(Material.IRON, MaterialColor.IRON, SoundType.METAL, ToolType.PICKAXE, 5.0f, 6.0f));
    public static final RegistryObject<Block> CROSSED_GOLD_BARS                 = BLOCKS.register("crossed_gold_bars", () -> createBarsBlock(Material.IRON, MaterialColor.GOLD, SoundType.METAL, ToolType.PICKAXE, 5.0f, 6.0f));
    public static final RegistryObject<Block> CROSSED_ACACIA_BARS               = BLOCKS.register("crossed_acacia_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> CROSSED_BIRCH_BARS                = BLOCKS.register("crossed_birch_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> CROSSED_JUNGLE_BARS               = BLOCKS.register("crossed_jungle_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> CROSSED_OAK_BARS                  = BLOCKS.register("crossed_oak_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> CROSSED_DARK_OAK_BARS             = BLOCKS.register("crossed_dark_oak_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> CROSSED_SPRUCE_BARS               = BLOCKS.register("crossed_spruce_bars", ABBlocks::createBarsBlock);
    public static final RegistryObject<Block> CROSSED_CRIMSON_BARS              = BLOCKS.register("crossed_crimson_bars", () -> createBarsBlock(Material.NETHER_WOOD, MaterialColor.CRIMSON_NYLIUM, SoundType.NYLIUM));
    public static final RegistryObject<Block> CROSSED_WARPED_BARS               = BLOCKS.register("crossed_warped_bars", () -> createBarsBlock(Material.NETHER_WOOD, MaterialColor.WARPED_NYLIUM, SoundType.NYLIUM));

    public static final RegistryObject<Block> HORIZONTAL_IRON_BARS              = BLOCKS.register("horizontal_iron_bars", () -> createHorizontalBarsBlock(Material.IRON, MaterialColor.IRON, SoundType.METAL, ToolType.PICKAXE, 5.0f, 6.0f));
    public static final RegistryObject<Block> HORIZONTAL_GOLD_BARS              = BLOCKS.register("horizontal_gold_bars", () -> createHorizontalBarsBlock(Material.IRON, MaterialColor.GOLD, SoundType.METAL, ToolType.PICKAXE, 5.0f, 6.0f));
    public static final RegistryObject<Block> HORIZONTAL_ACACIA_BARS            = BLOCKS.register("horizontal_acacia_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_BIRCH_BARS             = BLOCKS.register("horizontal_birch_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_JUNGLE_BARS            = BLOCKS.register("horizontal_jungle_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_OAK_BARS               = BLOCKS.register("horizontal_oak_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_DARK_OAK_BARS          = BLOCKS.register("horizontal_dark_oak_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_SPRUCE_BARS            = BLOCKS.register("horizontal_spruce_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_CRIMSON_BARS           = BLOCKS.register("horizontal_crimson_bars", () -> createHorizontalBarsBlock(Material.NETHER_WOOD, MaterialColor.CRIMSON_NYLIUM, SoundType.NYLIUM));
    public static final RegistryObject<Block> HORIZONTAL_WARPED_BARS            = BLOCKS.register("horizontal_warped_bars", () -> createHorizontalBarsBlock(Material.NETHER_WOOD, MaterialColor.WARPED_NYLIUM, SoundType.NYLIUM));

    public static final RegistryObject<Block> HORIZONTAL_CROSSED_IRON_BARS      = BLOCKS.register("horizontal_crossed_iron_bars", () -> createHorizontalBarsBlock(Material.IRON, MaterialColor.IRON, SoundType.METAL, ToolType.PICKAXE, 5.0f, 6.0f));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_GOLD_BARS      = BLOCKS.register("horizontal_crossed_gold_bars", () -> createHorizontalBarsBlock(Material.IRON, MaterialColor.GOLD, SoundType.METAL, ToolType.PICKAXE, 5.0f, 6.0f));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_ACACIA_BARS    = BLOCKS.register("horizontal_crossed_acacia_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_BIRCH_BARS     = BLOCKS.register("horizontal_crossed_birch_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_JUNGLE_BARS    = BLOCKS.register("horizontal_crossed_jungle_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_OAK_BARS       = BLOCKS.register("horizontal_crossed_oak_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_DARK_OAK_BARS  = BLOCKS.register("horizontal_crossed_dark_oak_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_SPRUCE_BARS    = BLOCKS.register("horizontal_crossed_spruce_bars", ABBlocks::createHorizontalBarsBlock);
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_CRIMSON_BARS   = BLOCKS.register("horizontal_crossed_crimson_bars", () -> createHorizontalBarsBlock(Material.NETHER_WOOD, MaterialColor.CRIMSON_NYLIUM, SoundType.NYLIUM));
    public static final RegistryObject<Block> HORIZONTAL_CROSSED_WARPED_BARS    = BLOCKS.register("horizontal_crossed_warped_bars", () -> createHorizontalBarsBlock(Material.NETHER_WOOD, MaterialColor.WARPED_NYLIUM, SoundType.NYLIUM));

    protected static BlockBarsBase createBarsBlock() {
        return new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F).notSolid().setAllowsSpawn(ABBlocks::never).setOpaque(ABBlocks::never).setSuffocates(ABBlocks::never).setBlocksVision(ABBlocks::never));
    }

    protected static BlockBarsBase createBarsBlock(Material material, MaterialColor color, SoundType sound) {
        return new BlockBarsBase(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0f, 4.0f).notSolid().setAllowsSpawn(ABBlocks::never).setOpaque(ABBlocks::never).setSuffocates(ABBlocks::never).setBlocksVision(ABBlocks::never));
    }

    protected static BlockBarsBase createBarsBlock(Material material, MaterialColor color, SoundType sound, ToolType tool, float hardness, float resistance) {
        return new BlockBarsBase(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(tool).harvestLevel(0).hardnessAndResistance(hardness, resistance).notSolid().setAllowsSpawn(ABBlocks::never).setOpaque(ABBlocks::never).setSuffocates(ABBlocks::never).setBlocksVision(ABBlocks::never));
    }

    protected static HorizontalBarsSlabBlock createHorizontalBarsBlock() {
        return new HorizontalBarsSlabBlock(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0F, 4.0F).notSolid().setAllowsSpawn(ABBlocks::never).setOpaque(ABBlocks::never).setSuffocates(ABBlocks::never).setBlocksVision(ABBlocks::never));
    }

    protected static HorizontalBarsSlabBlock createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound) {
        return new HorizontalBarsSlabBlock(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0f, 4.0f).notSolid().setAllowsSpawn(ABBlocks::never).setOpaque(ABBlocks::never).setSuffocates(ABBlocks::never).setBlocksVision(ABBlocks::never));
    }

    protected static HorizontalBarsSlabBlock createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound, ToolType tool, float hardness, float resistance) {
        return new HorizontalBarsSlabBlock(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(tool).harvestLevel(0).hardnessAndResistance(hardness, resistance).notSolid().setAllowsSpawn(ABBlocks::never).setOpaque(ABBlocks::never).setSuffocates(ABBlocks::never).setBlocksVision(ABBlocks::never));
    }
}

