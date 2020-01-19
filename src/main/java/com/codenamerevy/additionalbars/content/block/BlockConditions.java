package com.codenamerevy.additionalbars.content.block;

import com.codenamerevy.additionalbars.config.Config;
import com.codenamerevy.additionalbars.util.Ref;
import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class BlockConditions implements ICondition
{
    public static final ResourceLocation NAME = new ResourceLocation(Ref.MODID, "blocks");
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
    public boolean test() {
        if(OBJECT.equals("BOPSupport"))     return Config.CategoryGeneral.BOPSupport.get();
        if(OBJECT.equals("corailSupport"))     return Config.CategoryGeneral.corailSupport.get();
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
