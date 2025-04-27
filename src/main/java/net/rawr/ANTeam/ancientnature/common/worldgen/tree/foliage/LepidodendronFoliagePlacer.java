package net.rawr.ANTeam.ancientnature.common.worldgen.tree.foliage;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.advancements.critereon.PlayerInteractTrigger;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.ANFoliagePlacerTypes;
import net.rawr.ANTeam.ancientnature.registries.ANBlocks;

import java.lang.module.Configuration;

public class LepidodendronFoliagePlacer extends FoliagePlacer {

    public static final MapCodec<LepidodendronFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
            foliagePlacerParts(instance).apply(instance, LepidodendronFoliagePlacer::new));
    private LepidodendronFoliagePlacer(IntProvider pRadius, IntProvider pOffset) {
        super(pRadius, pOffset);
    }
    public LepidodendronFoliagePlacer(){
        this(ConstantInt.of(0), ConstantInt.of(0));
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ANFoliagePlacerTypes.LEPIDODENDRON_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter pBlockSetter, RandomSource pRandom, TreeConfiguration pConfig, int pMaxFreeTreeHeight, FoliageAttachment pAttachment, int pFoliageHeight, int pFoliageRadius, int pOffset) {
        int leafTop = pOffset + 1;
        int leafBottom = -3;
        BlockPos center = pAttachment.pos();

        for (int y = leafTop; y >= leafBottom; --y) {
            int layerWidth;
            if (y == leafTop){
                layerWidth = 2;
            }
            else if (y == leafTop - 1){
                layerWidth = 3;
            }
            else {
                layerWidth = 4;
            }


            this.placeLeavesRow(pLevel, pBlockSetter, pRandom, pConfig, pAttachment.pos(), layerWidth, y, pAttachment.doubleTrunk());

            for (int dx = -layerWidth; dx <= layerWidth; ++dx) {
                for (int dz = -layerWidth; dz <= layerWidth; ++dz) {
                    if (shouldSkipLocation(pRandom, dx, y, dz, layerWidth, pAttachment.doubleTrunk())) continue;
                    BlockPos leafPos = center.offset(dx, y, dz);
                    pBlockSetter.set(leafPos, pConfig.foliageProvider.getState(pRandom, leafPos));
                    BlockPos belowPos = leafPos.below();
                    if (pLevel.isStateAtPosition(belowPos, state -> state.isAir()) && pRandom.nextFloat() < 0.50F) {
                        pBlockSetter.set(belowPos, ANBlocks.LEPIDODENDRON_CONES.get().defaultBlockState());
                    }
                }
            }
        }
    }

    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return 0;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        int dSq = dx * dx  + dz * dz;
        if (y == 1) { // Topmost layer (leafTop)
            return !((dx == 0 && dz >= -2 && dz <= 2) || (dz == 0 && dx >= -2 && dx <= 2) || (dx == 0 && dz == 0));
        }
        else if (y == 0) { // Second layer: 3x3 square with cross extensions
            return !((Math.abs(dx) <= 1 && Math.abs(dz) <= 1) || dx == 0 || dz == 0) || Math.abs(dx) > 3 || Math.abs(dz) > 3;
        }
        else if (y == -1) { // Third layer: Diagonal leaves + farthest edges
            return !((Math.abs(dx) == 0 && Math.abs(dz) == 3) || (Math.abs(dx) == 3 && Math.abs(dz) == 0) ||  // Diagonal leaves
                    (Math.abs(dx) == 4 && dz == 0) || (dx == 0 && Math.abs(dz) == 4) ||  // Extended cross arms (2 blocks long)
                    (Math.abs(dx) == 2 && Math.abs(dz) == 2)|| (Math.abs(dx) == 1 && Math.abs(dz) == 1)); // Diagonal corners directly under previous layer
        }else if (y == -2) { // Third layer: Diagonal leaves + farthest edges
            return !((Math.abs(dx) == 4 && dz == 0) || (dx == 0 && Math.abs(dz) == 4) ||  // Extended cross arms (2 blocks long)
                    (Math.abs(dx) == 2 && Math.abs(dz) == 2)); // Diagonal corners directly under previous layer
        }
        else if (y == -3){
            return !((Math.abs(dx) == 4 && dz == 0) || (dx == 0 && Math.abs(dz) == 4)) ;
        }
        else {
            return false;
        }
    }//radius != 0 && dx == radius -1 && dz == radius -1 &&
}
