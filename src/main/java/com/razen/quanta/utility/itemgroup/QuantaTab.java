package com.razen.quanta.utility.itemgroup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class QuantaTab extends CreativeModeTab {

    private ItemStack stack = ItemStack.EMPTY;

    public QuantaTab(String label) {
        super(label);
    }

    public QuantaTab(String label, ItemStack stack){
        super(label);
        this.stack = stack;
    }

    @Override
    public ItemStack makeIcon() {
        return stack;
    }


}
