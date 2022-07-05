package com.gamma1772.additionalbars;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = AdditionalBars.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdditionalBarsClient
{
    public AdditionalBarsClient()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //modEventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event)
    {
        //AdditionalBars.LOGGER.debug("\n---------------------------------------\n[ADDITIONAL BARS] Doing client stuff...\n---------------------------------------\n");
        //Vanilla
        //ItemBlockRenderTypes.setRenderLayer(ABBlocks.TEST.get(), RenderType.cutout());

//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.GOLD_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.ACACIA_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.BIRCH_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.DARK_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.JUNGLE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.SPRUCE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.CRIMSON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.WARPED_BARS.get(), RenderType.cutout());
//
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.CROSSED_IRON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.CROSSED_GOLD_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.CROSSED_ACACIA_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.CROSSED_BIRCH_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.CROSSED_JUNGLE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.CROSSED_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.CROSSED_DARK_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.CROSSED_SPRUCE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.CROSSED_CRIMSON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.CROSSED_WARPED_BARS.get(), RenderType.cutout());
//
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_IRON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_GOLD_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_ACACIA_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_BIRCH_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_DARK_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_JUNGLE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_SPRUCE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_CRIMSON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_WARPED_BARS.get(), RenderType.cutout());
//
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_IRON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_GOLD_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_ACACIA_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_BIRCH_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_JUNGLE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_DARK_OAK_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_SPRUCE_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_CRIMSON_BARS.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ABBlocks.HORIZONTAL_CROSSED_WARPED_BARS.get(), RenderType.cutout());
    }
}
