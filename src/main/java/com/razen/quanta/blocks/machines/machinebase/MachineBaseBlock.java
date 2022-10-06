package com.razen.quanta.blocks.machines.machinebase;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;


public class MachineBaseBlock extends Block {


    public MachineBaseBlock() {
        super(Properties.of(Material.METAL)
                .sound(SoundType.METAL)
                .strength(4.0f));
    }


}
