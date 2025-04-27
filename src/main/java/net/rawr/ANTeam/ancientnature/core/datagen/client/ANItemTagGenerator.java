package net.rawr.ANTeam.ancientnature.core.datagen.client;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.registries.ANBlocks;
import net.rawr.ANTeam.ancientnature.registries.ANTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ANItemTagGenerator extends ItemTagsProvider {
    public ANItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                              CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, AncientNature.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.LEAVES)
                .add(ANBlocks.GINKGO_LEAVES.get().asItem())
                .add(ANBlocks.GOLDEN_GINKGO_LEAVES.get().asItem())
                .add(ANBlocks.LEPIDODENDRON_LEAVES.get().asItem());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ANBlocks.GINKGO_LOG.get().asItem())
                .add(ANBlocks.AMBER_GINKGO_LOG.get().asItem())
                .add(ANBlocks.LEPIDODENDRON_LOG.get().asItem())
                .add(ANBlocks.STRIPPED_GINKGO_LOG.get().asItem())
                .add(ANBlocks.STRIPPED_LEPIDODENDRON_LOG.get().asItem())
                .add(ANBlocks.UNSCALED_LEPIDODENDRON_LOG.get().asItem());

        this.tag(ANTags.Items.GINKGO_LOGS)
                .add(ANBlocks.GINKGO_LOG.get().asItem())
                .add(ANBlocks.STRIPPED_GINKGO_LOG.get().asItem())
                .add(ANBlocks.AMBER_GINKGO_LOG.get().asItem());

        this.tag(ANTags.Items.LEPIDODENDRON_LOGS)
                .add(ANBlocks.LEPIDODENDRON_LOG.get().asItem())
                .add(ANBlocks.STRIPPED_LEPIDODENDRON_LOG.get().asItem())
                .add(ANBlocks.UNSCALED_LEPIDODENDRON_LOG.get().asItem());

        this.tag(ItemTags.WOODEN_SLABS)
                .add(ANBlocks.GINKGO_SLAB.get().asItem())
                .add(ANBlocks.LEPIDODENDRON_SLAB.get().asItem());

        this.tag(ItemTags.SLABS)
                .add(ANBlocks.LIMESTONE_SLAB.get().asItem())
                .add(ANBlocks.LIMESTONE_BRICKS_SLAB.get().asItem())
                .add(ANBlocks.SMOOTH_LIMESTONE_SLAB.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ANBlocks.GINKGO_PLANKS.get().asItem())
                .add(ANBlocks.LEPIDODENDRON_PLANKS.get().asItem());

        this.tag(ItemTags.WOODEN_STAIRS)
                .add(ANBlocks.GINKGO_STAIRS.get().asItem())
                .add(ANBlocks.LEPIDODENDRON_STAIRS.get().asItem());

        this.tag(ItemTags.STAIRS)
                .add(ANBlocks.LIMESTONE_STAIRS.get().asItem())
                .add(ANBlocks.LIMESTONE_BRICKS_STAIRS.get().asItem())
                .add(ANBlocks.SMOOTH_LIMESTONE_STAIRS.get().asItem());

        this.tag(ItemTags.WOODEN_FENCES)
                .add(ANBlocks.GINKGO_FENCE.get().asItem())
                .add(ANBlocks.LEPIDODENDRON_FENCE.get().asItem());

        this.tag(ItemTags.WALLS)
                .add(ANBlocks.LIMESTONE_WALL.get().asItem())
                .add(ANBlocks.LIMESTONE_BRICKS_WALL.get().asItem())
                .add(ANBlocks.SMOOTH_LIMESTONE_WALL.get().asItem());
    }
}