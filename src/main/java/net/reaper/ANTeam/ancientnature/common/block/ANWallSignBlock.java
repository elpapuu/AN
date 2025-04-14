package net.reaper.ANTeam.ancientnature.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.reaper.ANTeam.ancientnature.common.block.blockentity.ANSignBlockEntity;

public class ANWallSignBlock extends WallSignBlock {
    public ANWallSignBlock(Properties pProperties, WoodType pType) {
        super(pType, pProperties);
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
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new ANSignBlockEntity(pPos, pState);
    }
}