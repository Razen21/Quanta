package com.razen.quanta.data.providers;

import com.razen.quanta.setup.registry.QuantaRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.razen.quanta.Quanta.MODID;

public class QuantaBlockStateProvider extends BlockStateProvider {

    public QuantaBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(QuantaRegistry.MACHINE_BASE.get());
    }
}
