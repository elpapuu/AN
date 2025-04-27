package net.rawr.ANTeam.ancientnature.common.worldgen.tree.trunk;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.ANTrunkPlacerTypes;

import java.util.List;
import java.util.function.BiConsumer;

public class LepidodendronTrunkPlacer extends TrunkPlacer {

    public static final MapCodec<LepidodendronTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec((instance) ->
            trunkPlacerParts(instance).apply(instance, LepidodendronTrunkPlacer::new));

    private LepidodendronTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB){
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }
    public LepidodendronTrunkPlacer() {
        this(0, 0, 0);
    }




    @Override
    protected TrunkPlacerType<?> type() {
        return ANTrunkPlacerTypes.LEPIDODENDRON_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {
        int height = 34;

        BlockPos.MutableBlockPos mutable = pPos.mutable();
        BlockPos below = mutable.below();
        setDirtAt(pLevel, pBlockSetter, pRandom, below, pConfig);
        List<FoliagePlacer.FoliageAttachment> list = Lists.newArrayList();

        for(int y = 0; y <= height; y++){
            BlockPos logPos = pPos.above(y);
            this.placeLog(pLevel, pBlockSetter, pRandom, logPos, pConfig);
            if (y <= 3){
                this.placeLog(pLevel, pBlockSetter, pRandom, logPos.north(), pConfig);
                this.placeLog(pLevel, pBlockSetter, pRandom, logPos.south(), pConfig);
                this.placeLog(pLevel, pBlockSetter, pRandom, logPos.east(), pConfig);
                this.placeLog(pLevel, pBlockSetter, pRandom, logPos.west(), pConfig);
                if (y <= 1){
                    this.placeLog(pLevel, pBlockSetter, pRandom, logPos.north().west(), pConfig);
                    this.placeLog(pLevel, pBlockSetter, pRandom, logPos.north().east(), pConfig);
                    this.placeLog(pLevel, pBlockSetter, pRandom, logPos.south().west(), pConfig);
                    this.placeLog(pLevel, pBlockSetter, pRandom, logPos.south().east(), pConfig);
                    if (y == 0){
                        this.placeLog(pLevel, pBlockSetter, pRandom, logPos.north(2), pConfig);
                        this.placeLog(pLevel, pBlockSetter, pRandom, logPos.south(2), pConfig);
                        this.placeLog(pLevel, pBlockSetter, pRandom, logPos.east(2), pConfig);
                        this.placeLog(pLevel, pBlockSetter, pRandom, logPos.west(2), pConfig);
                    }
                }

            }
            if (y == height){
                this.placeLog(pLevel, pBlockSetter, pRandom, logPos.north(), pConfig);
                this.placeLog(pLevel, pBlockSetter, pRandom, logPos.south(), pConfig);
                this.placeLog(pLevel, pBlockSetter, pRandom, logPos.east(), pConfig);
                this.placeLog(pLevel, pBlockSetter, pRandom, logPos.west(), pConfig);
            }
        }

        list.add(new FoliagePlacer.FoliageAttachment(mutable.above(height), 0, false));
        return list;
    }
}
