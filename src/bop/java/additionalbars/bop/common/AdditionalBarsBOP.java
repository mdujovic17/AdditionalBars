package additionalbars.bop.common;

import com.codenamerevy.additionalbars.common.AdditionalBars;
import com.codenamerevy.additionalbars.common.registry.ABBlocks;
import com.codenamerevy.additionalbars.common.registry.ABItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class AdditionalBarsBOP {
	public static final String MODID = "additionalbarsbop";

	public AdditionalBarsBOP() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ABBlocks.BOP_BLOCKS.register(modEventBus);
		ABItems.BOP_ITEMS.register(modEventBus);

		MinecraftForge.EVENT_BUS.register(this);

		AdditionalBars.LOGGER.info("Additional Bars - Biomes o' Plenty Addon has successfully loaded!");
	}
}
