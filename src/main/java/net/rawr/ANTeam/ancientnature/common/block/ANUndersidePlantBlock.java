package net.rawr.ANTeam.ancientnature.common.block;

import net.minecraft.core.BlockPos;
 import net.minecraft.core.Direction;
 import net.minecraft.tags.BlockTags;
 import net.minecraft.world.level.LevelAccessor;
 import net.minecraft.world.level.LevelReader;
 import net.minecraft.world.level.block.Block;
 import net.minecraft.world.level.block.Blocks;
 import net.minecraft.world.level.block.state.BlockBehaviour;
 import net.minecraft.world.level.block.state.BlockState;
 
 public class ANUndersidePlantBlock extends Block {
 
     public ANUndersidePlantBlock(BlockBehaviour.Properties properties) {
         super(properties);
     }
 
     @Override
     public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
         BlockPos abovePos = pos.above();
         BlockState aboveState = level.getBlockState(abovePos);
         return aboveState.isFaceSturdy(level, abovePos, Direction.DOWN) ||
                 aboveState.is(BlockTags.LEAVES);
     }
 
     @Override
     public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState,
                                   LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
         if (direction == Direction.UP && !canSurvive(state, level, pos)) {
             return Blocks.AIR.defaultBlockState();
         }
         return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
     }
 }