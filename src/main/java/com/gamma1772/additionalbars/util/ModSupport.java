package com.gamma1772.additionalbars.util;

import net.minecraft.util.StringRepresentable;
import net.minecraftforge.fml.ModList;

public enum ModSupport implements StringRepresentable {
    BOP("biomesoplenty"),
    BYG("byg"),
    CORAIL("corail_woodcutter"),
    QUARK("quark"),
    SUPPLEMENTARIES("supplementaries");

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
    public String getSerializedName() {
        return MODID;
    }
}
