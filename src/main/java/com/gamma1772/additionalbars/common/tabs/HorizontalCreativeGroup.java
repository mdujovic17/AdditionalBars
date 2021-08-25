package com.gamma1772.additionalbars.common.tabs;

import com.gamma1772.additionalbars.common.registry.ABBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class HorizontalCreativeGroup extends ItemGroup
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
