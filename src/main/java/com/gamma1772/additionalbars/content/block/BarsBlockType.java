package com.gamma1772.additionalbars.content.block;

public enum BarsBlockType {
    HORIZONTAL("horizontal"),
    CROSSED("crossed");

    private final String translationKey;

    BarsBlockType(String translationKey) {
        this.translationKey = translationKey;
    }

    public String getTranslationKey() {
        return translationKey;
    }
}
