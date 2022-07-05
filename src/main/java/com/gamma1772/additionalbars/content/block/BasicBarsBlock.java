package com.gamma1772.additionalbars.content.block;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.IronBarsBlock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicBarsBlock extends IronBarsBlock {
    protected ArrayList<BlockType> barsTypes = new ArrayList<>();

    public BasicBarsBlock(Properties properties) {
        super(properties);
    }

    public BasicBarsBlock(Properties properties, BlockType... types) {
        super(properties);
        barsTypes.addAll(Arrays.stream(types).toList());
    }

    @Override
    public void appendHoverText(ItemStack stack, @org.jetbrains.annotations.Nullable BlockGetter getter, List<Component> tooltips, TooltipFlag flag) {
        for ( BlockType type : barsTypes) {
            tooltips.add(Component.translatable(type.getText().getString()).withStyle(type.getTextColor()));
        }
    }
}
