package com.gamma1772.additionalbars.content.block;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

public interface BlockType {
    String getType();
    Component getText();
    ChatFormatting getTextColor();
}
