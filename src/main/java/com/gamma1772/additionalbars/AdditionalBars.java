package com.gamma1772.additionalbars;

import com.gamma1772.additionalbars.registries.ABBlocks;
import com.gamma1772.additionalbars.registries.ABItems;
import com.gamma1772.additionalbars.tabs.CreativeGroup;
import com.gamma1772.additionalbars.tabs.HorizontalCreativeGroup;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("all")
@Mod("additionalbars")
public class AdditionalBars
{
    public static final String MODID = "additionalbars";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final CreativeModeTab ADDITIONAL_BARS = new CreativeGroup("additionalBars");
    public static final CreativeModeTab HORIZONTAL_ADDITIONAL_BARS = new HorizontalCreativeGroup("horizontaladditionalbars");

    public AdditionalBars()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ABBlocks.BLOCKS.register(modEventBus);
        ABItems.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
