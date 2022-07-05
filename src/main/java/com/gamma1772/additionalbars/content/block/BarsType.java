package com.gamma1772.additionalbars.content.block;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

public enum BarsType implements BlockType {
    REGULAR("regular", ChatFormatting.GRAY), CROSSED("crossed", ChatFormatting.GREEN), HORIZONTAL("horizontal", ChatFormatting.GREEN),
    WOOD("wood", ChatFormatting.GOLD), METAL("metal", ChatFormatting.GOLD), CRYSTAL("crystal", ChatFormatting.GOLD), BRICK("brick", ChatFormatting.GOLD),
    OXIDIZING("oxidizing", ChatFormatting.AQUA),
    WAXED("waxed", ChatFormatting.AQUA),
    NETHER("nether", ChatFormatting.DARK_RED);

    private final String type;
    private final ChatFormatting color;
    private final Component text;
    BarsType(String type, ChatFormatting color) {
        this.type = type;
        this.text = Component.translatable("tooltip.gamma1772." + type);
        this.color = color;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Component getText() {
        return text;
    }

    @Override
    public ChatFormatting getTextColor() {
        return color;
    }
}
