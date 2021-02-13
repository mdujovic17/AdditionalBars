package com.codenamerevy.additionalbars.common.util;

import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.ModList;

public enum ModSupport implements IStringSerializable {
    BOP("biomesoplenty"),
    BYG("byg"),
    CORAIL("corail_woodcutter"),
    QUARK("quark");

    private final String MODID;
    private final boolean LOADED;

    ModSupport(String modid)
    {
        this.MODID = modid;
        this.LOADED = ModList.get() != null && ModList.get().getModContainerById(modid).isPresent();
    }

    public boolean isLoaded()
    {
        return LOADED;
    }

    @Override
    public String getString() {
        return MODID;
    }
}
