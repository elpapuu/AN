package net.rawr.ANTeam.ancientnature.common.worldgen;

import net.minecraft.core.HolderSet;
 import net.minecraft.core.registries.Registries;
 import net.minecraft.data.worldgen.BootstrapContext;
 import net.minecraft.resources.ResourceKey;
 import net.minecraft.resources.ResourceLocation;
 import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
 import net.neoforged.neoforge.common.world.BiomeModifier;
 import net.neoforged.neoforge.common.world.BiomeModifiers;
 import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.rawr.ANTeam.ancientnature.AncientNature;

public class ModBiomeModifiers {
     public static final ResourceKey<BiomeModifier> ADD_AMBER_ORE = registerKey("add_amber_ore");
     public static final ResourceKey<BiomeModifier> ADD_LIMESTONE = registerKey("add_limestone");


     public static void bootstrap(BootstrapContext<BiomeModifier> context) {
         // CF -> PF -> BM
         var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
         var biomes = context.lookup(Registries.BIOME);
 
         context.register(ADD_AMBER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.AMBER_ORE_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_LIMESTONE, new BiomeModifiers.AddFeaturesBiomeModifier(
                 HolderSet.direct(biomes.getOrThrow(Biomes.RIVER), biomes.getOrThrow(Biomes.OCEAN), biomes.getOrThrow(Biomes.FROZEN_RIVER), biomes.getOrThrow(Biomes.LUKEWARM_OCEAN), biomes.getOrThrow(Biomes.WARM_OCEAN)),
                 HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LIMESTONE_PLACED_KEY)),
                 GenerationStep.Decoration.RAW_GENERATION));

     }
 
     private static ResourceKey<BiomeModifier> registerKey(String name) {
         return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(AncientNature.MODID, name));
     }
 }