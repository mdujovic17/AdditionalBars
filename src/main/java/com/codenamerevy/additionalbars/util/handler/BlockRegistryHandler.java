package com.codenamerevy.additionalbars.util.handler;

import com.codenamerevy.additionalbars.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BlockRegistryHandler
{
    @SubscribeEvent
    public static void onBlockRegistry(final RegistryEvent.Register<Block> event)
    {
        BlockInit.blockRegistry(event.getRegistry());
    }
}
