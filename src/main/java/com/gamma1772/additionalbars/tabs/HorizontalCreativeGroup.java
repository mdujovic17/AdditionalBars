package com.gamma1772.additionalbars.tabs;

import com.gamma1772.additionalbars.registries.ABBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class HorizontalCreativeGroup extends CreativeModeTab
{
    public HorizontalCreativeGroup(String label)
    {
        super(label);
    }
    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(ABBlocks.HORIZONTAL_GOLD_BARS.get());
    }
}
