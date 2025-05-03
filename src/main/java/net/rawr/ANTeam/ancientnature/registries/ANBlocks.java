package net.rawr.ANTeam.ancientnature.registries;


import com.google.common.base.Supplier;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.common.block.*;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.ModTreeGrowers;

import static net.minecraft.world.level.block.SoundType.*;

public class ANBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AncientNature.MOD_ID);

    //AMBER
    public static final DeferredBlock<Block> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore", () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE).strength(5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> AMBER_ORE = registerBlock("amber_ore", () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).strength(5f).requiresCorrectToolForDrops()));

    //PERMAFROST
    public static final DeferredBlock<Block> PERMAFROST = registerBlock("permafrost", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<DropExperienceBlock> PERMAFROST_FOSSILS = registerBlock("permafrost_fossils", () -> new  DropExperienceBlock(ConstantInt.of(1), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    //DEEPSLATE FOSSILS
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_CARBONIFEROUS_FOSSILS = makeDeepslateFossilBlock("deepslate_carboniferous_fossils");
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_ORDOVICIAN_FOSSILS = makeDeepslateFossilBlock("deepslate_ordovician_fossils");
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_DEVONIAN_FOSSILS = makeDeepslateFossilBlock("deepslate_devonian_fossils");
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_CAMBRIAN_FOSSILS = makeDeepslateFossilBlock("deepslate_cambrian_fossils");
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_PERMIAN_FOSSILS = makeDeepslateFossilBlock("deepslate_permian_fossils");

    //MISC FOSSILS
    public static final DeferredBlock<DropExperienceBlock> PLEISTOCENE_FOSSILS = registerBlock("pleistocene_fossils", () -> new DropExperienceBlock(ConstantInt.of(1), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<DropExperienceBlock> CRETACEOUS_FOSSILS = registerBlock("cretaceous_fossils", () -> new DropExperienceBlock(ConstantInt.of(1), BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<DropExperienceBlock> HOLOCENE_FOSSILS = registerBlock("holocene_fossils", () -> new DropExperienceBlock(ConstantInt.of(1), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<DropExperienceBlock> PERMIAN_FOSSILS = registerBlock("permian_fossils", () -> new DropExperienceBlock(ConstantInt.of(1), BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<DropExperienceBlock> LIMESTONE_FOSSILS = registerBlock("limestone_fossils", () -> new DropExperienceBlock(ConstantInt.of(1), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));

    //WOODS
    //LEPIDODENDRON WOOD
    public static final DeferredBlock<ANLeavesBlock> LEPIDODENDRON_LEAVES = registerBlock("lepidodendron_leaves", () -> new ANLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    public static final DeferredBlock<Block> LEPIDODENDRON_SAPLING = registerBlock("lepidodendron_sapling", () -> new SaplingBlock(ModTreeGrowers.LEPIDODENDRON, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> POTTED_LEPIDODENDRON_SAPLING = BLOCKS.register("potted_lepidodendron_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, LEPIDODENDRON_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));

    public static final DeferredBlock<Block> LEPIDODENDRON_CONES = registerBlock("lepidodendron_cones", () -> new ANUndersidePlantBlock(BlockBehaviour.Properties.of().noCollission().instabreak().sound(CAVE_VINES)));

    public static final DeferredBlock<LogDropperBlock> LEPIDODENDRON_LOG = makeLogDropperBlock("lepidodendron_log");
    public static final DeferredBlock<RotatedPillarBlock> UNSCALED_LEPIDODENDRON_LOG = makeStrippableLogBlock("unscaled_lepidodendron_log");
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_LEPIDODENDRON_LOG = makeStrippedLogBlock("stripped_lepidodendron_log");

    public static final DeferredBlock<Block> LEPIDODENDRON_PLANKS = registerBlock("lepidodendron_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<Block> LEPIDODENDRON_STAIRS = registerBlock("lepidodendron_stairs", () -> new StairBlock(LEPIDODENDRON_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(LEPIDODENDRON_PLANKS.get())));
    public static final DeferredBlock<Block> LEPIDODENDRON_SLAB = registerBlock("lepidodendron_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(LEPIDODENDRON_PLANKS.get())));
    public static final DeferredBlock<Block> LEPIDODENDRON_FENCE = registerBlock("lepidodendron_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(LEPIDODENDRON_PLANKS.get())));

    //GINKGO WOOD
    public static final DeferredBlock<ANLeavesBlock> GINKGO_LEAVES = registerBlock("ginkgo_leaves", () -> new ANLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<ANLeavesBlock> GOLDEN_GINKGO_LEAVES = registerBlock("golden_ginkgo_leaves", () -> new ANLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    public static final DeferredBlock<Block> GINKGO_SAPLING = registerBlock("ginkgo_sapling", () -> new SaplingBlock(ModTreeGrowers.GINKGO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<Block> POTTED_GINKGO_SAPLING = BLOCKS.register("potted_ginkgo_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GINKGO_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)));


    public static final DeferredBlock<RotatedPillarBlock> GINKGO_LOG = makeStrippableLogBlock("ginkgo_log");
    public static final DeferredBlock<ItemDropperBlock> AMBER_GINKGO_LOG = makeItemDropperBlock("amber_ginkgo_log");
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_GINKGO_LOG = makeStrippedLogBlock("stripped_ginkgo_log");

    public static final DeferredBlock<Block> GINKGO_PLANKS = registerBlock("ginkgo_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredBlock<Block> GINKGO_STAIRS = registerBlock("ginkgo_stairs", () -> new StairBlock(GINKGO_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(GINKGO_PLANKS.get())));
    public static final DeferredBlock<Block> GINKGO_SLAB = registerBlock("ginkgo_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(GINKGO_PLANKS.get())));
    public static final DeferredBlock<Block> GINKGO_FENCE = registerBlock("ginkgo_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(GINKGO_PLANKS.get())));

    //STONES and SETS
    //LIMESTONE
    public static final DeferredBlock<Block> LIMESTONE = registerBlock("limestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<Block> SMOOTH_LIMESTONE = registerBlock("smooth_limestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));
    public static final DeferredBlock<Block> CHISELED_LIMESTONE = registerBlock("chiseled_limestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_DEEPSLATE)));
    public static final DeferredBlock<Block> LIMESTONE_STAIRS = registerBlock("limestone_stairs", () -> new StairBlock(LIMESTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(LIMESTONE.get())));
    public static final DeferredBlock<Block> LIMESTONE_BRICKS_STAIRS = registerBlock("limestone_bricks_stairs", () -> new StairBlock(LIMESTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(LIMESTONE_BRICKS.get())));
    public static final DeferredBlock<Block> SMOOTH_LIMESTONE_STAIRS = registerBlock("smooth_limestone_stairs", () -> new StairBlock(SMOOTH_LIMESTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(SMOOTH_LIMESTONE.get())));
    public static final DeferredBlock<Block> LIMESTONE_SLAB = registerBlock("limestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(LIMESTONE.get())));
    public static final DeferredBlock<Block> LIMESTONE_BRICKS_SLAB = registerBlock("limestone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(LIMESTONE_BRICKS.get())));
    public static final DeferredBlock<Block> SMOOTH_LIMESTONE_SLAB = registerBlock("smooth_limestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_LIMESTONE.get())));
    public static final DeferredBlock<Block> LIMESTONE_WALL = registerBlock("limestone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(LIMESTONE.get())));
    public static final DeferredBlock<Block> LIMESTONE_BRICKS_WALL = registerBlock("limestone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(LIMESTONE_BRICKS.get())));
    public static final DeferredBlock<Block> SMOOTH_LIMESTONE_WALL = registerBlock("smooth_limestone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_LIMESTONE.get())));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, boolean registerItem) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        if (registerItem) {
            ANItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties()));
        }
        return toReturn;
    }
    public static DeferredBlock<LogBlock> makeLogBlock(String name) {
        return registerBlock(name,

                () -> new LogBlock(
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(2f) // Copies all default log properties
                )
        );
    }
    public static DeferredBlock<LogDropperBlock> makeLogDropperBlock(String name) {
        return registerBlock(name,

                () -> new LogDropperBlock(
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(2f) // Copies all default log properties
                )
        );
    }

    public static DeferredBlock<DropExperienceBlock> makeDeepslateFossilBlock(String name){
        return registerBlock(name, () -> new DropExperienceBlock(ConstantInt.of(1), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).strength(5f).requiresCorrectToolForDrops()));
    }
    public static DeferredBlock<Block> makeLeavesBlock(String name) {
        return registerBlock(name,

                () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    }
    public static DeferredBlock<RotatedPillarBlock> makeStrippedLogBlock(String name) {
        return registerBlock(name,
                () -> new LogBlock(
                        BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops().strength(2f) // Copies all default log properties
                )
        );
    }
    public static DeferredBlock<RotatedPillarBlock> makeStrippableLogBlock(String name) {
        return registerBlock(name,
                () -> new LogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
                        .requiresCorrectToolForDrops().strength(2f))
        );

    }

    public static DeferredBlock<ItemDropperBlock> makeItemDropperBlock(String name) {
        return registerBlock(name,

                () -> new ItemDropperBlock(
                        BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).requiresCorrectToolForDrops().strength(2f) // Copies all default log properties
                )
        );
    }


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        return registerBlock(name, block, true);
    }
    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);
    }
}