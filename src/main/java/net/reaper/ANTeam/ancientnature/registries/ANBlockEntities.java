package net.reaper.ANTeam.ancientnature.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reaper.ANTeam.ancientnature.AncientNature;
import net.reaper.ANTeam.ancientnature.common.block.blockentity.ANHangingSignBlockEntity;
import net.reaper.ANTeam.ancientnature.common.block.blockentity.ANSignBlockEntity;

import java.util.function.Supplier;

public class ANBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> TES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, AncientNature.MODID);

    public static final Supplier<BlockEntityType<ANSignBlockEntity>> MOD_SIGN = TES.register("mod_sign", () -> BlockEntityType.Builder.of(ANSignBlockEntity::new,
            ANBlocks.LEPIDODENDRON_SIGN.get(), ANBlocks.LEPIDODENDRON_WALL_SIGN.get(), ANBlocks.GINKGO_SIGN.get(), ANBlocks.GINKGO_WALL_SIGN.get()).build(null));

    public static final Supplier<BlockEntityType<ANHangingSignBlockEntity>> MOD_HANGING_SIGN = TES.register("mod_hanging_sign", () -> BlockEntityType.Builder.of(ANHangingSignBlockEntity::new,
            ANBlocks.LEPIDODENDRON_HANGING_SIGN.get(), ANBlocks.LEPIDODENDRON_WALL_HANGING_SIGN.get(), ANBlocks.GINKGO_HANGING_SIGN.get(), ANBlocks.GINKGO_WALL_HANGING_SIGN.get()).build(null));

}