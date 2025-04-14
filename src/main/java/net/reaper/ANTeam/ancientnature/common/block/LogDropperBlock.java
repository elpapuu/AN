package net.reaper.ANTeam.ancientnature.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.reaper.ANTeam.ancientnature.registries.ANBlocks;
import net.reaper.ANTeam.ancientnature.registries.ANItems;
import org.jetbrains.annotations.NotNull;

public class LogDropperBlock extends RotatedPillarBlock {

    public LogDropperBlock(Properties pProperties) {
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

    public @NotNull InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(hand);
        if (heldItem.getItem() instanceof AxeItem) {
            if (state.is(ANBlocks.LEPIDODENDRON_LOG.get())) {
                if (!level.isClientSide) { // Only run on the server
                    // Generate random chance
                    double chance = Math.random();

                    // Check chances and drop items accordingly
                    if (chance < 0.7) { // 70% chance to drop item A
                        popResource(level, pos, new ItemStack(ANItems.LEPIDODENDRON_SCALE.get(), 1));
                        if (chance < 0.75) { // 70% chance to drop item A
                            popResource(level, pos, new ItemStack(ANItems.LEPIDODENDRON_SCALE.get(), 3));
                        }
                    }
                    // Change the block to ANBlocks.GINKGO_LOG
                    level.setBlock(pos, ANBlocks.UNSCALED_LEPIDODENDRON_LOG.get().defaultBlockState(), 3);
                    // Play a sound at the block's position
                    level.playSound(
                            null,
                            pos,
                            SoundEvents.CHICKEN_EGG,
                            SoundSource.BLOCKS,
                            1.0F,
                            1.0F
                    );
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return use(state, level, pos, player, hand, hit);
    }
}