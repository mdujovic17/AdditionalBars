package com.codenamerevy.additionalbars.content.block;

import net.minecraft.block.DoorBlock;

public class BlockDoorBase extends DoorBlock
{
    protected BlockDoorBase(Properties builder) {
        super(builder.notSolid());
    }
}
