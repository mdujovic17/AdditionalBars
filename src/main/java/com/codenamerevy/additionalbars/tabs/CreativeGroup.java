package com.codenamerevy.additionalbars.tabs;

import com.codenamerevy.additionalbars.registries.ABBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeGroup extends CreativeModeTab
{
    public CreativeGroup(String label)
    {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ABBlocks.GOLD_BARS.get());
    }
}
