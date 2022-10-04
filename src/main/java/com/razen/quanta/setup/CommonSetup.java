package com.razen.quanta.setup;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static com.razen.quanta.Quanta.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonSetup {

    public static void init(FMLClientSetupEvent event) {

        event.enqueueWork(() -> {

        });

    }

    public static void setup() {
        registerEvents();

    }

    private static void registerEvents() {
        IEventBus bus = MinecraftForge.EVENT_BUS;


    }
}
