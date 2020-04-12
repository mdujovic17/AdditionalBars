package com.codenamerevy.additionalbars.init;

import com.codenamerevy.additionalbars.content.block.BlockBarsBase;
import com.codenamerevy.additionalbars.content.block.BlockHorizontalBars;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

import static com.codenamerevy.additionalbars.util.Ref.location;

public class BlockInit
{
    //Dev
    public static final Block DEV_HORIZONTAL_BARS = new BlockHorizontalBars(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName(location("horizontal_pane_block"));

    //Vanilla
    public static final Block GOLD_BARS = new BlockBarsBase(Block.Properties.create(Material.IRON, MaterialColor.GOLD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName(location("gold_bars"));
    public static final Block ACACIA_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("acacia_bars"));
    public static final Block BIRCH_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("birch_bars"));
    public static final Block JUNGLE_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("jungle_bars"));
    public static final Block OAK_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("oak_bars"));
    public static final Block DARK_OAK_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("dark_oak_bars"));
    public static final Block SPRUCE_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("spruce_bars"));

    //Crossed
    public static final Block CROSSED_IRON_BARS = new BlockBarsBase(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName(location("crossed_iron_bars"));
    public static final Block CROSSED_GOLD_BARS = new BlockBarsBase(Block.Properties.create(Material.IRON, MaterialColor.GOLD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName(location("crossed_gold_bars"));
    public static final Block CROSSED_ACACIA_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0)).setRegistryName(location("crossed_acacia_bars"));
    public static final Block CROSSED_BIRCH_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0)).setRegistryName(location("crossed_birch_bars"));
    public static final Block CROSSED_JUNGLE_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0)).setRegistryName(location("crossed_jungle_bars"));
    public static final Block CROSSED_OAK_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0)).setRegistryName(location("crossed_oak_bars"));
    public static final Block CROSSED_DARK_OAK_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0)).setRegistryName(location("crossed_dark_oak_bars"));
    public static final Block CROSSED_SPRUCE_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(0)).setRegistryName(location("crossed_spruce_bars"));

    //Biomes O' Plenty
    public static final Block FIR_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("fir_bars"));
    public static final Block REDWOOD_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("redwood_bars"));
    public static final Block CHERRY_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("cherry_bars"));
    public static final Block MAHOGANY_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("mahogany_bars"));
    public static final Block JACARANDA_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("jacaranda_bars"));
    public static final Block PALM_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("palm_bars"));
    public static final Block WILLOW_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("willow_bars"));
    public static final Block DEAD_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("dead_bars"));
    public static final Block MAGIC_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("magic_bars"));
    public static final Block UMBRAN_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("umbran_bars"));
    public static final Block HELLBARK_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("hellbark_bars"));

    //Crossed Biomes O' Plenty
    public static final Block CROSSED_FIR_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("crossed_fir_bars"));
    public static final Block CROSSED_REDWOOD_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("crossed_redwood_bars"));
    public static final Block CROSSED_CHERRY_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("crossed_cherry_bars"));
    public static final Block CROSSED_MAHOGANY_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("crossed_mahogany_bars"));
    public static final Block CROSSED_JACARANDA_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("crossed_jacaranda_bars"));
    public static final Block CROSSED_PALM_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("crossed_palm_bars"));
    public static final Block CROSSED_WILLOW_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("crossed_willow_bars"));
    public static final Block CROSSED_DEAD_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("crossed_dead_bars"));
    public static final Block CROSSED_MAGIC_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("crossed_magic_bars"));
    public static final Block CROSSED_UMBRAN_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("crossed_umbran_bars"));
    public static final Block CROSSED_HELLBARK_BARS = new BlockBarsBase(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0)).setRegistryName(location("crossed_hellbark_bars"));
}

