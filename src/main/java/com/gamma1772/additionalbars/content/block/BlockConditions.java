package com.gamma1772.additionalbars.content.block;

import com.gamma1772.additionalbars.AdditionalBars;
import com.gamma1772.additionalbars.util.ModSupport;
import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class BlockConditions implements ICondition
{
    public static final ResourceLocation NAME = new ResourceLocation(AdditionalBars.MODID, "blocks");
    public static String OBJECT;

    public BlockConditions(String object)
    {
        this.OBJECT = object;
    }

    @Override
    public ResourceLocation getID() {
        return NAME;
    }

    @Override
    public boolean test(IContext context) {
        if(OBJECT.equals("BOP"))        return ModSupport.BOP.isLoaded();
        if(OBJECT.equals("BYG"))        return ModSupport.BYG.isLoaded();
        if(OBJECT.equals("Corail"))     return ModSupport.CORAIL.isLoaded();
        if(OBJECT.equals("Quark"))      return ModSupport.QUARK.isLoaded();
        if(OBJECT.equals("supplementaries")) return ModSupport.SUPPLEMENTARIES.isLoaded();


        if(OBJECT.equals("BOPNOT"))        return !ModSupport.BOP.isLoaded();
        if(OBJECT.equals("CorailNOT"))     return !ModSupport.CORAIL.isLoaded();
        if(OBJECT.equals("QuarkNOT"))      return !ModSupport.QUARK.isLoaded();
        if(OBJECT.equals("supplementariesNOT")) return !ModSupport.SUPPLEMENTARIES.isLoaded();
        return false;
    }

    public static class Serializer implements IConditionSerializer<BlockConditions> {
        public static final BlockConditions.Serializer INSTANCE = new BlockConditions.Serializer();

        @Override
        public void write(JsonObject json, BlockConditions value) {

        }

        @Override
        public BlockConditions read(JsonObject json) {
            return new BlockConditions(json.get("object").getAsString());
        }

        @Override
        public ResourceLocation getID() {
            return NAME;
        }
    }
}
