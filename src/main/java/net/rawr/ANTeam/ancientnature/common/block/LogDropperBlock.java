package net.rawr.ANTeam.ancientnature.common.block;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.common.ItemAbility;
import net.rawr.ANTeam.ancientnature.registries.ANBlocks;
import net.rawr.ANTeam.ancientnature.registries.ANItems;
import net.rawr.ANTeam.ancientnature.registries.ANSounds;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    @Override
    public @NotNull ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player,
                                                    InteractionHand hand, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(hand);
        if (heldItem.getItem() instanceof AxeItem) {
            if (state.is(ANBlocks.LEPIDODENDRON_LOG.get())) {
                if (!level.isClientSide) {
                    double chance = Math.random();

                    if (chance < 0.7) { // 70% chance to drop item A
                        popResource(level, pos, new ItemStack(ANItems.LEPIDODENDRON_SCALE.get(), 1));
                        if (chance < 0.75) { // 70% chance to drop item A
                            popResource(level, pos, new ItemStack(ANItems.LEPIDODENDRON_SCALE.get(), 1));
                        } else if (chance < 0.85) { // Additional 20% chance to drop item B
                            popResource(level, pos, new ItemStack(ANItems.LEPIDODENDRON_SCALE.get(), 1));
                        } else if (chance < 0.95) { // Additional 20% chance to drop item C
                            popResource(level, pos, new ItemStack(ANItems.MUSIC_DISC_ANCIENT_MELODY.get(), 2));
                        }
                    }
                    level.setBlock(pos, ANBlocks.UNSCALED_LEPIDODENDRON_LOG.get().defaultBlockState(), 3);
                    level.playSound(
                            null,
                            pos,
                            SoundEvents.BAMBOO_WOOD_BREAK,
                            SoundSource.BLOCKS,
                            1.0F,
                            1.0F
                    );
                    return ItemInteractionResult.SUCCESS;
                }
            }
        }
        return super.useItemOn(stack, state, level, pos, player, hand, hit);
    }
}