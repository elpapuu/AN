package net.reaper.ANTeam.ancientnature.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reaper.ANTeam.ancientnature.AncientNature;

import java.util.function.Supplier;

public class ANCreativeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AncientNature.MODID);

    public static final Supplier<CreativeModeTab> ANCIENTNATURE_ITEM_TAB = CREATIVE_MODE_TAB.register("ancientnature_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ANItems.DODO.get()))
                    .title(Component.translatable("creativetab.ancientnature_item_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ANItems.ANOMALOCARIS);
                        output.accept(ANItems.COOKED_ANOMALOCARIS);
                        output.accept(ANItems.DODO);
                        output.accept(ANItems.COOKED_DODO);
                        output.accept(ANItems.PARANOGMIUS);
                        output.accept(ANItems.COOKED_PARANOGMIUS);
                        output.accept(ANItems.TRILOBITE);
                        output.accept(ANItems.COOKED_TRILOBITE);
                        output.accept(ANItems.TUZOIA);
                        output.accept(ANItems.COOKED_TUZOIA);
                        output.accept(ANItems.TUZOIA_EGGS);
                        output.accept(ANItems.WORM);

                    }).build());

    public static final Supplier<CreativeModeTab> ANCIENTNATURE_BLOCKS_TAB = CREATIVE_MODE_TAB.register("ancientnature_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ANBlocks.AMBER_ORE.get()))
                    .title(Component.translatable("creativetab.ancientnature_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ANBlocks.DEEPSLATE_AMBER_ORE);
                        output.accept(ANBlocks.DEEPSLATE_CAMBRIAN_FOSSILS);
                        output.accept(ANBlocks.DEEPSLATE_ORDOVICIAN_FOSSILS);
                        output.accept(ANBlocks.DEEPSLATE_DEVONIAN_FOSSILS);
                        output.accept(ANBlocks.DEEPSLATE_CARBONIFEROUS_FOSSILS);
                        output.accept(ANBlocks.DEEPSLATE_PERMIAN_FOSSILS);
                        output.accept(ANBlocks.PERMIAN_FOSSILS);
                        output.accept(ANBlocks.CRETACEOUS_FOSSILS);
                        output.accept(ANBlocks.PLEISTOCENE_FOSSILS);
                        output.accept(ANBlocks.HOLOCENE_FOSSILS);
                        output.accept(ANBlocks.LIMESTONE_FOSSILS);
                        output.accept(ANBlocks.PERMAFROST_FOSSILS);
                        output.accept(ANBlocks.AMBER_ORE);
                        output.accept(ANBlocks.LIMESTONE);
                        output.accept(ANBlocks.LIMESTONE_SLAB);
                        output.accept(ANBlocks.LIMESTONE_STAIRS);
                        output.accept(ANBlocks.LIMESTONE_WALL);
                        output.accept(ANBlocks.LIMESTONE_BRICKS);
                        output.accept(ANBlocks.LIMESTONE_BRICKS_SLAB);
                        output.accept(ANBlocks.LIMESTONE_BRICKS_STAIRS);
                        output.accept(ANBlocks.LIMESTONE_BRICKS_WALL);
                        output.accept(ANBlocks.SMOOTH_LIMESTONE);
                        output.accept(ANBlocks.SMOOTH_LIMESTONE_SLAB);
                        output.accept(ANBlocks.SMOOTH_LIMESTONE_STAIRS);
                        output.accept(ANBlocks.SMOOTH_LIMESTONE_WALL);
                        output.accept(ANBlocks.CHISELED_LIMESTONE);
                        output.accept(ANBlocks.GINKGO_LEAVES);
                        output.accept(ANBlocks.GOLDEN_GINKGO_LEAVES);
                        output.accept(ANBlocks.GINKGO_LOG);
                        output.accept(ANBlocks.AMBER_GINKGO_LOG);
                        output.accept(ANBlocks.STRIPPED_GINKGO_LOG);
                        output.accept(ANBlocks.GINKGO_PLANKS);
                        output.accept(ANBlocks.GINKGO_SLAB);
                        output.accept(ANBlocks.GINKGO_STAIRS);
                        output.accept(ANBlocks.GINKGO_FENCE);
                        output.accept(ANBlocks.GINKGO_HANGING_SIGN);
                        output.accept(ANBlocks.GINKGO_SIGN);
                        output.accept(ANBlocks.LEPIDODENDRON_LEAVES);
                        output.accept(ANBlocks.LEPIDODENDRON_CONES);
                        output.accept(ANBlocks.LEPIDODENDRON_LOG);
                        output.accept(ANBlocks.UNSCALED_LEPIDODENDRON_LOG);
                        output.accept(ANBlocks.STRIPPED_LEPIDODENDRON_LOG);
                        output.accept(ANBlocks.LEPIDODENDRON_PLANKS);
                        output.accept(ANBlocks.LEPIDODENDRON_SLAB);
                        output.accept(ANBlocks.LEPIDODENDRON_STAIRS);
                        output.accept(ANBlocks.LEPIDODENDRON_FENCE);
                        output.accept(ANBlocks.LEPIDODENDRON_HANGING_SIGN);
                        output.accept(ANBlocks.LEPIDODENDRON_SIGN);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
