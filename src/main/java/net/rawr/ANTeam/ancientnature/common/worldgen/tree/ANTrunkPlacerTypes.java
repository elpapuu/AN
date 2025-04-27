package net.rawr.ANTeam.ancientnature.common.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.trunk.GinkgoTrunkPlacer;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.trunk.LepidodendronTrunkPlacer;

import java.util.function.Supplier;

public class ANTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, AncientNature.MOD_ID);

    public static final Supplier<TrunkPlacerType<GinkgoTrunkPlacer>> GINKGO_TRUNK_PLACER =
            TRUNK_PLACERS.register("ginkgo_trunk_placer", () -> new TrunkPlacerType<>(GinkgoTrunkPlacer.CODEC));

    public static final Supplier<TrunkPlacerType<LepidodendronTrunkPlacer>> LEPIDODENDRON_TRUNK_PLACER =
            TRUNK_PLACERS.register("lepidodendron_trunk_placer", () -> new TrunkPlacerType<>(LepidodendronTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACERS.register(eventBus);
    }
}
