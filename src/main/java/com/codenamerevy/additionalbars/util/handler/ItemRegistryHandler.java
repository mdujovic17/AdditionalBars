package com.codenamerevy.additionalbars.util.handler;

import com.codenamerevy.additionalbars.config.Config;
import com.codenamerevy.additionalbars.init.ItemInit;
import com.codenamerevy.additionalbars.util.ModSupport;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegistryHandler
{
    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> event)
    {
        //registerDevItems(event.getRegistry());
        registerItems(event.getRegistry());
        registerCrossedVanillaItems(event.getRegistry());
        registerHorizontalVanillaItems(event.getRegistry());
        registerHorizontalCrossedVanillaItems(event.getRegistry());

        if(ModSupport.BOP.isLoaded() && Config.CategoryGeneral.BOPSupport.get()) {
            registerBOPItems(event.getRegistry());
            registerBOPCrossedItems(event.getRegistry());
            registerHorizontalBOPItems(event.getRegistry());
            registerHorizontalBOPCrossedItems(event.getRegistry());
        }
    }
    public static void registerDevItems(IForgeRegistry<Item> registry)
    {
      registry.register(ItemInit.DEV_HORIZONTAL_BARS);
    }

    public static void registerItems(IForgeRegistry<Item> registry)
    {
        registry.register(ItemInit.GOLD_BARS);
        registry.register(ItemInit.ACACIA_BARS);
        registry.register(ItemInit.BIRCH_BARS);
        registry.register(ItemInit.JUNGLE_BARS);
        registry.register(ItemInit.OAK_BARS);
        registry.register(ItemInit.DARK_OAK_BARS);
        registry.register(ItemInit.SPRUCE_BARS);
    }

    public static void registerCrossedVanillaItems(IForgeRegistry<Item> registry)
    {
        registry.register(ItemInit.CROSSED_IRON_BARS);
        registry.register(ItemInit.CROSSED_GOLD_BARS);
        registry.register(ItemInit.CROSSED_ACACIA_BARS);
        registry.register(ItemInit.CROSSED_BIRCH_BARS);
        registry.register(ItemInit.CROSSED_JUNGLE_BARS);
        registry.register(ItemInit.CROSSED_OAK_BARS);
        registry.register(ItemInit.CROSSED_DARK_OAK_BARS);
        registry.register(ItemInit.CROSSED_SPRUCE_BARS);
    }

    public static void registerBOPItems(IForgeRegistry<Item> registry)
    {
        registry.register(ItemInit.FIR_BARS);
        registry.register(ItemInit.REDWOOD_BARS);
        registry.register(ItemInit.CHERRY_BARS);
        registry.register(ItemInit.MAHOGANY_BARS);
        registry.register(ItemInit.JACARANDA_BARS);
        registry.register(ItemInit.PALM_BARS);
        registry.register(ItemInit.WILLOW_BARS);
        registry.register(ItemInit.DEAD_BARS);
        registry.register(ItemInit.MAGIC_BARS);
        registry.register(ItemInit.UMBRAN_BARS);
        registry.register(ItemInit.HELLBARK_BARS);
    }
    public static void registerBOPCrossedItems(IForgeRegistry<Item> registry)
    {
        registry.register(ItemInit.CROSSED_FIR_BARS);
        registry.register(ItemInit.CROSSED_REDWOOD_BARS);
        registry.register(ItemInit.CROSSED_CHERRY_BARS);
        registry.register(ItemInit.CROSSED_MAHOGANY_BARS);
        registry.register(ItemInit.CROSSED_JACARANDA_BARS);
        registry.register(ItemInit.CROSSED_PALM_BARS);
        registry.register(ItemInit.CROSSED_WILLOW_BARS);
        registry.register(ItemInit.CROSSED_DEAD_BARS);
        registry.register(ItemInit.CROSSED_MAGIC_BARS);
        registry.register(ItemInit.CROSSED_UMBRAN_BARS);
        registry.register(ItemInit.CROSSED_HELLBARK_BARS);
    }

    public static void registerHorizontalVanillaItems(IForgeRegistry<Item> registry)
    {
        registry.register(ItemInit.HORIZONTAL_IRON_BARS);
        registry.register(ItemInit.HORIZONTAL_GOLD_BARS);
        registry.register(ItemInit.HORIZONTAL_ACACIA_BARS);
        registry.register(ItemInit.HORIZONTAL_BIRCH_BARS);
        registry.register(ItemInit.HORIZONTAL_JUNGLE_BARS);
        registry.register(ItemInit.HORIZONTAL_OAK_BARS);
        registry.register(ItemInit.HORIZONTAL_DARK_OAK_BARS);
        registry.register(ItemInit.HORIZONTAL_SPRUCE_BARS);
    }

    public static void registerHorizontalCrossedVanillaItems(IForgeRegistry<Item> registry)
    {
        registry.register(ItemInit.HORIZONTAL_CROSSED_IRON_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_GOLD_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_ACACIA_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_BIRCH_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_JUNGLE_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_OAK_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_DARK_OAK_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_SPRUCE_BARS);
    }

    public static void registerHorizontalBOPItems(IForgeRegistry<Item> registry)
    {
        registry.register(ItemInit.HORIZONTAL_FIR_BARS);
        registry.register(ItemInit.HORIZONTAL_REDWOOD_BARS);
        registry.register(ItemInit.HORIZONTAL_CHERRY_BARS);
        registry.register(ItemInit.HORIZONTAL_MAHOGANY_BARS);
        registry.register(ItemInit.HORIZONTAL_JACARANDA_BARS);
        registry.register(ItemInit.HORIZONTAL_PALM_BARS);
        registry.register(ItemInit.HORIZONTAL_WILLOW_BARS);
        registry.register(ItemInit.HORIZONTAL_DEAD_BARS);
        registry.register(ItemInit.HORIZONTAL_MAGIC_BARS);
        registry.register(ItemInit.HORIZONTAL_UMBRAN_BARS);
        registry.register(ItemInit.HORIZONTAL_HELLBARK_BARS);
    }
    public static void registerHorizontalBOPCrossedItems(IForgeRegistry<Item> registry)
    {
        registry.register(ItemInit.HORIZONTAL_CROSSED_FIR_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_REDWOOD_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_CHERRY_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_MAHOGANY_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_JACARANDA_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_PALM_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_WILLOW_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_DEAD_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_MAGIC_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_UMBRAN_BARS);
        registry.register(ItemInit.HORIZONTAL_CROSSED_HELLBARK_BARS);
    }
}
