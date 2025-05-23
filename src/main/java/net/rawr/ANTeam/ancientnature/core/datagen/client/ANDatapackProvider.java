package net.rawr.ANTeam.ancientnature.core.datagen.client;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.common.worldgen.ANBiomeModifiers;
import net.rawr.ANTeam.ancientnature.common.worldgen.ANConfiguredFeatures;
import net.rawr.ANTeam.ancientnature.common.worldgen.ANPlacedFeatures;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ANDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()

            .add(Registries.CONFIGURED_FEATURE, ANConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ANPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ANBiomeModifiers::bootstrap);

    public ANDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(AncientNature.MOD_ID));
    }
}