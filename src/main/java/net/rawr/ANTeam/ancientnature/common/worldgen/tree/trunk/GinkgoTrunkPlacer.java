package net.rawr.ANTeam.ancientnature.common.worldgen.tree.trunk;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.rawr.ANTeam.ancientnature.common.block.ItemDropperBlock;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.ANTrunkPlacerTypes;
import net.rawr.ANTeam.ancientnature.registries.ANBlocks;

import java.util.List;
import java.util.function.BiConsumer;

public class GinkgoTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<GinkgoTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec((instance) ->
            trunkPlacerParts(instance).apply(instance, GinkgoTrunkPlacer::new));

    public GinkgoTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ANTrunkPlacerTypes.GINKGO_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos,
            BlockState> pBlockSetter, RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {
        BlockPos.MutableBlockPos mutable = pPos.mutable();

        BlockPos below = mutable.below();
        setDirtAt(pLevel, pBlockSetter, pRandom, below, pConfig);
        List<FoliagePlacer.FoliageAttachment> list = Lists.newArrayList();

        boolean isGoldenTree = pConfig.foliageProvider.getState(pRandom, pPos).is(ANBlocks.GOLDEN_GINKGO_LEAVES.get());

        for (int y = 0; y <= pFreeTreeHeight; y++) {
            BlockPos logPos = pPos.above(y);

            if (y == 1 && isGoldenTree) {
                Direction randomDirection = Direction.Plane.HORIZONTAL.getRandomDirection(pRandom);  // Random direction on the horizontal plane (NSEW).
                pBlockSetter.accept(logPos, ANBlocks.AMBER_GINKGO_LOG.get().defaultBlockState()
                        .setValue(ItemDropperBlock.AXIS, Direction.Axis.Y)
                        .setValue(ItemDropperBlock.FACING, randomDirection));
            } else {
                this.placeLog(pLevel, pBlockSetter, pRandom, logPos, pConfig);
            }

            int branchLength = Math.max(1, (pFreeTreeHeight - y + 1) / 3);

            if (y >= 2 && y % 3 == 2) {
                for (int face = 0; face < 4; face++) {
                    Direction facing = Direction.from2DDataValue(face);
                    BlockPos branchPos = logPos.offset(facing.getNormal());
                    this.placeLog(pLevel, pBlockSetter, pRandom, branchPos, pConfig);

                    list.add(new FoliagePlacer.FoliageAttachment(branchPos.above(2), -1, false));
                    list.add(new FoliagePlacer.FoliageAttachment(branchPos.above(3), -1, false));

                    Direction side1 = facing.getClockWise();
                    BlockPos sidePos1 = branchPos.relative(side1);
                    list.add(new FoliagePlacer.FoliageAttachment(sidePos1.above(2), -1, false));
                    list.add(new FoliagePlacer.FoliageAttachment(sidePos1.above(3), -1, false));

                    for (int z = 0; z < branchLength; z++) {
                        BlockPos branchLogPos = branchPos.above(z / 2 + 1).relative(facing, z + 1);
                        this.placeLog(pLevel, pBlockSetter, pRandom, branchLogPos, pConfig);
                        list.add(new FoliagePlacer.FoliageAttachment(branchLogPos.above(2), -1, false));
                        list.add(new FoliagePlacer.FoliageAttachment(branchLogPos.above(1), -2, false));
                    }
                }
            }
        }

        list.add(new FoliagePlacer.FoliageAttachment(mutable.above(pFreeTreeHeight + 2), 0, false));
        list.add(new FoliagePlacer.FoliageAttachment(mutable.above(3), -1, false));

        if (pFreeTreeHeight > 13) {
            int additionalHeight = pFreeTreeHeight - 14;

            for (int i = 0; i <= additionalHeight; i++) {
                list.add(new FoliagePlacer.FoliageAttachment(mutable.above(4 + i).offset(2, 0, 2), -2, false));
                list.add(new FoliagePlacer.FoliageAttachment(mutable.above(4 + i).offset(2, 0, -2), -2, false));
                list.add(new FoliagePlacer.FoliageAttachment(mutable.above(4 + i).offset(-2, 0, 2), -2, false));
                list.add(new FoliagePlacer.FoliageAttachment(mutable.above(4 + i).offset(-2, 0, -2), -2, false));
                list.add(new FoliagePlacer.FoliageAttachment(mutable.above(5 + i), 1, false));
            }
        }

        return list;
    }
}