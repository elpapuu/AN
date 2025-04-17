package net.rawr.ANTeam.ancientnature.common.block;

import net.minecraft.core.BlockPos;
 import net.minecraft.core.Direction;
 import net.minecraft.util.ParticleUtils;
 import net.minecraft.util.RandomSource;
 import net.minecraft.world.level.BlockGetter;
 import net.minecraft.world.level.Level;
 import net.minecraft.world.level.block.LeavesBlock;
 import net.minecraft.world.level.block.state.BlockBehaviour;
 import net.minecraft.world.level.block.state.BlockState;
 import net.rawr.ANTeam.ancientnature.registries.ANBlocks;
 import net.rawr.ANTeam.ancientnature.registries.ANParticles;
 
 public class ANLeavesBlock extends LeavesBlock {
     public ANLeavesBlock(BlockBehaviour.Properties p_273704_) {
         super(p_273704_);
     }
     @Override
     public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
         return true;
     }
     @Override
     public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
         return 60;
     }
     @Override
     public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
         return 30;
     }
 
     public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
         super.animateTick(state , level, pos, random);
         if (random.nextInt(10) == 0 && state.is(ANBlocks.GINKGO_LEAVES.get())) {
             BlockPos $$4 = pos.below();
             BlockState $$5 = level.getBlockState($$4);
             if (!isFaceFull($$5.getCollisionShape(level, $$4), Direction.UP)) {
                 ParticleUtils.spawnParticleBelow(level , pos, random, ANParticles.GINKGO_PARTICLE.get());
             }
         }
         else if (random.nextInt(10) == 0 && state.is(ANBlocks.GOLDEN_GINKGO_LEAVES.get())) {
             BlockPos $$4 = pos.below();
             BlockState $$5 = level.getBlockState($$4);
             if (!isFaceFull($$5.getCollisionShape(level, $$4), Direction.UP)) {
                 ParticleUtils.spawnParticleBelow(level , pos, random, ANParticles.GOLDEN_GINKGO_PARTICLE.get());
             }
         }
     }
 }