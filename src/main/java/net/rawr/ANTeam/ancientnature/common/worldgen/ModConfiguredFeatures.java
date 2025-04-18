package net.rawr.ANTeam.ancientnature.common.worldgen;

import net.minecraft.core.registries.Registries;
 import net.minecraft.data.worldgen.BootstrapContext;
 import net.minecraft.resources.ResourceKey;
 import net.minecraft.resources.ResourceLocation;
 import net.minecraft.tags.BlockTags;
 import net.minecraft.world.level.block.Blocks;
 import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
 import net.minecraft.world.level.levelgen.feature.Feature;
 import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
 import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
 import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
 import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
 import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.registries.ANBlocks;

import java.util.List;
 
 public class ModConfiguredFeatures {
     public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AMBER_ORE_KEY = registerKey("amber_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_KEY = registerKey("limestone");



     public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
         RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
         RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
         List<OreConfiguration.TargetBlockState> overworldAmberOres = List.of(
                 OreConfiguration.target(stoneReplaceables, ANBlocks.AMBER_ORE.get().defaultBlockState()),
                 OreConfiguration.target(deepslateReplaceables, ANBlocks.DEEPSLATE_AMBER_ORE.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldLimestone = List.of(
                 OreConfiguration.target(stoneReplaceables, ANBlocks.LIMESTONE.get().defaultBlockState()));

         register(context, OVERWORLD_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAmberOres, 6));
         register(context, OVERWORLD_LIMESTONE_KEY, Feature.ORE, new OreConfiguration(overworldLimestone, 32));

     }

     public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
         return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AncientNature.MODID, name));
     }
 
     private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
         context.register(key, new ConfiguredFeature<>(feature, configuration));
     }
 }