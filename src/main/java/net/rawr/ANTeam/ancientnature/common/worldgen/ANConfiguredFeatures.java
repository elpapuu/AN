package net.rawr.ANTeam.ancientnature.common.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
 import net.minecraft.data.worldgen.BootstrapContext;
 import net.minecraft.resources.ResourceKey;
 import net.minecraft.resources.ResourceLocation;
 import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
 import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
 import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
 import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.foliage.GinkgoFoliagePlacer;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.foliage.LepidodendronFoliagePlacer;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.trunk.GinkgoTrunkPlacer;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.trunk.LepidodendronTrunkPlacer;
import net.rawr.ANTeam.ancientnature.registries.ANBlocks;

import java.util.List;
 
 public class ANConfiguredFeatures {

     public static final ResourceKey<ConfiguredFeature<?, ?>> NOTING = registerKey("noting"); // useful for tree placement in a Random selector

     public static final ResourceKey<ConfiguredFeature<?, ?>> AMBER_ORE_KEY = registerKey("amber_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_AMBER_ORE_KEY = registerKey("deepslate_amber_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_CAMBRIAN_FOSSILS_KEY = registerKey("deepslate_cambrian_fossils_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_ORDOVICIAN_FOSSILS_KEY = registerKey("deepslate_ordovician_fossils_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_DEVONIAN_FOSSILS_KEY = registerKey("deepslate_devonian_fossils_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_CARBONIFEROUS_FOSSILS_KEY = registerKey("deepslate_carboniferous_fossils_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PERMIAN_FOSSILS_KEY = registerKey("stone_permian_fossils_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> STONE_CRETACEOUS_FOSSILS_KEY = registerKey("stone_cretaceous_fossils_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> STONE_PLEISTOCENE_FOSSILS_KEY = registerKey("stone_pleistocene_fossils_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> STONE_HOLOCENE_FOSSILS_KEY = registerKey("stone_holocene_fossils_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> LIMESTONE_FOSSILS_KEY = registerKey("limestone_fossils_ore");
     public static final ResourceKey<ConfiguredFeature<?, ?>> LIMESTONE_KEY = registerKey("limestone");

     public static final ResourceKey<ConfiguredFeature<?, ?>> GINKGO_TREE_KEY = registerKey("ginkgo_tree");
     public static final ResourceKey<ConfiguredFeature<?, ?>> MINI_GINKGO_TREE_KEY = registerKey("mini_ginkgo_tree");
     public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_GINKGO_TREE_KEY = registerKey("huge_ginkgo_tree");
     public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_GINKGO_TREE_KEY = registerKey("golden_ginkgo_tree");
     public static final ResourceKey<ConfiguredFeature<?, ?>> MINI_GOLDEN_GINKGO_TREE_KEY = registerKey("mini_golden_ginkgo_tree");
     public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_GOLDEN_GINKGO_TREE_KEY = registerKey("huge_golden_ginkgo_tree");

     public static final ResourceKey<ConfiguredFeature<?, ?>> GINKGO_LIST_KEY = registerKey("ginkgo_list");
     public static final ResourceKey<ConfiguredFeature<?, ?>> MINI_GINKGO_LIST_KEY = registerKey("mini_ginkgo_list");
     public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_GINKGO_LIST_KEY = registerKey("huge_ginkgo_list");

     public static final ResourceKey<ConfiguredFeature<?, ?>> LEPIDODENDRON_TREE_KEY = registerKey("lepidodendron_tree");



     public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
         RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
         RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
         RuleTest limestoneReplaceables = new BlockMatchTest(ANBlocks.LIMESTONE.get());

         var registryEntryLookup = context.lookup(Registries.PLACED_FEATURE);

         Holder.Reference<PlacedFeature> ginkgo_tree = registryEntryLookup.getOrThrow(ANPlacedFeatures.GINKGO_PLACED_KEY);
         Holder.Reference<PlacedFeature> mini_ginkgo_tree = registryEntryLookup.getOrThrow(ANPlacedFeatures.MINI_GINKGO_PLACED_KEY);
         Holder.Reference<PlacedFeature> huge_ginkgo_tree = registryEntryLookup.getOrThrow(ANPlacedFeatures.HUGE_GINKGO_PLACED_KEY);

         Holder.Reference<PlacedFeature> golden_ginkgo_tree = registryEntryLookup.getOrThrow(ANPlacedFeatures.GOLDEN_GINKGO_PLACED_KEY);
         Holder.Reference<PlacedFeature> mini_golden_ginkgo_tree = registryEntryLookup.getOrThrow(ANPlacedFeatures.MINI_GOLDEN_GINKGO_PLACED_KEY);
         Holder.Reference<PlacedFeature> huge_golden_ginkgo_tree = registryEntryLookup.getOrThrow(ANPlacedFeatures.HUGE_GOLDEN_GINKGO_PLACED_KEY);

         Holder.Reference<PlacedFeature> nothing = registryEntryLookup.getOrThrow(ANPlacedFeatures.NOTING);

         register(context, NOTING, Feature.NO_OP, new NoneFeatureConfiguration());

         List<OreConfiguration.TargetBlockState> overworldAmberOres = List.of(
                 OreConfiguration.target(stoneReplaceables, ANBlocks.AMBER_ORE.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldDeepslateAmberOres = List.of(
                 OreConfiguration.target(deepslateReplaceables, ANBlocks.DEEPSLATE_AMBER_ORE.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldDeepslateCambrianFossils = List.of(
                 OreConfiguration.target(deepslateReplaceables, ANBlocks.DEEPSLATE_CAMBRIAN_FOSSILS.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldDeepslateOrdovicianFossils = List.of(
                 OreConfiguration.target(deepslateReplaceables, ANBlocks.DEEPSLATE_ORDOVICIAN_FOSSILS.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldDeepslateDevonianFossils = List.of(
                 OreConfiguration.target(deepslateReplaceables, ANBlocks.DEEPSLATE_DEVONIAN_FOSSILS.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldDeepslateCarboniferousFossils = List.of(
                 OreConfiguration.target(deepslateReplaceables, ANBlocks.DEEPSLATE_CARBONIFEROUS_FOSSILS.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldPermianFossils = List.of(
                 OreConfiguration.target(stoneReplaceables, ANBlocks.PERMIAN_FOSSILS.get().defaultBlockState()),
                 OreConfiguration.target(deepslateReplaceables, ANBlocks.DEEPSLATE_PERMIAN_FOSSILS.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldCretaceousFossils = List.of(
                 OreConfiguration.target(stoneReplaceables, ANBlocks.CRETACEOUS_FOSSILS.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldPleistoceneFossils = List.of(
                 OreConfiguration.target(stoneReplaceables, ANBlocks.PLEISTOCENE_FOSSILS.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldHoloceneFossils = List.of(
                 OreConfiguration.target(stoneReplaceables, ANBlocks.HOLOCENE_FOSSILS.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldLimestoneFossils = List.of(
                 OreConfiguration.target(limestoneReplaceables, ANBlocks.LIMESTONE_FOSSILS.get().defaultBlockState()));

         List<OreConfiguration.TargetBlockState> overworldLimestone = List.of(
                 OreConfiguration.target(stoneReplaceables, ANBlocks.LIMESTONE.get().defaultBlockState()));

         register(context, AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAmberOres, 3));
         register(context, DEEPSLATE_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldDeepslateAmberOres, 4));
         register(context, DEEPSLATE_CAMBRIAN_FOSSILS_KEY, Feature.ORE, new OreConfiguration(overworldDeepslateCambrianFossils, 4));
         register(context, DEEPSLATE_ORDOVICIAN_FOSSILS_KEY, Feature.ORE, new OreConfiguration(overworldDeepslateOrdovicianFossils, 5));
         register(context, DEEPSLATE_DEVONIAN_FOSSILS_KEY, Feature.ORE, new OreConfiguration(overworldDeepslateDevonianFossils, 5));
         register(context, DEEPSLATE_CARBONIFEROUS_FOSSILS_KEY, Feature.ORE, new OreConfiguration(overworldDeepslateCarboniferousFossils, 6));
         register(context, OVERWORLD_PERMIAN_FOSSILS_KEY, Feature.ORE, new OreConfiguration(overworldPermianFossils, 6));
         register(context, STONE_CRETACEOUS_FOSSILS_KEY, Feature.ORE, new OreConfiguration(overworldCretaceousFossils, 6));
         register(context, STONE_PLEISTOCENE_FOSSILS_KEY, Feature.ORE, new OreConfiguration(overworldPleistoceneFossils, 7));
         register(context, STONE_HOLOCENE_FOSSILS_KEY, Feature.ORE, new OreConfiguration(overworldHoloceneFossils, 7));
         register(context, LIMESTONE_FOSSILS_KEY, Feature.ORE, new OreConfiguration(overworldLimestoneFossils, 6));
         register(context, LIMESTONE_KEY, Feature.ORE, new OreConfiguration(overworldLimestone, 26));

         register(context, GINKGO_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                 BlockStateProvider.simple(ANBlocks.GINKGO_LOG.get()), new GinkgoTrunkPlacer( 5, 2, 3),
                 BlockStateProvider.simple(ANBlocks.GINKGO_LEAVES.get()),
                 new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                 new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

         register(context, MINI_GINKGO_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                 BlockStateProvider.simple(ANBlocks.GINKGO_LOG.get()), new GinkgoTrunkPlacer( 4, 0, 0),
                 BlockStateProvider.simple(ANBlocks.GINKGO_LEAVES.get()),
                 new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                 new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

         register(context, HUGE_GINKGO_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                 BlockStateProvider.simple(ANBlocks.GINKGO_LOG.get()), new GinkgoTrunkPlacer( 10, 5, 5),
                 BlockStateProvider.simple(ANBlocks.GINKGO_LEAVES.get()),
                 new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                 new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

         register(context, GOLDEN_GINKGO_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                 BlockStateProvider.simple(ANBlocks.GINKGO_LOG.get()), new GinkgoTrunkPlacer( 5, 2, 3),
                 BlockStateProvider.simple(ANBlocks.GOLDEN_GINKGO_LEAVES.get()),
                 new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                 new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

         register(context, MINI_GOLDEN_GINKGO_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                 BlockStateProvider.simple(ANBlocks.GINKGO_LOG.get()), new GinkgoTrunkPlacer( 4, 0, 0),
                 BlockStateProvider.simple(ANBlocks.GOLDEN_GINKGO_LEAVES.get()),
                 new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                 new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

         register(context, HUGE_GOLDEN_GINKGO_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                 BlockStateProvider.simple(ANBlocks.GINKGO_LOG.get()), new GinkgoTrunkPlacer( 10, 5, 5),
                 BlockStateProvider.simple(ANBlocks.GOLDEN_GINKGO_LEAVES.get()),
                 new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                 new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

         register(context, GINKGO_LIST_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
                 new WeightedPlacedFeature(ginkgo_tree, 0.35f),
                 new WeightedPlacedFeature(golden_ginkgo_tree, 0.15f)
         ), nothing));

         register(context, MINI_GINKGO_LIST_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
                 new WeightedPlacedFeature(mini_ginkgo_tree, 0.35f),
                 new WeightedPlacedFeature(mini_golden_ginkgo_tree, 0.15f)
         ), nothing));

         register(context, HUGE_GINKGO_LIST_KEY, Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
                 new WeightedPlacedFeature(huge_ginkgo_tree, 0.35f),
                 new WeightedPlacedFeature(huge_golden_ginkgo_tree, 0.15f)
         ), nothing));

         register(context, LEPIDODENDRON_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                 BlockStateProvider.simple(ANBlocks.LEPIDODENDRON_LOG.get()),
                 new LepidodendronTrunkPlacer(),
                 BlockStateProvider.simple(ANBlocks.LEPIDODENDRON_LEAVES.get()
                         .defaultBlockState().setValue(LeavesBlock.PERSISTENT, true)),
                 new LepidodendronFoliagePlacer(),
                 new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

     }

     public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
         return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(AncientNature.MOD_ID, name));
     }
 
     private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
         context.register(key, new ConfiguredFeature<>(feature, configuration));
     }
 }