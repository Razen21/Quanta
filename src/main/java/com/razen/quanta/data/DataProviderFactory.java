package com.razen.quanta.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.razen.quanta.Quanta.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataProviderFactory {

    private static DataGenerator generator;

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        generator = event.getGenerator();
        configureServerProviders();
        configureClientProviders();
    }

    private static void configureClientProviders() {

    }

    private static void configureServerProviders() {

    }
}
