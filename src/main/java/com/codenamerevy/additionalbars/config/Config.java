package com.codenamerevy.additionalbars.config;

import com.codenamerevy.additionalbars.util.Ref;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.fml.config.ModConfig;

import static net.minecraftforge.fml.Logging.CORE;
import static net.minecraftforge.fml.loading.LogMarkers.FORGEMOD;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final Builder CLIENT_BUILDER = new Builder();

    public static final CategoryGeneral GENERAL = new CategoryGeneral();

    public static final class CategoryGeneral
    {
        public static ForgeConfigSpec.BooleanValue BOPSupport;
        public static ForgeConfigSpec.BooleanValue corailSupport;

        private CategoryGeneral()
        {
            CLIENT_BUILDER.comment("General Settings").push("GENERAL");

            CLIENT_BUILDER.comment("BOP Mod support");
            BOPSupport = CLIENT_BUILDER.comment("Enable Biomes O' Plenty mod support.")
                    .translation("additionalbars.config.BOP")
                    .define("BOPSupport", true);

            CLIENT_BUILDER.comment("Corail Woodcutter Mod support");
            corailSupport = CLIENT_BUILDER.comment("Enable Corail Woodcutter mod support.")
                    .translation("additionalbars.config.corail")
                    .define("corailSupport", true);

            CLIENT_BUILDER.pop();
        }
    }

    public static final ForgeConfigSpec CLIENT_CONFIG = CLIENT_BUILDER.build();

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {
        Ref.LOGGER.debug(FORGEMOD, "Loaded {} config file {}", Ref.MODID, configEvent.getConfig().getFileName());
    }

    @SubscribeEvent
    public static void onFileChange(final ModConfig.Reloading configEvent) {
        Ref.LOGGER.fatal(CORE, "{} config just got changed on the file system!", Ref.MODID);
    }
}