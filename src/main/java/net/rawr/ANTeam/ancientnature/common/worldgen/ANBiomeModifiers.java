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

public class ANBiomeModifiers {
     public static final ResourceKey<BiomeModifier> ADD_AMBER_ORE = registerKey("add_amber_ore");
     public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_AMBER_ORE = registerKey("add_deepslate_amber_ore");
     public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_CAMBRIAN_FOSSILS = registerKey("add_deepslate_cambrian_fossils");
     public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_ORDOVICIAN_FOSSILS= registerKey("add_deepslate_ordovician_fossils");
     public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_DEVONIAN_FOSSILS = registerKey("add_deepslate_devonian_fossils");
     public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_CARBONIFEROUS_FOSSILS = registerKey("add_deepslate_carboniferous_fossils");
     public static final ResourceKey<BiomeModifier> ADD_PERMIAN_FOSSILS = registerKey("add_permian_fossils");
     public static final ResourceKey<BiomeModifier> ADD_CRETACEOUS_FOSSILS = registerKey("add_cretaceous_fossils");
     public static final ResourceKey<BiomeModifier> ADD_PLEISTOCENE_FOSSILS = registerKey("add_pleistocene_fossils");
     public static final ResourceKey<BiomeModifier> ADD_HOLOCENE_FOSSILS = registerKey("add_holocene_fossils");
     public static final ResourceKey<BiomeModifier> ADD_LIMESTONE_FOSSILS = registerKey("add_limestone_fossils");
     public static final ResourceKey<BiomeModifier> ADD_LIMESTONE = registerKey("add_limestone");

    public static final ResourceKey<BiomeModifier> ADD_GINKGO = registerKey("add_ginkgo");
    public static final ResourceKey<BiomeModifier> ADD_MINI_GINKGO = registerKey("add_mini_ginkgo");
    public static final ResourceKey<BiomeModifier> ADD_HUGE_GINKGO = registerKey("add_huge_ginkgo");


     public static void bootstrap(BootstrapContext<BiomeModifier> context) {
         // CF -> PF -> BM
         var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
         var biomes = context.lookup(Registries.BIOME);
 
         context.register(ADD_AMBER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.AMBER_ORE_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_DEEPSLATE_AMBER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.DEEPSLATE_AMBER_ORE_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_DEEPSLATE_CAMBRIAN_FOSSILS, new BiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.DEEPSLATE_CAMBRIAN_FOSSILS_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_DEEPSLATE_ORDOVICIAN_FOSSILS, new BiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.DEEPSLATE_ORDOVICIAN_FOSSILS_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_DEEPSLATE_DEVONIAN_FOSSILS, new BiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.DEEPSLATE_DEVONIAN_FOSSILS_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_DEEPSLATE_CARBONIFEROUS_FOSSILS, new BiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.DEEPSLATE_CARBONIFEROUS_FOSSILS_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_PERMIAN_FOSSILS, new BiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.OVERWORLD_PERMIAN_FOSSILS_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_CRETACEOUS_FOSSILS, new BiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.CRETACEOUS_FOSSILS_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_PLEISTOCENE_FOSSILS, new BiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.PLEISTOCENE_FOSSILS_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_HOLOCENE_FOSSILS, new BiomeModifiers.AddFeaturesBiomeModifier(
                 biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.HOLOCENE_FOSSILS_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_LIMESTONE_FOSSILS, new BiomeModifiers.AddFeaturesBiomeModifier(
                 HolderSet.direct(biomes.getOrThrow(Biomes.RIVER), biomes.getOrThrow(Biomes.OCEAN), biomes.getOrThrow(Biomes.FROZEN_RIVER), biomes.getOrThrow(Biomes.LUKEWARM_OCEAN), biomes.getOrThrow(Biomes.WARM_OCEAN)),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.LIMESTONE_FOSSILS_PLACED_KEY)),
                 GenerationStep.Decoration.UNDERGROUND_ORES));

         context.register(ADD_LIMESTONE, new BiomeModifiers.AddFeaturesBiomeModifier(
                 HolderSet.direct(biomes.getOrThrow(Biomes.RIVER), biomes.getOrThrow(Biomes.OCEAN), biomes.getOrThrow(Biomes.FROZEN_RIVER), biomes.getOrThrow(Biomes.LUKEWARM_OCEAN), biomes.getOrThrow(Biomes.WARM_OCEAN)),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.LIMESTONE_PLACED_KEY)),
                 GenerationStep.Decoration.RAW_GENERATION));

         context.register(ADD_GINKGO, new BiomeModifiers.AddFeaturesBiomeModifier(
                 HolderSet.direct(
                         biomes.getOrThrow(Biomes.FOREST),
                         biomes.getOrThrow(Biomes.TAIGA)),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.GINKGO_LIST_PLACED_KEY)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_MINI_GINKGO, new BiomeModifiers.AddFeaturesBiomeModifier(
                 HolderSet.direct(
                         biomes.getOrThrow(Biomes.FOREST),
                         biomes.getOrThrow(Biomes.PLAINS),
                         biomes.getOrThrow(Biomes.TAIGA)),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.MINI_GINKGO_LIST_PLACED_KEY)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

         context.register(ADD_HUGE_GINKGO, new BiomeModifiers.AddFeaturesBiomeModifier(
                 HolderSet.direct(
                         biomes.getOrThrow(Biomes.FOREST),
                         biomes.getOrThrow(Biomes.TAIGA)),
                 HolderSet.direct(placedFeatures.getOrThrow(ANPlacedFeatures.HUGE_GINKGO_LIST_PLACED_KEY)),
                 GenerationStep.Decoration.VEGETAL_DECORATION));

     }
 
     private static ResourceKey<BiomeModifier> registerKey(String name) {
         return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(AncientNature.MOD_ID, name));
     }
 }