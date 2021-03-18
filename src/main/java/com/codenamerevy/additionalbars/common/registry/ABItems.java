package com.codenamerevy.additionalbars.common.registry;

import com.codenamerevy.additionalbars.common.AdditionalBars;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("all")
public class ABItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalBars.MODID);
    public static final DeferredRegister<Item> BOP_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalBars.MODID);
    public static final DeferredRegister<Item> BYG_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalBars.MODID);

    //public static final RegistryObject<Item> TEST = ITEMS.register("test", () -> new BlockItem(ABBlocks.TEST.get(), new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));

    public static final RegistryObject<Item> GOLD_BARS                         = ITEMS.register("gold_bars",                          () -> new BlockItem(ABBlocks.GOLD_BARS.get(),                            new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> ACACIA_BARS                       = ITEMS.register("acacia_bars",                        () -> new BlockItem(ABBlocks.ACACIA_BARS.get(),                          new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> BIRCH_BARS                        = ITEMS.register("birch_bars",                         () -> new BlockItem(ABBlocks.BIRCH_BARS.get(),                           new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> JUNGLE_BARS                       = ITEMS.register("jungle_bars",                        () -> new BlockItem(ABBlocks.JUNGLE_BARS.get(),                          new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> OAK_BARS                          = ITEMS.register("oak_bars",                           () -> new BlockItem(ABBlocks.OAK_BARS.get(),                             new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> DARK_OAK_BARS                     = ITEMS.register("dark_oak_bars",                      () -> new BlockItem(ABBlocks.DARK_OAK_BARS.get(),                        new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> SPRUCE_BARS                       = ITEMS.register("spruce_bars",                        () -> new BlockItem(ABBlocks.SPRUCE_BARS.get(),                          new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CRIMSON_BARS                      = ITEMS.register("crimson_bars",                       () -> new BlockItem(ABBlocks.CRIMSON_BARS.get(),                         new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> WARPED_BARS                       = ITEMS.register("warped_bars",                        () -> new BlockItem(ABBlocks.WARPED_BARS.get(),                          new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));

    public static final RegistryObject<Item> CROSSED_IRON_BARS                 = ITEMS.register("crossed_iron_bars",                  () -> new BlockItem(ABBlocks.CROSSED_IRON_BARS.get(),                    new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_GOLD_BARS                 = ITEMS.register("crossed_gold_bars",                  () -> new BlockItem(ABBlocks.CROSSED_GOLD_BARS.get(),                    new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_ACACIA_BARS               = ITEMS.register("crossed_acacia_bars",                () -> new BlockItem(ABBlocks.CROSSED_ACACIA_BARS.get(),                  new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_BIRCH_BARS                = ITEMS.register("crossed_birch_bars",                 () -> new BlockItem(ABBlocks.CROSSED_BIRCH_BARS.get(),                   new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_JUNGLE_BARS               = ITEMS.register("crossed_jungle_bars",                () -> new BlockItem(ABBlocks.CROSSED_JUNGLE_BARS.get(),                  new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_OAK_BARS                  = ITEMS.register("crossed_oak_bars",                   () -> new BlockItem(ABBlocks.CROSSED_OAK_BARS.get(),                     new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_DARK_OAK_BARS             = ITEMS.register("crossed_dark_oak_bars",              () -> new BlockItem(ABBlocks.CROSSED_DARK_OAK_BARS.get(),                new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_SPRUCE_BARS               = ITEMS.register("crossed_spruce_bars",                () -> new BlockItem(ABBlocks.CROSSED_SPRUCE_BARS.get(),                  new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_CRIMSON_BARS              = ITEMS.register("crossed_crimson_bars",               () -> new BlockItem(ABBlocks.CROSSED_CRIMSON_BARS.get(),                 new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));
    public static final RegistryObject<Item> CROSSED_WARPED_BARS               = ITEMS.register("crossed_warped_bars",                () -> new BlockItem(ABBlocks.CROSSED_WARPED_BARS.get(),                  new Item.Properties().group(AdditionalBars.ADDITIONAL_BARS)));

    public static final RegistryObject<Item> HORIZONTAL_IRON_BARS              = ITEMS.register("horizontal_iron_bars",               () -> new BlockItem(ABBlocks.HORIZONTAL_IRON_BARS.get(),                 new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_GOLD_BARS              = ITEMS.register("horizontal_gold_bars",               () -> new BlockItem(ABBlocks.HORIZONTAL_GOLD_BARS.get(),                 new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_ACACIA_BARS            = ITEMS.register("horizontal_acacia_bars",             () -> new BlockItem(ABBlocks.HORIZONTAL_ACACIA_BARS.get(),               new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_BIRCH_BARS             = ITEMS.register("horizontal_birch_bars",              () -> new BlockItem(ABBlocks.HORIZONTAL_BIRCH_BARS.get(),                new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_JUNGLE_BARS            = ITEMS.register("horizontal_jungle_bars",             () -> new BlockItem(ABBlocks.HORIZONTAL_JUNGLE_BARS.get(),               new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_OAK_BARS               = ITEMS.register("horizontal_oak_bars",                () -> new BlockItem(ABBlocks.HORIZONTAL_OAK_BARS.get(),                  new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_DARK_OAK_BARS          = ITEMS.register("horizontal_dark_oak_bars",           () -> new BlockItem(ABBlocks.HORIZONTAL_DARK_OAK_BARS.get(),             new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_SPRUCE_BARS            = ITEMS.register("horizontal_spruce_bars",             () -> new BlockItem(ABBlocks.HORIZONTAL_SPRUCE_BARS.get(),               new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CRIMSON_BARS           = ITEMS.register("horizontal_crimson_bars",            () -> new BlockItem(ABBlocks.HORIZONTAL_CRIMSON_BARS.get(),              new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_WARPED_BARS            = ITEMS.register("horizontal_warped_bars",             () -> new BlockItem(ABBlocks.HORIZONTAL_WARPED_BARS.get(),               new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));

    public static final RegistryObject<Item> HORIZONTAL_CROSSED_IRON_BARS      = ITEMS.register("horizontal_crossed_iron_bars",       () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_IRON_BARS.get(),         new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_GOLD_BARS      = ITEMS.register("horizontal_crossed_gold_bars",       () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_GOLD_BARS.get(),         new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_ACACIA_BARS    = ITEMS.register("horizontal_crossed_acacia_bars",     () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_ACACIA_BARS.get(),       new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_BIRCH_BARS     = ITEMS.register("horizontal_crossed_birch_bars",      () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_BIRCH_BARS.get(),        new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_JUNGLE_BARS    = ITEMS.register("horizontal_crossed_jungle_bars",     () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS.get(),       new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_OAK_BARS       = ITEMS.register("horizontal_crossed_oak_bars",        () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_OAK_BARS.get(),          new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_DARK_OAK_BARS  = ITEMS.register("horizontal_crossed_dark_oak_bars",   () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS.get(),     new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_SPRUCE_BARS    = ITEMS.register("horizontal_crossed_spruce_bars",     () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS.get(),       new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_CRIMSON_BARS   = ITEMS.register("horizontal_crossed_crimson_bars",    () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS.get(),      new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
    public static final RegistryObject<Item> HORIZONTAL_CROSSED_WARPED_BARS    = ITEMS.register("horizontal_crossed_warped_bars",     () -> new BlockItem(ABBlocks.HORIZONTAL_CROSSED_WARPED_BARS.get(),       new Item.Properties().group(AdditionalBars.HORIZONTAL_ADDITIONAL_BARS)));
}
