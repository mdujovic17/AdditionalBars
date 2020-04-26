package com.codenamerevy.additionalbars;

import com.codenamerevy.additionalbars.init.BlockInit;
import com.codenamerevy.additionalbars.tabs.CreativeGroup;
import com.codenamerevy.additionalbars.tabs.HorizontalCreativeGroup;
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

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *                                                                   *
 *   TODO #1: Find a fix for the clusterfuck in models resources.    *
 *                                                                   *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

//TODO #2: Make some of the Horizontal bars orientable (Related to #1)

@SuppressWarnings("all")
@Mod(Ref.MODID)
public class AdditionalBars
{
    public static final ItemGroup ADDITIONAL_BARS = new CreativeGroup("additionalBars");
    public static final ItemGroup HORIZONTAL_ADDITIONAL_BARS = new HorizontalCreativeGroup("horizontaladditionalbars");

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
        //Dev
        RenderTypeLookup.setRenderLayer(BlockInit.DEV_HORIZONTAL_BARS, RenderType.getCutout());

        //Vanilla
        RenderTypeLookup.setRenderLayer(BlockInit.GOLD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.OAK_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_BARS, RenderType.getCutout());

        //Crossed Vanilla
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_IRON_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_GOLD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_ACACIA_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_BIRCH_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_JUNGLE_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_OAK_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_DARK_OAK_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_SPRUCE_BARS, RenderType.getCutout());

        //BOP
        RenderTypeLookup.setRenderLayer(BlockInit.FIR_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.REDWOOD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CHERRY_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MAHOGANY_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.JACARANDA_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.PALM_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.WILLOW_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.DEAD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.MAGIC_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.UMBRAN_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HELLBARK_BARS, RenderType.getCutout());

        //Crossed BOP
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_FIR_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_REDWOOD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_CHERRY_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_MAHOGANY_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_JACARANDA_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_PALM_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_WILLOW_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_DEAD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_MAGIC_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_UMBRAN_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CROSSED_HELLBARK_BARS, RenderType.getCutout());

        /*************
         * HORIZONTAL*
         * BARS      *
         *************/

        //Vanilla
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_IRON_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_GOLD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_ACACIA_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_BIRCH_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_DARK_OAK_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_JUNGLE_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_OAK_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_SPRUCE_BARS, RenderType.getCutout());

        //Crossed Vanilla
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_IRON_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_GOLD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_ACACIA_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_BIRCH_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_JUNGLE_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_OAK_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_DARK_OAK_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_SPRUCE_BARS, RenderType.getCutout());

        //BOP
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_FIR_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_REDWOOD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CHERRY_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_MAHOGANY_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_JACARANDA_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_PALM_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_WILLOW_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_DEAD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_MAGIC_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_UMBRAN_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_HELLBARK_BARS, RenderType.getCutout());

        //Crossed BOP
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_FIR_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_REDWOOD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_CHERRY_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_MAHOGANY_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_JACARANDA_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_PALM_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_WILLOW_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_DEAD_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_MAGIC_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_UMBRAN_BARS, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.HORIZONTAL_CROSSED_HELLBARK_BARS, RenderType.getCutout());
    }
}
