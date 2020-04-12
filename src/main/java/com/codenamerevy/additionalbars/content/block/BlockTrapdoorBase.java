package com.codenamerevy.additionalbars.content.block;

import net.minecraft.block.TrapDoorBlock;

public class BlockTrapdoorBase extends TrapDoorBlock
{
    protected BlockTrapdoorBase(Properties properties) {
        super(properties.notSolid());
    }
}
