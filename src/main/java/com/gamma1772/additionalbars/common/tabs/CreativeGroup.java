package com.gamma1772.additionalbars.common.tabs;

import com.gamma1772.additionalbars.common.registry.ABBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeGroup extends ItemGroup
{
    public CreativeGroup(String label)
    {
        super(label);
    }
    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(ABBlocks.GOLD_BARS.get());
    }
}
