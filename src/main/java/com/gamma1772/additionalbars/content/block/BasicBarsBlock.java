package com.gamma1772.additionalbars.content.block;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.IronBarsBlock;

import java.util.ArrayList;
import java.util.List;

public class BasicBarsBlock extends IronBarsBlock {

    private final ArrayList<String> blockTypes = new ArrayList<>();

    public BasicBarsBlock(Properties properties) {
        super(properties);
    }

    public BasicBarsBlock(Properties properties, BlockType... types) {
        super(properties);

        if (types.length != 0) {
            for (BlockType type : types) {
                blockTypes.add(type.getText());
            }
        }
    }

    @Override
    public void appendHoverText(ItemStack stack, @org.jetbrains.annotations.Nullable BlockGetter getter, List<Component> tooltips, TooltipFlag flag) {
        if (!blockTypes.isEmpty()) {
            for ( String type : blockTypes) {
                if (type.equals("oxidizing") || type.equals("waxed")) {
                    tooltips.add(new TranslatableComponent("tooltip.gamma1772." + type).withStyle(ChatFormatting.AQUA));
                }
                else if (!type.equals("regular")){
                    if (!type.equals("nether")) {
                        tooltips.add(new TranslatableComponent("tooltip.gamma1772." + type).withStyle(ChatFormatting.GREEN));
                    }
                    else {
                        tooltips.add(new TranslatableComponent("tooltip.gamma1772." + type).withStyle(ChatFormatting.DARK_RED));
                    }
                }
                else {
                    tooltips.add(new TranslatableComponent("tooltip.gamma1772." + type).withStyle(ChatFormatting.GRAY));
                }
            }
        }
    }
}
