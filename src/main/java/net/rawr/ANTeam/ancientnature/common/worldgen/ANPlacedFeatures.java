package net.rawr.ANTeam.ancientnature.common.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
 import net.minecraft.resources.ResourceKey;
 import net.minecraft.resources.ResourceLocation;
 import net.minecraft.world.level.levelgen.VerticalAnchor;
 import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
 import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
 import net.minecraft.world.level.levelgen.placement.PlacedFeature;
 import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.rawr.ANTeam.ancientnature.AncientNature;

import java.util.List;
 
 public class ANPlacedFeatures {
     public static final ResourceKey<PlacedFeature> AMBER_ORE_PLACED_KEY = registerKey("amber_ore_placed");
     public static final ResourceKey<PlacedFeature> DEEPSLATE_AMBER_ORE_PLACED_KEY = registerKey("deepslate_amber_ore_placed");
     public static final ResourceKey<PlacedFeature> DEEPSLATE_CAMBRIAN_FOSSILS_PLACED_KEY = registerKey("deepslate_cambrian_fossils_placed");
     public static final ResourceKey<PlacedFeature> DEEPSLATE_ORDOVICIAN_FOSSILS_PLACED_KEY = registerKey("deepslate_ordovician_fossils_placed");
     public static final ResourceKey<PlacedFeature> DEEPSLATE_DEVONIAN_FOSSILS_PLACED_KEY = registerKey("deepslate_devonian_fossils_placed");
     public static final ResourceKey<PlacedFeature> DEEPSLATE_CARBONIFEROUS_FOSSILS_PLACED_KEY = registerKey("deepslate_carboniferous_fossils_placed");
     public static final ResourceKey<PlacedFeature> OVERWORLD_PERMIAN_FOSSILS_PLACED_KEY = registerKey("permian_fossils_placed");
     public static final ResourceKey<PlacedFeature> CRETACEOUS_FOSSILS_PLACED_KEY = registerKey("cretaceous_fossils_placed");
     public static final ResourceKey<PlacedFeature> PLEISTOCENE_FOSSILS_PLACED_KEY = registerKey("pleistocene_fossils_placed");
     public static final ResourceKey<PlacedFeature> HOLOCENE_FOSSILS_PLACED_KEY = registerKey("holocene_fossils_placed");
     public static final ResourceKey<PlacedFeature> LIMESTONE_FOSSILS_PLACED_KEY = registerKey("limestone_fossils_placed");
     public static final ResourceKey<PlacedFeature> LIMESTONE_PLACED_KEY = registerKey("limestone_placed");


     public static void bootstrap(BootstrapContext<PlacedFeature> context) {
         var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
 
 
         register(context, AMBER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.AMBER_ORE_KEY),
                 ANOrePlacement.rareOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(120))));

         register(context, DEEPSLATE_AMBER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.DEEPSLATE_AMBER_ORE_KEY),
                 ANOrePlacement.commonOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(-64))));

         register(context, DEEPSLATE_CAMBRIAN_FOSSILS_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.DEEPSLATE_CAMBRIAN_FOSSILS_KEY),
                 ANOrePlacement.commonOrePlacement(4,
                         HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-49))));

         register(context, DEEPSLATE_ORDOVICIAN_FOSSILS_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.DEEPSLATE_CARBONIFEROUS_FOSSILS_KEY),
                 ANOrePlacement.commonOrePlacement(3,
                         HeightRangePlacement.uniform(VerticalAnchor.absolute(-51), VerticalAnchor.absolute(-39))));

         register(context, DEEPSLATE_DEVONIAN_FOSSILS_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.DEEPSLATE_DEVONIAN_FOSSILS_KEY),
                 ANOrePlacement.commonOrePlacement(2,
                         HeightRangePlacement.uniform(VerticalAnchor.absolute(-31), VerticalAnchor.absolute(-19))));

         register(context, DEEPSLATE_CARBONIFEROUS_FOSSILS_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.DEEPSLATE_CARBONIFEROUS_FOSSILS_KEY),
                 ANOrePlacement.commonOrePlacement(2,
                         HeightRangePlacement.uniform(VerticalAnchor.absolute(-21), VerticalAnchor.absolute(-9))));

         register(context, OVERWORLD_PERMIAN_FOSSILS_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.OVERWORLD_PERMIAN_FOSSILS_KEY),
                 ANOrePlacement.commonOrePlacement(3,
                         HeightRangePlacement.uniform(VerticalAnchor.absolute(-11), VerticalAnchor.absolute(1))));

         register(context, CRETACEOUS_FOSSILS_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.STONE_CRETACEOUS_FOSSILS_KEY),
                 ANOrePlacement.commonOrePlacement(3,
                         HeightRangePlacement.uniform(VerticalAnchor.absolute(19), VerticalAnchor.absolute(31))));

         register(context, PLEISTOCENE_FOSSILS_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.STONE_PLEISTOCENE_FOSSILS_KEY),
                 ANOrePlacement.commonOrePlacement(3,
                         HeightRangePlacement.uniform(VerticalAnchor.absolute(41), VerticalAnchor.absolute(51))));

         register(context, HOLOCENE_FOSSILS_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.STONE_HOLOCENE_FOSSILS_KEY),
                 ANOrePlacement.commonOrePlacement(3,
                         HeightRangePlacement.uniform(VerticalAnchor.absolute(51), VerticalAnchor.absolute(64))));

         register(context, LIMESTONE_FOSSILS_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.LIMESTONE_FOSSILS_KEY),
                 ANOrePlacement.commonOrePlacement(4,
                         HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80))));

         register(context, LIMESTONE_PLACED_KEY, configuredFeatures.getOrThrow(ANConfiguredFeatures.LIMESTONE_KEY),
                 ANOrePlacement.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80))));
     }
 
     private static ResourceKey<PlacedFeature> registerKey(String name) {
         return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(AncientNature.MODID, name));
     }
 
     private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
     List<PlacementModifier> modifiers) {
         context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
     }
 }