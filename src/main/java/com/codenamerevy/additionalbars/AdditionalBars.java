package com.codenamerevy.additionalbars;

import com.codenamerevy.additionalbars.init.BlockInit;
import com.codenamerevy.additionalbars.tabs.CreativeGroup;
import com.codenamerevy.additionalbars.util.Ref;
import com.codenamerevy.additionalbars.util.handler.BlockRegistryHandler;
import com.codenamerevy.additionalbars.util.handler.ItemRegistryHandler;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Ref.MODID)
public class AdditionalBars
{
    public static final ItemGroup ADDITIONAL_BARS = new CreativeGroup("additionalBars");

    public AdditionalBars()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.addListener(ItemRegistryHandler::onItemRegistry);
        MinecraftForge.EVENT_BUS.addListener(BlockRegistryHandler::onBlockRegistry);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new ItemRegistryHandler());
        MinecraftForge.EVENT_BUS.register(new BlockRegistryHandler());
    }
    private void clientSetup(final FMLClientSetupEvent event)
    {
        RenderType cutout = RenderType.func_228643_e_();

        RenderTypeLookup.setRenderLayer(BlockInit.GOLD_BARS, cutout);
        RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BARS, cutout);
        RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BARS, cutout);
        RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BARS, cutout);
        RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BARS, cutout);
        RenderTypeLookup.setRenderLayer(BlockInit.OAK_BARS, cutout);
        RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BARS, cutout);
    }
}
