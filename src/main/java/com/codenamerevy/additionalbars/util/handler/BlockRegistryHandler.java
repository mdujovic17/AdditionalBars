package com.codenamerevy.additionalbars.util.handler;

import com.codenamerevy.additionalbars.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistryHandler
{
    @SubscribeEvent
    public static void onBlockRegistry(final RegistryEvent.Register<Block> event)
    {
        registerBlocks(event.getRegistry());
    }

    public static void registerBlocks(IForgeRegistry<Block> registry)
    {
        registry.register(BlockInit.GOLD_BARS);
        registry.register(BlockInit.ACACIA_BARS);
        registry.register(BlockInit.BIRCH_BARS);
        registry.register(BlockInit.JUNGLE_BARS);
        registry.register(BlockInit.OAK_BARS);
        registry.register(BlockInit.DARK_OAK_BARS);
        registry.register(BlockInit.SPRUCE_BARS);
    }
}
