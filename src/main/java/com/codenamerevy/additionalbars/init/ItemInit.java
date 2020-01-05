package com.codenamerevy.additionalbars.init;

import com.codenamerevy.additionalbars.AdditionalBars;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemInit
{
    /**public static final Item ACACIA_ROD = new ItemBase(new Item.Properties().group(CreativeGroup.ADDITIONAL_BARS)).setRegistryName(Ref.location("acacia_rod"));
    public static final Item BIRCH_ROD = new ItemBase(new Item.Properties().group(CreativeGroup.ADDITIONAL_BARS)).setRegistryName(Ref.location("birch_rod"));
    public static final Item JUNGLE_ROD = new ItemBase(new Item.Properties().group(CreativeGroup.ADDITIONAL_BARS)).setRegistryName(Ref.location("jungle_rod"));
    public static final Item DARK_OAK_ROD = new ItemBase(new Item.Properties().group(CreativeGroup.ADDITIONAL_BARS)).setRegistryName(Ref.location("dark_oak_rod"));
    public static final Item SPRUCE_ROD = new ItemBase(new Item.Properties().group(CreativeGroup.ADDITIONAL_BARS)).setRegistryName(Ref.location("spruce_rod"));
    public static final Item OAK_ROD = new ItemBase(new Item.Properties().group(CreativeGroup.ADDITIONAL_BARS)).setRegistryName(Ref.location("oak_rod"));
     **/
    //blocks

    public static final Item GOLD_BARS = new BlockItem(BlockInit.GOLD_BARS, new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)).setRegistryName(BlockInit.GOLD_BARS.getRegistryName());
    public static final Item ACACIA_BARS = new BlockItem(BlockInit.ACACIA_BARS, new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)).setRegistryName(BlockInit.ACACIA_BARS.getRegistryName());
    public static final Item BIRCH_BARS = new BlockItem(BlockInit.BIRCH_BARS, new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)).setRegistryName(BlockInit.BIRCH_BARS.getRegistryName());
    public static final Item JUNGLE_BARS = new BlockItem(BlockInit.JUNGLE_BARS, new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)).setRegistryName(BlockInit.JUNGLE_BARS.getRegistryName());
    public static final Item OAK_BARS = new BlockItem(BlockInit.OAK_BARS, new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)).setRegistryName(BlockInit.OAK_BARS.getRegistryName());
    public static final Item DARK_OAK_BARS = new BlockItem(BlockInit.DARK_OAK_BARS, new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)).setRegistryName(BlockInit.DARK_OAK_BARS.getRegistryName());
    public static final Item SPRUCE_BARS = new BlockItem(BlockInit.SPRUCE_BARS, new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)).setRegistryName(BlockInit.SPRUCE_BARS.getRegistryName());
}
