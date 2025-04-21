package net.rawr.ANTeam.ancientnature.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.rawr.ANTeam.ancientnature.registries.util.ResourceUtils;
import org.jetbrains.annotations.NotNull;

public class ANTags {
    public static class Items {
        public static final TagKey<Item> FOSSILS = bind("fossils");

        public static final TagKey<Item> ANIMAL_AMBERS = bind("animal_ambers");
        public static final TagKey<Item> FLORA_AMBERS = bind("flora_ambers");

        public static final TagKey<Item> RAW_MEAT = bind("raw_food");
        public static final TagKey<Item> COOKED_MEAT = bind("cooked_food");

        public static final TagKey<Item> LEPIDODENDRON_LOGS = bind("lepidodendron_logs");
        public static final TagKey<Item> GINKGO_LOGS = bind("ginkgo_logs");

        private static @NotNull TagKey<Item> bind(String pName) {
            return TagKey.create(Registries.ITEM, ResourceUtils.modLoc(pName));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> FOSSILS = bindBlock("fossils");
        public static final TagKey<Block> TRILOBITE_TARGET_EGGS = bindBlock("trilobite_target_eggs");
        public static final TagKey<Block> DINO_EGGS_BOOST_BLOCKS = bindBlock("dino_eggs_boost_blocks");

        private static @NotNull TagKey<Block> bindBlock(String pName) {
            return TagKey.create(Registries.BLOCK, ResourceUtils.modLoc(pName));
        }
    }
}