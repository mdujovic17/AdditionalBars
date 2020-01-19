package com.codenamerevy.additionalbars.util.handler;

import com.codenamerevy.additionalbars.content.block.BlockConditions;
import com.codenamerevy.additionalbars.content.item.ItemConditions;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler
{
    @SubscribeEvent
    public static void registerRecipeSerializers(RegistryEvent.Register<IRecipeSerializer<?>> event)
    {
        CraftingHelper.register(ItemConditions.Serializer.INSTANCE);
        CraftingHelper.register(BlockConditions.Serializer.INSTANCE);
    }
}
