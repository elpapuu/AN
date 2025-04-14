package net.reaper.ANTeam.ancientnature.core.datagen.server;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.reaper.ANTeam.ancientnature.AncientNature;
import net.reaper.ANTeam.ancientnature.registries.ANBlocks;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ANBlockTagsProvider extends BlockTagsProvider {
    public ANBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AncientNature.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ANBlocks.GINKGO_LOG.get())
                .add(ANBlocks.LEPIDODENDRON_LOG.get())
                .add(ANBlocks.STRIPPED_GINKGO_LOG.get())
                .add(ANBlocks.STRIPPED_LEPIDODENDRON_LOG.get())
                .add(ANBlocks.UNSCALED_LEPIDODENDRON_LOG.get())
                .add(ANBlocks.AMBER_GINKGO_LOG.get())
                .add(ANBlocks.GINKGO_PLANKS.get())
                .add(ANBlocks.LEPIDODENDRON_PLANKS.get())
                .add(ANBlocks.GINKGO_SLAB.get())
                .add(ANBlocks.LEPIDODENDRON_SLAB.get())
                .add(ANBlocks.GINKGO_STAIRS.get())
                .add(ANBlocks.LEPIDODENDRON_STAIRS.get())
                .add(ANBlocks.GINKGO_FENCE.get())
                .add(ANBlocks.LEPIDODENDRON_FENCE.get())
                .add(ANBlocks.GINKGO_SIGN.get())
                .add(ANBlocks.LEPIDODENDRON_SIGN.get())
                .add(ANBlocks.GINKGO_HANGING_SIGN.get())
                .add(ANBlocks.LEPIDODENDRON_HANGING_SIGN.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ANBlocks.DEEPSLATE_AMBER_ORE.get())
                .add(ANBlocks.AMBER_ORE.get())
                .add(ANBlocks.DEEPSLATE_CAMBRIAN_FOSSILS.get())
                .add(ANBlocks.DEEPSLATE_ORDOVICIAN_FOSSILS.get())
                .add(ANBlocks.DEEPSLATE_DEVONIAN_FOSSILS.get())
                .add(ANBlocks.DEEPSLATE_CARBONIFEROUS_FOSSILS.get())
                .add(ANBlocks.DEEPSLATE_PERMIAN_FOSSILS.get())
                .add(ANBlocks.PERMIAN_FOSSILS.get())
                .add(ANBlocks.CRETACEOUS_FOSSILS.get())
                .add(ANBlocks.PLEISTOCENE_FOSSILS.get())
                .add(ANBlocks.HOLOCENE_FOSSILS.get())
                .add(ANBlocks.PERMAFROST.get())
                .add(ANBlocks.PERMAFROST_FOSSILS.get())
                .add(ANBlocks.LIMESTONE.get())
                .add(ANBlocks.LIMESTONE_FOSSILS.get())
                .add(ANBlocks.LIMESTONE_STAIRS.get())
                .add(ANBlocks.LIMESTONE_SLAB.get())
                .add(ANBlocks.LIMESTONE_WALL.get())
                .add(ANBlocks.LIMESTONE_BRICKS.get())
                .add(ANBlocks.LIMESTONE_BRICKS_STAIRS.get())
                .add(ANBlocks.LIMESTONE_BRICKS_SLAB.get())
                .add(ANBlocks.LIMESTONE_BRICKS_WALL.get())
                .add(ANBlocks.SMOOTH_LIMESTONE.get())
                .add(ANBlocks.SMOOTH_LIMESTONE_STAIRS.get())
                .add(ANBlocks.SMOOTH_LIMESTONE_SLAB.get())
                .add(ANBlocks.SMOOTH_LIMESTONE_WALL.get())
                .add(ANBlocks.CHISELED_LIMESTONE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ANBlocks.AMBER_ORE.get())
                .add(ANBlocks.DEEPSLATE_PERMIAN_FOSSILS.get())
                .add(ANBlocks.PERMIAN_FOSSILS.get())
                .add(ANBlocks.CRETACEOUS_FOSSILS.get())
                .add(ANBlocks.PLEISTOCENE_FOSSILS.get())
                .add(ANBlocks.HOLOCENE_FOSSILS.get())
                .add(ANBlocks.PERMAFROST.get())
                .add(ANBlocks.PERMAFROST_FOSSILS.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ANBlocks.DEEPSLATE_AMBER_ORE.get())
                .add(ANBlocks.DEEPSLATE_CAMBRIAN_FOSSILS.get())
                .add(ANBlocks.DEEPSLATE_ORDOVICIAN_FOSSILS.get())
                .add(ANBlocks.DEEPSLATE_DEVONIAN_FOSSILS.get())
                .add(ANBlocks.DEEPSLATE_CARBONIFEROUS_FOSSILS.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL);

        //LOGS
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ANBlocks.GINKGO_LOG.get())
                .add(ANBlocks.LEPIDODENDRON_LOG.get())
                .add(ANBlocks.STRIPPED_GINKGO_LOG.get())
                .add(ANBlocks.STRIPPED_LEPIDODENDRON_LOG.get())
                .add(ANBlocks.UNSCALED_LEPIDODENDRON_LOG.get())
                .add(ANBlocks.AMBER_GINKGO_LOG.get());

        this.tag(BlockTags.LOGS)
                .add(ANBlocks.GINKGO_LOG.get())
                .add(ANBlocks.LEPIDODENDRON_LOG.get())
                .add(ANBlocks.STRIPPED_GINKGO_LOG.get())
                .add(ANBlocks.STRIPPED_LEPIDODENDRON_LOG.get())
                .add(ANBlocks.UNSCALED_LEPIDODENDRON_LOG.get())
                .add(ANBlocks.AMBER_GINKGO_LOG.get());

        //BUILD BLOCKS
        this.tag(BlockTags.WOODEN_SLABS)
                .add(ANBlocks.GINKGO_SLAB.get())
                .add(ANBlocks.LEPIDODENDRON_SLAB.get());

        this.tag(BlockTags.WOODEN_STAIRS)
                .add(ANBlocks.GINKGO_STAIRS.get())
                .add(ANBlocks.LEPIDODENDRON_STAIRS.get());

        this.tag(BlockTags.WOODEN_FENCES)
                .add(ANBlocks.GINKGO_FENCE.get())
                .add(ANBlocks.LEPIDODENDRON_FENCE.get());

        this.tag(BlockTags.PLANKS)
                .add(ANBlocks.GINKGO_PLANKS.get())
                .add(ANBlocks.LEPIDODENDRON_PLANKS.get());

        this.tag(BlockTags.WOODEN_FENCES)
                .add(ANBlocks.GINKGO_FENCE.get())
                .add(ANBlocks.LEPIDODENDRON_FENCE.get());

        this.tag(BlockTags.SLABS)
                .add(ANBlocks.LIMESTONE_SLAB.get())
                .add(ANBlocks.LIMESTONE_BRICKS_SLAB.get())
                .add(ANBlocks.SMOOTH_LIMESTONE_SLAB.get());

        this.tag(BlockTags.STAIRS)
                .add(ANBlocks.LIMESTONE_STAIRS.get())
                .add(ANBlocks.LIMESTONE_BRICKS_STAIRS.get())
                .add(ANBlocks.SMOOTH_LIMESTONE_STAIRS.get());

        this.tag(BlockTags.STONE_BUTTONS);

        this.tag(BlockTags.STONE_PRESSURE_PLATES);

        this.tag(BlockTags.WALLS)
                .add(ANBlocks.LIMESTONE_WALL.get())
                .add(ANBlocks.LIMESTONE_BRICKS_WALL.get())
                .add(ANBlocks.SMOOTH_LIMESTONE_WALL.get());
        //LEAVES
        this.tag(BlockTags.LEAVES)
                .add(ANBlocks.GINKGO_LEAVES.get())
                .add(ANBlocks.GOLDEN_GINKGO_LEAVES.get())
                .add(ANBlocks.LEPIDODENDRON_LEAVES.get());
        //SIGNS
        this.tag(BlockTags.SIGNS)
                .add(ANBlocks.GINKGO_SIGN.get())
                .add(ANBlocks.LEPIDODENDRON_SIGN.get());
        //SIGNS WALL
        this.tag(BlockTags.WALL_SIGNS)
                .add(ANBlocks.GINKGO_WALL_SIGN.get())
                .add(ANBlocks.LEPIDODENDRON_WALL_SIGN.get());
        //HANGING SIGNS
        this.tag(BlockTags.ALL_HANGING_SIGNS)
                .add(ANBlocks.GINKGO_HANGING_SIGN.get())
                .add(ANBlocks.LEPIDODENDRON_HANGING_SIGN.get());
        // WALL HANGING SIGNS
        this.tag(BlockTags.WALL_HANGING_SIGNS)
                .add(ANBlocks.GINKGO_WALL_HANGING_SIGN.get())
                .add(ANBlocks.LEPIDODENDRON_WALL_HANGING_SIGN.get());
    }
}