package com.gamma1772.additionalbars.api.item;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomBlockItem extends BlockItem {
    private ArrayList<ItemBlockType> types;

    /**
     * Creates a custom BlockItem with a variable array of ItemBlockType enums
     * */
    public CustomBlockItem(Block block, Properties properties, @Nullable ItemBlockType... types) {
        super(block, properties);
        if (types != null) {
            this.types = new ArrayList<>();
            this.types.addAll(Arrays.stream(types).toList());
        }
        else {
            this.types = null;
        }
    }

    /**
     * Adds item tooltips based on one or more defined BlockTypes
     * */
    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> textList, ITooltipFlag tooltip) {
        super.appendHoverText(stack, world, textList, tooltip);
        if (!types.isEmpty() && types != null) {
            for (ItemBlockType type : types) {
                textList.add(new TranslationTextComponent(type.getTranslatableText()).withStyle(TextFormatting.GREEN));
            }
        }
    }
}
