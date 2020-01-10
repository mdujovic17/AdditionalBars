package com.codenamerevy.additionalbars.util;

import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ref
{
    public static final String MODID = "additionalbars";
    public static final String NAME = "Additional Bars";
    public static final String VERSION = "1.0.2";

    public static final Logger LOGGER = LogManager.getLogger();

    //Resource Location
    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(MODID, name);
    }
}
