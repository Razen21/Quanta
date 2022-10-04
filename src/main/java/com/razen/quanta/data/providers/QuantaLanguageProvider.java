package com.razen.quanta.data.providers;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.razen.quanta.Quanta.ITEM_GROUP;
import static com.razen.quanta.Quanta.MODID;

public class QuantaLanguageProvider extends LanguageProvider {

    public QuantaLanguageProvider(DataGenerator gen, String locale) {
        super(gen, MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + MODID, "Quanta");
    }
}
