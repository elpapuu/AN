package net.reaper.ANTeam.ancientnature.common.block.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.reaper.ANTeam.ancientnature.registries.ANBlockEntities;

public class ANHangingSignBlockEntity extends HangingSignBlockEntity {
    public ANHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ANBlockEntities.MOD_HANGING_SIGN.get();
    }
}