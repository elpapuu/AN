package net.rawr.ANTeam.ancientnature.common.block;

import net.minecraft.core.BlockPos;
 import net.minecraft.core.Direction;
 import net.minecraft.world.item.AxeItem;
 import net.minecraft.world.item.context.UseOnContext;
 import net.minecraft.world.level.BlockGetter;
 import net.minecraft.world.level.block.RotatedPillarBlock;
 import net.minecraft.world.level.block.state.BlockState;
 import net.neoforged.neoforge.common.ItemAbility;
 import net.rawr.ANTeam.ancientnature.registries.ANBlocks;
 import org.jetbrains.annotations.Nullable;
 
 public class LogBlock extends RotatedPillarBlock {
 
     public LogBlock(Properties pProperties) {
         super(pProperties);
     }
     @Override
     public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
         return true;
     }
     @Override
     public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
         return 5;
     }
     @Override
     public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
         return 5;
     }
     @Override
     public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility toolAction, boolean simulate) {
         if(context.getItemInHand().getItem() instanceof AxeItem) {
             if(state.is(ANBlocks.GINKGO_LOG.get())) {
                 return ANBlocks.STRIPPED_GINKGO_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
             }
             else if(state.is(ANBlocks.UNSCALED_LEPIDODENDRON_LOG.get())) {
                 return ANBlocks.STRIPPED_LEPIDODENDRON_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
             }
         }
     return super.getToolModifiedState(state, context, toolAction, simulate);
    }
 }