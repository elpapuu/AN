package net.rawr.ANTeam.ancientnature.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.rawr.ANTeam.ancientnature.registries.ANBlocks;
import net.rawr.ANTeam.ancientnature.registries.ANItems;
import org.jetbrains.annotations.NotNull;

public class ItemDropperBlock extends RotatedPillarBlock {

    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST);

    public ItemDropperBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.SOUTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        if (state.is(ANBlocks.AMBER_GINKGO_LOG.get())) {
            return true;
        } else return false;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        if (state.is(ANBlocks.AMBER_GINKGO_LOG.get())) {
            return 5;
        } else return 0;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        if (state.is(ANBlocks.AMBER_GINKGO_LOG.get())) {
            return 5;
        } else return 0;
    }


    @Override
    public @NotNull ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player,
                                                    InteractionHand hand, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(hand);

        if (heldItem.getItem() instanceof PickaxeItem) {
            if (state.is(ANBlocks.AMBER_GINKGO_LOG.get())) {
                if (!level.isClientSide) { // Only run on the server
                    // Generate random chance
                    double chance = Math.random();

                    // Check chances and drop items accordingly
                    if (chance < 0.7) { // 70% chance to drop item A
                        popResource(level, pos, new ItemStack(ANItems.AMBER.get(), 1));
                        if (chance < 0.75) { // 70% chance to drop item A
                            popResource(level, pos, new ItemStack(ANItems.FERN_AMBER.get(), 1));
                        } else if (chance < 0.95) { // Additional 20% chance to drop item C
                            popResource(level, pos, new ItemStack(ANItems.MUSIC_DISC_WHERE_YOUR_JOURNEY_BEGINS.get(), 2));
                        }
                    }
                    // Change the block to ANBlocks.GINKGO_LOG
                    level.setBlock(pos, ANBlocks.GINKGO_LOG.get().defaultBlockState(), 3);
                    // Play a sound at the block's position
                    level.playSound(
                            null, // Player (null means all players hear it)
                            pos,  // Position of the sound
                            SoundEvents.CHICKEN_EGG, // Sound event (use a fitting sound here)
                            SoundSource.BLOCKS, // Sound category
                            1.0F, // Volume
                            1.0F // Pitch
                    );

                    // Optionally return a new block state or allow interaction to proceed
                    return ItemInteractionResult.SUCCESS;
                }
            }
        }
        if (heldItem.getItem() instanceof AxeItem) {
            if (state.is(ANBlocks.LEPIDODENDRON_LOG.get())) {
                if (!level.isClientSide) { // Only run on the server
                    // Generate random chance
                    double chance = Math.random();

                    // Check chances and drop items accordingly
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
                    // Change the block to ANBlocks.GINKGO_LOG
                    level.setBlock(pos, ANBlocks.UNSCALED_LEPIDODENDRON_LOG.get().defaultBlockState(), 3);
                    // Play a sound at the block's position
                    level.playSound(
                            null, // Player (null means all players hear it)
                            pos,  // Position of the sound
                            SoundEvents.CHICKEN_EGG, // Sound event (use a fitting sound here)
                            SoundSource.BLOCKS, // Sound category
                            1.0F, // Volume
                            1.0F // Pitch
                    );

                    // Optionally return a new block state or allow interaction to proceed
                    return ItemInteractionResult.SUCCESS;
                }
            }
        }
        return super.useItemOn(stack, state, level, pos, player, hand, hit);
    }
}
