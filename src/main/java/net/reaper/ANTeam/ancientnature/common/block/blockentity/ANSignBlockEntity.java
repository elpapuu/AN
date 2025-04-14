package net.reaper.ANTeam.ancientnature.common.block.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.reaper.ANTeam.ancientnature.registries.ANBlockEntities;

public class ANSignBlockEntity extends SignBlockEntity {
    public ANSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ANBlockEntities.MOD_SIGN.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ANBlockEntities.MOD_SIGN.get();
    }
}