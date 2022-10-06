package com.razen.quanta.setup.registry;

import com.razen.quanta.blocks.machines.machinebase.MachineBaseBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.Objects;

import static com.razen.quanta.Quanta.ITEM_GROUP;
import static com.razen.quanta.Quanta.MODID;

public class QuantaRegistry {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties
            .of(Material.STONE)
            .strength(2f);

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ITEM_GROUP);


    public static void registerDeferredRegistries() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }

    public static final RegistryObject<Block> MACHINE_BASE = BLOCKS.register("machine_base", MachineBaseBlock::new);
    public static final RegistryObject<Item> MACHINE_BASE_ITEM = fromBlock(MACHINE_BASE);








}
