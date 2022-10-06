package com.razen.quanta.generation.particle;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import javax.annotation.ParametersAreNonnullByDefault;

public class EntangledParticleGeneration extends Feature<NoneFeatureConfiguration> {

    public EntangledParticleGeneration(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @ParametersAreNonnullByDefault
    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        return false;
    }
}
