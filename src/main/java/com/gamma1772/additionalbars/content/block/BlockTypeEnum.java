package com.gamma1772.additionalbars.content.block;

public enum BlockTypeEnum implements BlockType {
    REGULAR("regular"), HORIZONTAL("horizontal"), CROSSED("crossed"), OXIDIZING("oxidizing"), WAXED("waxed"), NETHER("nether");

    private final String text;

    BlockTypeEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
