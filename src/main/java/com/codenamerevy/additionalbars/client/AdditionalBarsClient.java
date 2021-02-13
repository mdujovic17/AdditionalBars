package com.codenamerevy.additionalbars.client;

import com.codenamerevy.additionalbars.common.AdditionalBars;
import com.codenamerevy.additionalbars.common.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class AdditionalBarsClient
{
    public AdditionalBarsClient()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        AdditionalBars.LOGGER.debug("[ADDITIONAL BARS] Doing client stuff...");
        //Vanilla
        RenderTypeLookup.setRenderLayer(BlockInit.TEST.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(BlockInit.GOLD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.WARPED_BARS.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_IRON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_GOLD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_ACACIA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_BIRCH_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_JUNGLE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_DARK_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_SPRUCE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_CRIMSON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_WARPED_BARS.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_IRON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_GOLD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_ACACIA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_BIRCH_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_DARK_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_JUNGLE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_SPRUCE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CRIMSON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_WARPED_BARS.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_IRON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_GOLD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_ACACIA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_BIRCH_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_JUNGLE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_DARK_OAK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_SPRUCE_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_CRIMSON_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_WARPED_BARS.get(), RenderType.getCutout());

        //BOP
        RenderTypeLookup.setRenderLayer(BlockInit.FIR_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.REDWOOD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CHERRY_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MAHOGANY_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.JACARANDA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PALM_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.WILLOW_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.DEAD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MAGIC_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.UMBRAN_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HELLBARK_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_FIR_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_REDWOOD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_CHERRY_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_MAHOGANY_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_JACARANDA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_PALM_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_WILLOW_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_DEAD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_MAGIC_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_UMBRAN_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_HELLBARK_BARS.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_FIR_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_REDWOOD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CHERRY_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_MAHOGANY_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_JACARANDA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_PALM_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_WILLOW_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_DEAD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_MAGIC_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_UMBRAN_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_HELLBARK_BARS.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_FIR_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_REDWOOD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_CHERRY_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_MAHOGANY_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_JACARANDA_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_PALM_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_WILLOW_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_DEAD_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_MAGIC_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_UMBRAN_BARS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_HELLBARK_BARS.get(), RenderType.getCutout());
    }
}
