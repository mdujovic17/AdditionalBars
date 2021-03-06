package com.codenamerevy.additionalbars.common.tabs;

import com.codenamerevy.additionalbars.common.registry.ABBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class HorizontalCreativeGroup extends ItemGroup
{
    public HorizontalCreativeGroup(String label)
    {
        super(label);
    }
    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ABBlocks.HORIZONTAL_GOLD_BARS.get());
    }
}
