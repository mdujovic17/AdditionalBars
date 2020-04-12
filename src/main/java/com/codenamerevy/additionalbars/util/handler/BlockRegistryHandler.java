package com.codenamerevy.additionalbars.util.handler;

import com.codenamerevy.additionalbars.config.Config;
import com.codenamerevy.additionalbars.init.BlockInit;
import com.codenamerevy.additionalbars.util.ModSupport;
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
        registerDevBlocks(event.getRegistry());
        registerBlocks(event.getRegistry());
        registerCrossedVanillaBlocks(event.getRegistry());
        if(ModSupport.BOP.isLoaded() && Config.CategoryGeneral.BOPSupport.get()) {
            registerBOPBlocks(event.getRegistry());
            registerBOPCrossedBlocks(event.getRegistry());
        }
    }
    public static void registerDevBlocks(IForgeRegistry<Block> registry)
    {
        registry.register(BlockInit.DEV_HORIZONTAL_BARS);
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

    public static void registerCrossedVanillaBlocks(IForgeRegistry<Block> registry)
    {
        registry.register(BlockInit.CROSSED_IRON_BARS);
        registry.register(BlockInit.CROSSED_GOLD_BARS);
        registry.register(BlockInit.CROSSED_ACACIA_BARS);
        registry.register(BlockInit.CROSSED_BIRCH_BARS);
        registry.register(BlockInit.CROSSED_JUNGLE_BARS);
        registry.register(BlockInit.CROSSED_OAK_BARS);
        registry.register(BlockInit.CROSSED_DARK_OAK_BARS);
        registry.register(BlockInit.CROSSED_SPRUCE_BARS);
    }

    public static void registerBOPBlocks(IForgeRegistry<Block> registry)
    {
        registry.register(BlockInit.FIR_BARS);
        registry.register(BlockInit.REDWOOD_BARS);
        registry.register(BlockInit.CHERRY_BARS);
        registry.register(BlockInit.MAHOGANY_BARS);
        registry.register(BlockInit.JACARANDA_BARS);
        registry.register(BlockInit.PALM_BARS);
        registry.register(BlockInit.WILLOW_BARS);
        registry.register(BlockInit.DEAD_BARS);
        registry.register(BlockInit.MAGIC_BARS);
        registry.register(BlockInit.UMBRAN_BARS);
        registry.register(BlockInit.HELLBARK_BARS);
    }

    public static void registerBOPCrossedBlocks(IForgeRegistry<Block> registry)
    {
        registry.register(BlockInit.CROSSED_FIR_BARS);
        registry.register(BlockInit.CROSSED_REDWOOD_BARS);
        registry.register(BlockInit.CROSSED_CHERRY_BARS);
        registry.register(BlockInit.CROSSED_MAHOGANY_BARS);
        registry.register(BlockInit.CROSSED_JACARANDA_BARS);
        registry.register(BlockInit.CROSSED_PALM_BARS);
        registry.register(BlockInit.CROSSED_WILLOW_BARS);
        registry.register(BlockInit.CROSSED_DEAD_BARS);
        registry.register(BlockInit.CROSSED_MAGIC_BARS);
        registry.register(BlockInit.CROSSED_UMBRAN_BARS);
        registry.register(BlockInit.CROSSED_HELLBARK_BARS);
    }
}
