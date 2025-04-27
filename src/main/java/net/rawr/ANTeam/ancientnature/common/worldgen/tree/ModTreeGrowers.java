package net.rawr.ANTeam.ancientnature.common.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.common.worldgen.ANConfiguredFeatures;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower GINKGO = new TreeGrower(AncientNature.MOD_ID + ":ginkgo",
            Optional.empty(),  Optional.of(ANConfiguredFeatures.GINKGO_TREE_KEY), Optional.of(ANConfiguredFeatures.HUGE_GINKGO_TREE_KEY));

    public static final TreeGrower LEPIDODENDRON = new TreeGrower(AncientNature.MOD_ID + ":lepidodendron",
            Optional.empty(),  Optional.of(ANConfiguredFeatures.LEPIDODENDRON_TREE_KEY), Optional.empty());


}
