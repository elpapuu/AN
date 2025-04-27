package net.rawr.ANTeam.ancientnature.common.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.foliage.GinkgoFoliagePlacer;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.foliage.LepidodendronFoliagePlacer;

import java.util.function.Supplier;

public class ANFoliagePlacerTypes {

    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, AncientNature.MOD_ID);

    public static final Supplier<FoliagePlacerType<GinkgoFoliagePlacer>> GINKGO_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("ginkgo_foliage_placer", () -> new FoliagePlacerType<>(GinkgoFoliagePlacer.CODEC));
    public static final Supplier<FoliagePlacerType<LepidodendronFoliagePlacer>> LEPIDODENDRON_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("lepidodendron_foliage_placer", () -> new FoliagePlacerType<>(LepidodendronFoliagePlacer.CODEC));
    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}
