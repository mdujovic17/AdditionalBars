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
        registerItems(event.getRegistry());
        if(ModSupport.BOP.isLoaded() && Config.CategoryGeneral.BOPSupport.get()) {
            registerBOPItems(event.getRegistry());
        }
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
}
