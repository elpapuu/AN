package net.reaper.ANTeam.ancientnature.core.datagen.client;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.reaper.ANTeam.ancientnature.AncientNature;
import net.reaper.ANTeam.ancientnature.common.block.ANLeavesBlock;
import net.reaper.ANTeam.ancientnature.registries.ANBlocks;

public class ANBlockStateProvider extends BlockStateProvider {

    public ANBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AncientNature.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
            simpleBlockWithTop(ANBlocks.DEEPSLATE_AMBER_ORE.get());
            simpleBlockWithTop(ANBlocks.DEEPSLATE_CAMBRIAN_FOSSILS.get());
            simpleBlockWithTop(ANBlocks.DEEPSLATE_CARBONIFEROUS_FOSSILS.get());
            simpleBlockWithTop(ANBlocks.DEEPSLATE_DEVONIAN_FOSSILS.get());
            simpleBlockWithTop(ANBlocks.DEEPSLATE_PERMIAN_FOSSILS.get());
            simpleBlockWithTop(ANBlocks.DEEPSLATE_ORDOVICIAN_FOSSILS.get());
            logBlock(ANBlocks.GINKGO_LOG.get());
            logBlock(ANBlocks.STRIPPED_GINKGO_LOG.get());
            logBlock(ANBlocks.UNSCALED_LEPIDODENDRON_LOG.get());
            logBlock(ANBlocks.STRIPPED_LEPIDODENDRON_LOG.get());
            leavesBlock(ANBlocks.GINKGO_LEAVES);
            leavesBlock(ANBlocks.LEPIDODENDRON_LEAVES);
            leavesBlock(ANBlocks.GOLDEN_GINKGO_LEAVES);
            simpleBlock(ANBlocks.PERMIAN_FOSSILS.get());
            simpleBlock(ANBlocks.CRETACEOUS_FOSSILS.get());
            simpleBlock(ANBlocks.AMBER_ORE.get());
            simpleBlock(ANBlocks.PERMAFROST.get());
            simpleBlock(ANBlocks.PERMAFROST_FOSSILS.get());
            simpleBlock(ANBlocks.PLEISTOCENE_FOSSILS.get());
            simpleBlock(ANBlocks.HOLOCENE_FOSSILS.get());
            simpleBlock(ANBlocks.LIMESTONE_FOSSILS.get());
            simpleBlock(ANBlocks.GINKGO_PLANKS.get());
            simpleBlock(ANBlocks.LEPIDODENDRON_PLANKS.get());
            simpleBlock(ANBlocks.LIMESTONE.get());
            simpleBlock(ANBlocks.LIMESTONE_BRICKS.get());
            simpleBlock(ANBlocks.SMOOTH_LIMESTONE.get());
            simpleBlock(ANBlocks.CHISELED_LIMESTONE.get());

            signBlock(((StandingSignBlock) ANBlocks.GINKGO_SIGN.get()), ((WallSignBlock)ANBlocks.GINKGO_WALL_SIGN.get()),
                    blockTexture(ANBlocks.GINKGO_PLANKS.get()));
            hangingSignBlock(ANBlocks.GINKGO_HANGING_SIGN.get(), ANBlocks.GINKGO_WALL_HANGING_SIGN.get(), blockTexture(ANBlocks.GINKGO_PLANKS.get()));

            signBlock(((StandingSignBlock) ANBlocks.LEPIDODENDRON_SIGN.get()), ((WallSignBlock)ANBlocks.LEPIDODENDRON_WALL_SIGN.get()),
                    blockTexture(ANBlocks.LEPIDODENDRON_PLANKS.get()));
            hangingSignBlock(ANBlocks.LEPIDODENDRON_HANGING_SIGN.get(), ANBlocks.LEPIDODENDRON_WALL_HANGING_SIGN.get(), blockTexture(ANBlocks.LEPIDODENDRON_PLANKS.get()));


