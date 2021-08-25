package com.gamma1772.additionalbars.api.item;

/**
 * Enumerator for possible types of blocks
 * This is a predefined set of enums, so it should only be used internally.
 * For creating custom types, override {@link CustomBlockItem#appendHoverText appendHoverText} for using custom enum types*/
public enum ItemBlockType {
    CROSSED("additionalbars.type.crossed"),
    HORIZONTAL("additionalbars.type.horizontal"),
    HALF("additionalbars.type.half");

    private String translatableText;

    ItemBlockType(String translatableText) {
        this.translatableText = translatableText;
    }

    public String getTranslatableText() {
        return translatableText;
    }
}
