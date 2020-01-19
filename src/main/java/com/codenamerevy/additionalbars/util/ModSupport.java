package com.codenamerevy.additionalbars.util;

import com.codenamerevy.additionalbars.config.Config;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.ModList;

public enum ModSupport implements IStringSerializable {
    BOP("biomesoplenty"),
    CORAIL("corail_woodcutter");

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
    public String getName() {
        return MODID;
    }
}
