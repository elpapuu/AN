package net.reaper.ANTeam.ancientnature.registries.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.reaper.ANTeam.ancientnature.AncientNature;

public class ANWoodTypes {
    public static final WoodType LEPIDODENDRON = WoodType.register(new WoodType(AncientNature.MODID + ":lepidodendron", BlockSetType.OAK));
    public static final WoodType GINKGO = WoodType.register(new WoodType(AncientNature.MODID + ":ginkgo", BlockSetType.OAK));
}