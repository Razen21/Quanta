package com.razen.quanta.data;

import com.razen.quanta.data.providers.QuantaLanguageProvider;
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
        configureServerProviders(event);
        configureClientProviders(event);
    }

    private static void configureClientProviders(GatherDataEvent event) {
        generator.addProvider(event.includeClient(), new QuantaLanguageProvider(generator, "en_us"));
    }

    private static void configureServerProviders(GatherDataEvent event) {

    }
}
