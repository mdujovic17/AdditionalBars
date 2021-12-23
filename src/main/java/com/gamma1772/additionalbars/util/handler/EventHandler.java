package com.gamma1772.additionalbars.util.handler;

import com.gamma1772.additionalbars.content.block.BlockConditions;
import com.gamma1772.additionalbars.content.item.ItemConditions;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler
{
    @SubscribeEvent
    public static void registerRecipeSerializers(RegistryEvent.Register<RecipeSerializer<?>> event)
    {
        CraftingHelper.register(ItemConditions.Serializer.INSTANCE);
        CraftingHelper.register(BlockConditions.Serializer.INSTANCE);
    }
}
