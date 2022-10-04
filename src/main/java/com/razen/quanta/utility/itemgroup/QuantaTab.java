package com.razen.quanta.utility.itemgroup;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import javax.lang.model.element.Name;

import static com.razen.quanta.Quanta.MODID;

public class QuantaTab extends CreativeModeTab {

    private ItemStack stack = ItemStack.EMPTY;
    public static QuantaTab DEFUALT = new QuantaTab(MODID, new ItemStack(Items.DIRT));

    public QuantaTab(String label) {
        super(label);
    }

    public QuantaTab(String label, ItemStack stack){
        super(label);
        this.stack = stack;
    }

    @MethodsReturnNonnullByDefault
    @Override
    public ItemStack makeIcon() {
        return stack;
    }


}
