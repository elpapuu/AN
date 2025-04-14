package net.rawr.ANTeam.ancientnature.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rawr.ANTeam.ancientnature.AncientNature;

import java.util.function.Supplier;

public class ANCreativeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AncientNature.MODID);

    public static final Supplier<CreativeModeTab> ANCIENTNATURE_ITEMS_TAB = CREATIVE_MODE_TAB.register("ancientnature_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ANItems.MOSQUITO_AMBER.get()))
                    .title(Component.translatable("creativetab.ancientnature_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ANItems.AMBER);
                        output.accept(ANItems.FERN_AMBER);
                        output.accept(ANItems.LIZARD_AMEBR);
                        output.accept(ANItems.MOSQUITO_AMBER);
                        output.accept(ANItems.DEEPSLATE_CAMBRIAN_FOSSIL);
                        output.accept(ANItems.CARBONIFEROUS_FOSSIL);
                        output.accept(ANItems.CRETACEOUS_FOSSIL);
                        output.accept(ANItems.DEVONIAN_FOSSIL);
                        output.accept(ANItems.HOLOCENE_FOSSIL);
                        output.accept(ANItems.MUDDY_FOSSIL);
                        output.accept(ANItems.ORDOVICIAN_FOSSIL);
                        output.accept(ANItems.PERMIAN_FOSSIL);
                        output.accept(ANItems.DEEPSLATE_PERMIAN_FOSSIL);
                        output.accept(ANItems.PLEISTOCENE_FOSSIL);
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
                        output.accept(ANItems.MUSIC_DISC_ANCIENT_MELODY);
                        output.accept(ANItems.MUSIC_DISC_WHERE_YOUR_JOURNEY_BEGINS);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
