package com.codenamerevy.additionalbars.util.handler;

import com.codenamerevy.additionalbars.init.ItemInit;
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
}
