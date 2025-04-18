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
 
 public class ModPlacedFeatures {
     public static final ResourceKey<PlacedFeature> AMBER_ORE_PLACED_KEY = registerKey("amber_ore_placed");
     public static final ResourceKey<PlacedFeature> LIMESTONE_PLACED_KEY = registerKey("limestone_placed");


     public static void bootstrap(BootstrapContext<PlacedFeature> context) {
         var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
 
 
         register(context, AMBER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_AMBER_ORE_KEY),
                 ModOrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(120))));

         register(context, LIMESTONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LIMESTONE_KEY),
                 ModOrePlacement.commonOrePlacement(20, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80))));
     }
 
     private static ResourceKey<PlacedFeature> registerKey(String name) {
         return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(AncientNature.MODID, name));
     }
 
     private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
     List<PlacementModifier> modifiers) {
         context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
     }
 }