            //BUIDLING BLOCK SETS
            //|
            //V
            stairsBlock(((StairBlock) ANBlocks.GINKGO_STAIRS.get()), blockTexture(ANBlocks.GINKGO_PLANKS.get()));
            stairsBlock(((StairBlock) ANBlocks.LEPIDODENDRON_STAIRS.get()), blockTexture(ANBlocks.LEPIDODENDRON_PLANKS.get()));
            stairsBlock(((StairBlock) ANBlocks.LIMESTONE_STAIRS.get()), blockTexture(ANBlocks.LIMESTONE.get()));
            stairsBlock(((StairBlock) ANBlocks.LIMESTONE_BRICKS_STAIRS.get()), blockTexture(ANBlocks.LIMESTONE_BRICKS.get()));
            stairsBlock(((StairBlock) ANBlocks.SMOOTH_LIMESTONE_STAIRS.get()), blockTexture(ANBlocks.SMOOTH_LIMESTONE.get()));
            slabBlock(((SlabBlock) ANBlocks.GINKGO_SLAB.get()), blockTexture(ANBlocks.GINKGO_PLANKS.get()), blockTexture(ANBlocks.GINKGO_PLANKS.get()));
            slabBlock(((SlabBlock) ANBlocks.LEPIDODENDRON_SLAB.get()), blockTexture(ANBlocks.LEPIDODENDRON_PLANKS.get()), blockTexture(ANBlocks.LEPIDODENDRON_PLANKS.get()));
            slabBlock(((SlabBlock) ANBlocks.LIMESTONE_SLAB.get()), blockTexture(ANBlocks.LIMESTONE.get()), blockTexture(ANBlocks.LIMESTONE.get()));
            slabBlock(((SlabBlock) ANBlocks.LIMESTONE_BRICKS_SLAB.get()), blockTexture(ANBlocks.LIMESTONE_BRICKS.get()), blockTexture(ANBlocks.LIMESTONE_BRICKS.get()));
            slabBlock(((SlabBlock) ANBlocks.SMOOTH_LIMESTONE_SLAB.get()), blockTexture(ANBlocks.SMOOTH_LIMESTONE.get()), blockTexture(ANBlocks.SMOOTH_LIMESTONE.get()));
            fenceBlock(((FenceBlock) ANBlocks.GINKGO_FENCE.get()), blockTexture(ANBlocks.GINKGO_PLANKS.get()));
            fenceBlock(((FenceBlock) ANBlocks.LEPIDODENDRON_FENCE.get()), blockTexture(ANBlocks.LEPIDODENDRON_PLANKS.get()));
            wallBlock(((WallBlock) ANBlocks.LIMESTONE_WALL.get()), blockTexture(ANBlocks.LIMESTONE.get()));
            wallBlock(((WallBlock) ANBlocks.LIMESTONE_BRICKS_WALL.get()), blockTexture(ANBlocks.LIMESTONE_BRICKS.get()));
            wallBlock(((WallBlock) ANBlocks.SMOOTH_LIMESTONE_WALL.get()), blockTexture(ANBlocks.SMOOTH_LIMESTONE.get()));

            blockItem(ANBlocks.GINKGO_STAIRS);
            blockItem(ANBlocks.GINKGO_SLAB);
            blockItem(ANBlocks.LEPIDODENDRON_STAIRS);
            blockItem(ANBlocks.LEPIDODENDRON_SLAB);
            blockItem(ANBlocks.LIMESTONE_STAIRS);
            blockItem(ANBlocks.LIMESTONE_SLAB);
            blockItem(ANBlocks.LIMESTONE_BRICKS_STAIRS);
            blockItem(ANBlocks.LIMESTONE_BRICKS_SLAB);
            blockItem(ANBlocks.SMOOTH_LIMESTONE_STAIRS);
            blockItem(ANBlocks.SMOOTH_LIMESTONE_SLAB);
    }
    @Override
    public void simpleBlock(Block block, ModelFile model) {
        super.simpleBlock(block, model);
        simpleBlockItem(block, model);
    }
    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("ancientnature:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("ancientnature:block/" + deferredBlock.getId().getPath() + appendix));
    }
    @Override
    public void logBlock(RotatedPillarBlock block) {
        super.logBlock(block);
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();

        simpleBlockItem(block,  models().cubeBottomTop(
                name,
                modLoc("block/" + name),
                modLoc("block/" + name + "_top"),
                modLoc("block/" + name + "_top")
        ));
    }
    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    private void leavesBlock(DeferredBlock<ANLeavesBlock> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void simpleBlockWithTop(Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        ModelFile blockModel = models().cubeBottomTop(
                name,
                modLoc("block/" + name),
                modLoc("block/" + name + "_top"),
                modLoc("block/" + name + "_top")
        );
        simpleBlock(block, blockModel);
        simpleBlockItem(block, blockModel);
    }


    private void logBlockWithModel(RotatedPillarBlock block) {
        // Use the existing model file path
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String modid = AncientNature.MODID;

        // Create the log block model using a single texture
        ModelFile logModel = models().withExistingParent(name, "block/cube_column")
                .texture("side", modid + ":block/" + name)
                .texture("end", modid + ":block/" + name);

        // Generate blockstates for the log
        getVariantBuilder(block).forAllStates(state -> {
            Direction.Axis axis = state.getValue(BlockStateProperties.AXIS);
            int rotationX = (axis == Direction.Axis.Y) ? 0 : 90;
            int rotationY = (axis == Direction.Axis.X) ? 90 : 0;

            return ConfiguredModel.builder()
                    .modelFile(logModel)
                    .rotationX(rotationX)
                    .rotationY(rotationY)
                    .build();
        });

        // Generate item model to point to the block model
        itemModels().withExistingParent(name, modid + ":block/" + name);
    }

}
