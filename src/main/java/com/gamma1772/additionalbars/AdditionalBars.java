package com.gamma1772.additionalbars;

import com.gamma1772.additionalbars.content.block.OxidizableBarsBlock;
import com.gamma1772.additionalbars.registries.ABBlocks;
import com.gamma1772.additionalbars.registries.ABItems;
import com.gamma1772.additionalbars.tabs.CreativeGroup;
import com.gamma1772.additionalbars.tabs.HorizontalCreativeGroup;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("all")
@Mod("additionalbars")
@Mod.EventBusSubscriber(modid = AdditionalBars.MODID, bus = Bus.MOD)
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

//        ABBlocks.COPPER_BARS.get().setBlocks(null, ABBlocks.EXPOSED_COPPER_BARS.get(), ABBlocks.WAXED_COPPER_BARS.get());
//        ABBlocks.EXPOSED_COPPER_BARS.get().setBlocks(ABBlocks.COPPER_BARS.get(), ABBlocks.WEATHERED_COPPER_BARS.get(), ABBlocks.WAXED_EXPOSED_COPPER_BARS.get());
//        ABBlocks.WEATHERED_COPPER_BARS.get().setBlocks(ABBlocks.EXPOSED_COPPER_BARS.get(), ABBlocks.OXIDIZED_COPPER_BARS.get(), ABBlocks.WAXED_WEATHERED_COPPER_BARS.get());
//        ABBlocks.OXIDIZED_COPPER_BARS.get().setBlocks(ABBlocks.WEATHERED_COPPER_BARS.get(), null, ABBlocks.WAXED_OXIDIZED_COPPER_BARS.get());
    }

    @SubscribeEvent
    public static void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ABBlocks.COPPER_BARS.get().setBlocks(null, ABBlocks.EXPOSED_COPPER_BARS.get(), ABBlocks.WAXED_COPPER_BARS.get());
            ABBlocks.EXPOSED_COPPER_BARS.get().setBlocks(ABBlocks.COPPER_BARS.get(), ABBlocks.WEATHERED_COPPER_BARS.get(), ABBlocks.WAXED_EXPOSED_COPPER_BARS.get());
            ABBlocks.WEATHERED_COPPER_BARS.get().setBlocks(ABBlocks.EXPOSED_COPPER_BARS.get(), ABBlocks.OXIDIZED_COPPER_BARS.get(), ABBlocks.WAXED_WEATHERED_COPPER_BARS.get());
            ABBlocks.OXIDIZED_COPPER_BARS.get().setBlocks(ABBlocks.WEATHERED_COPPER_BARS.get(), null, ABBlocks.WAXED_OXIDIZED_COPPER_BARS.get());

            ABBlocks.CROSSED_COPPER_BARS.get().setBlocks(null, ABBlocks.CROSSED_EXPOSED_COPPER_BARS.get(), ABBlocks.WAXED_CROSSED_COPPER_BARS.get());
            ABBlocks.CROSSED_EXPOSED_COPPER_BARS.get().setBlocks(ABBlocks.CROSSED_COPPER_BARS.get(), ABBlocks.CROSSED_WEATHERED_COPPER_BARS.get(), ABBlocks.WAXED_CROSSED_EXPOSED_COPPER_BARS.get());
            ABBlocks.CROSSED_WEATHERED_COPPER_BARS.get().setBlocks(ABBlocks.CROSSED_EXPOSED_COPPER_BARS.get(), ABBlocks.CROSSED_OXIDIZED_COPPER_BARS.get(), ABBlocks.WAXED_CROSSED_WEATHERED_COPPER_BARS.get());
            ABBlocks.CROSSED_OXIDIZED_COPPER_BARS.get().setBlocks(ABBlocks.CROSSED_WEATHERED_COPPER_BARS.get(), null, ABBlocks.WAXED_CROSSED_OXIDIZED_COPPER_BARS.get());
        });
    }

}
