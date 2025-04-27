package net.rawr.ANTeam.ancientnature.common.worldgen.tree.foliage;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.ANFoliagePlacerTypes;

public class GinkgoFoliagePlacer extends FoliagePlacer {

    public static final MapCodec<GinkgoFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
            foliagePlacerParts(instance).apply(instance, GinkgoFoliagePlacer::new));
    public GinkgoFoliagePlacer(IntProvider pRadius, IntProvider pOffset) {
        super(pRadius, pOffset);
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ANFoliagePlacerTypes.GINKGO_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter pBlockSetter, RandomSource pRandom, TreeConfiguration pConfig,
                                 int pMaxFreeTreeHeight, FoliageAttachment pAttachment, int pFoliageHeight, int pFoliageRadius, int pOffset) {
        int leafTop = pOffset;
        int leafBottom = -2;

        for (int y = leafTop; y >= leafBottom; --y){
            int layerWidth;

            layerWidth = pFoliageRadius + pAttachment.radiusOffset() - y - 2;

            this.placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos(), layerWidth, y, pAttachment.doubleTrunk());
        }

        //int leafTop = pOffset;
        //        int leafBottom = -4;
        //        int middleLayer = (leafBottom) / 2;
        //
        //        for (int y = leafTop; y >= leafBottom; --y){
        //            int layerWidth;
        //
        //            int distanceFromMiddle = Math.abs(y - middleLayer);
        //            layerWidth = pFoliageRadius + pAttachment.radiusOffset() - distanceFromMiddle;
        //
        //            this.placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos(), layerWidth, y, pAttachment.doubleTrunk());
        //        }
    }



    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return pHeight;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource random, int absX, int layerY, int absZ, int layerWidth, boolean giantTrunk) {
        int dSq = absX * absX + absZ * absZ;
        return dSq > layerWidth * layerWidth;
    }
}
