package com.razen.quanta.data.providers;

import com.razen.quanta.setup.registry.QuantaRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.razen.quanta.Quanta.MODID;

public class QuantaItemModelProvider extends ItemModelProvider {

    public QuantaItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


        withExistingParent(QuantaRegistry.MACHINE_BASE_ITEM.getId().getPath(), modLoc("block/machine_base"));
    }
}
