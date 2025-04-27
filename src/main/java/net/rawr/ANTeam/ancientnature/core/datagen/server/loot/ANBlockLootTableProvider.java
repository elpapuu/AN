package net.rawr.ANTeam.ancientnature.core.datagen.server.loot;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
 import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
 import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
 import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.rawr.ANTeam.ancientnature.registries.ANBlocks;
import net.rawr.ANTeam.ancientnature.registries.ANItems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

 public class ANBlockLootTableProvider extends BlockLootSubProvider {
     public ANBlockLootTableProvider(HolderLookup.Provider registries) {
         super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
     }
     protected List<Block> knowBlocks = new ArrayList<>();
 
     @Override
     protected void generate() {

         makeAmberdrops(ANBlocks.AMBER_ORE.get(), new int[]{10, 12, 12, 005}, ANItems.AMBER.get(), ANItems.MOSQUITO_AMBER.get(), ANItems.LIZARD_AMBER.get(), ANItems.MUSIC_DISC_WHERE_YOUR_JOURNEY_BEGINS.get());
         makeAmberdrops(ANBlocks.DEEPSLATE_AMBER_ORE.get(), new int[]{02, 20, 20, 005}, ANItems.AMBER.get(), ANItems.MOSQUITO_AMBER.get(), ANItems.LIZARD_AMBER.get(), ANItems.MUSIC_DISC_WHERE_YOUR_JOURNEY_BEGINS.get());

         add(ANBlocks.DEEPSLATE_CAMBRIAN_FOSSILS.get(),
                 block -> createMultipleOreDrops(ANBlocks.DEEPSLATE_CAMBRIAN_FOSSILS.get(), ANItems.DEEPSLATE_CAMBRIAN_FOSSIL.get(), 1, 3));
         add(ANBlocks.DEEPSLATE_ORDOVICIAN_FOSSILS.get(),
                 block -> createMultipleOreDrops(ANBlocks.DEEPSLATE_ORDOVICIAN_FOSSILS.get(), ANItems.ORDOVICIAN_FOSSIL.get(), 2, 4));
         add(ANBlocks.DEEPSLATE_DEVONIAN_FOSSILS.get(),
                 block -> createMultipleOreDrops(ANBlocks.DEEPSLATE_DEVONIAN_FOSSILS.get(), ANItems.DEVONIAN_FOSSIL.get(), 2, 4));
         add(ANBlocks.DEEPSLATE_CARBONIFEROUS_FOSSILS.get(),
                 block -> createMultipleOreDrops(ANBlocks.DEEPSLATE_CARBONIFEROUS_FOSSILS.get(), ANItems.CARBONIFEROUS_FOSSIL.get(), 2, 4));
         add(ANBlocks.DEEPSLATE_PERMIAN_FOSSILS.get(),
                 block -> createMultipleOreDrops(ANBlocks.DEEPSLATE_PERMIAN_FOSSILS.get(), ANItems.DEEPSLATE_PERMIAN_FOSSIL.get(), 3, 5));
         add(ANBlocks.PERMIAN_FOSSILS.get(),
                 block -> createMultipleOreDrops(ANBlocks.PERMIAN_FOSSILS.get(), ANItems.PERMIAN_FOSSIL.get(), 3, 5));
         add(ANBlocks.CRETACEOUS_FOSSILS.get(),
                 block -> createMultipleOreDrops(ANBlocks.CRETACEOUS_FOSSILS.get(), ANItems.CRETACEOUS_FOSSIL.get(), 3, 6));
         add(ANBlocks.PLEISTOCENE_FOSSILS.get(),
                 block -> createMultipleOreDrops(ANBlocks.PLEISTOCENE_FOSSILS.get(), ANItems.PLEISTOCENE_FOSSIL.get(), 4, 7));
         add(ANBlocks.HOLOCENE_FOSSILS.get(),
                 block -> createMultipleOreDrops(ANBlocks.HOLOCENE_FOSSILS.get(), ANItems.HOLOCENE_FOSSIL.get(), 4, 8));

         dropSelf(ANBlocks.PERMAFROST.get());
         add(ANBlocks.PERMAFROST_FOSSILS.get(),
                 block -> noDrop());

         dropSelf(ANBlocks.LIMESTONE.get());
         dropSelf(ANBlocks.LIMESTONE_STAIRS.get());
         dropSelf(ANBlocks.LIMESTONE_WALL.get());
         add(ANBlocks.LIMESTONE_SLAB.get(),
                 block -> createSlabItemTable(ANBlocks.LIMESTONE_SLAB.get()));
         add(ANBlocks.LIMESTONE_FOSSILS.get(),
                 block -> noDrop());
         dropSelf(ANBlocks.LIMESTONE_BRICKS.get());
         dropSelf(ANBlocks.LIMESTONE_BRICKS_STAIRS.get());
         dropSelf(ANBlocks.LIMESTONE_BRICKS_WALL.get());
         add(ANBlocks.LIMESTONE_BRICKS_SLAB.get(),
                 block -> createSlabItemTable(ANBlocks.LIMESTONE_BRICKS_SLAB.get()));
         dropSelf(ANBlocks.SMOOTH_LIMESTONE.get());
         dropSelf(ANBlocks.SMOOTH_LIMESTONE_STAIRS.get());
         dropSelf(ANBlocks.SMOOTH_LIMESTONE_WALL.get());
         add(ANBlocks.SMOOTH_LIMESTONE_SLAB.get(),
                 block -> createSlabItemTable(ANBlocks.SMOOTH_LIMESTONE_SLAB.get()));
         dropSelf(ANBlocks.CHISELED_LIMESTONE.get());

         add(ANBlocks.GOLDEN_GINKGO_LEAVES.get(),
                 block -> noDrop());
         add(ANBlocks.GINKGO_LEAVES.get(),
                 block -> noDrop());
         dropSelf(ANBlocks.GINKGO_LOG.get());
         dropSelf(ANBlocks.STRIPPED_GINKGO_LOG.get());
         dropSelf(ANBlocks.GINKGO_PLANKS.get());
         dropSelf(ANBlocks.GINKGO_STAIRS.get());
         add(ANBlocks.GINKGO_SLAB.get(),
                 block -> createSlabItemTable(ANBlocks.GINKGO_SLAB.get()));
         dropSelf(ANBlocks.GINKGO_FENCE.get());

         dropSelf(ANBlocks.GINKGO_SAPLING.get());
         add(ANBlocks.POTTED_GINKGO_SAPLING.get(), LootTable.lootTable()
                 .withPool(LootPool.lootPool()
                         .setRolls(ConstantValue.exactly(1))
                         .add(LootItem.lootTableItem(Blocks.FLOWER_POT)))
                 .withPool(LootPool.lootPool()
                         .setRolls(ConstantValue.exactly(1))
                         .add(LootItem.lootTableItem(ANBlocks.GINKGO_SAPLING.get()))));

         dropSelf(ANBlocks.LEPIDODENDRON_SAPLING.get());
         add(ANBlocks.POTTED_LEPIDODENDRON_SAPLING.get(), LootTable.lootTable()
                 .withPool(LootPool.lootPool()
                         .setRolls(ConstantValue.exactly(1))
                         .add(LootItem.lootTableItem(Blocks.FLOWER_POT)))
                 .withPool(LootPool.lootPool()
                         .setRolls(ConstantValue.exactly(1))
                         .add(LootItem.lootTableItem(ANBlocks.LEPIDODENDRON_SAPLING.get()))));


         add(ANBlocks.LEPIDODENDRON_LEAVES.get(),
                 block -> noDrop());
         dropSelf(ANBlocks.LEPIDODENDRON_CONES.get());
         dropSelf(ANBlocks.LEPIDODENDRON_LOG.get());
         dropSelf(ANBlocks.UNSCALED_LEPIDODENDRON_LOG.get());
         dropSelf(ANBlocks.STRIPPED_LEPIDODENDRON_LOG.get());
         dropSelf(ANBlocks.LEPIDODENDRON_PLANKS.get());
         dropSelf(ANBlocks.LEPIDODENDRON_STAIRS.get());
         add(ANBlocks.LEPIDODENDRON_SLAB.get(),
                 block -> createSlabItemTable(ANBlocks.LEPIDODENDRON_SLAB.get()));
         dropSelf(ANBlocks.LEPIDODENDRON_FENCE.get());

         // Make GINKGO_LOG_WITH_AMBER drop GINKGO_LOG
         add(ANBlocks.AMBER_GINKGO_LOG.get(), LootTable.lootTable()
                 .withPool(LootPool.lootPool()
                         .setRolls(ConstantValue.exactly(1)) // Always rolls once
                         .add(LootItem.lootTableItem(ANBlocks.GINKGO_LOG.get())) // Drops GINKGO_LOG
                 )
         );

         HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
     }
 
     protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
         HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
         return this.createSilkTouchDispatchTable(pBlock,
                 this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                         .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                         .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
     }
     protected void makeAmberdrops(Block amber, int[] weights, ItemLike... drops) {
         if (weights.length != drops.length)
             throw new IllegalArgumentException("there where more entires then weights");
         LootPool.Builder ambers = LootPool.lootPool().when(this.hasSilkTouch());
         for (int i = 0; i < weights.length; i++) {
             int weight = weights[i];
             ItemLike drop = drops[i];
             ambers.add(LootItem.lootTableItem(drop).setWeight(weight));
         }
         LootTable.Builder table = LootTable.lootTable().withPool(LootPool.lootPool().when(this.hasSilkTouch()).add(
                 LootItem.lootTableItem(amber)
         )).withPool(ambers);
         ambers.when(ExplosionCondition.survivesExplosion());
         this.add(amber, table);
     }

     @Override
     protected Iterable<Block> getKnownBlocks() {
         return ANBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
     }
 }