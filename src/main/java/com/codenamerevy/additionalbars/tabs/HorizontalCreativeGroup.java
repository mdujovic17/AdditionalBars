package com.codenamerevy.additionalbars.tabs;

import com.codenamerevy.additionalbars.init.BlockInit;
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
        return new ItemStack(BlockInit.HORIZONTAL_GOLD_BARS);
    }
}
