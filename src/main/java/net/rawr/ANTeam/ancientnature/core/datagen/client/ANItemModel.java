package net.rawr.ANTeam.ancientnature.core.datagen.client;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.registries.ANItems;

public class ANItemModel extends ItemModelProvider {
    public ANItemModel(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AncientNature.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ANItems.AMBER.get());
        basicItem(ANItems.FERN_AMBER.get());
        basicItem(ANItems.LIZARD_AMEBR.get());
        basicItem(ANItems.MOSQUITO_AMBER.get());

        basicItem(ANItems.DEEPSLATE_CAMBRIAN_FOSSIL.get());
        basicItem(ANItems.CARBONIFEROUS_FOSSIL.get());
        basicItem(ANItems.CRETACEOUS_FOSSIL.get());
        basicItem(ANItems.DEVONIAN_FOSSIL.get());
        basicItem(ANItems.HOLOCENE_FOSSIL.get());
        basicItem(ANItems.MUDDY_FOSSIL.get());
        basicItem(ANItems.ORDOVICIAN_FOSSIL.get());
        basicItem(ANItems.PERMIAN_FOSSIL.get());
        basicItem(ANItems.DEEPSLATE_PERMIAN_FOSSIL.get());
        basicItem(ANItems.PLEISTOCENE_FOSSIL.get());

        basicItem(ANItems.ANOMALOCARIS_FOSSIL.get());
        basicItem(ANItems.ARANDASPIS_FOSSIL.get());
        basicItem(ANItems.DODO_FOSSIL.get());
        basicItem(ANItems.PARANOGMIUS_FOSSIL.get());;
        basicItem(ANItems.THYLACINE_FOSSIL.get());
        basicItem(ANItems.TRILOBITE_FOSSIL.get());
        basicItem(ANItems.TUZOIA_FOSSIL.get());

        basicItem(ANItems.GINKGO_FOSSIL.get());
        basicItem(ANItems.DEEPSLATE_GINKGO_FOSSIL.get());
        basicItem(ANItems.LEPIDODENDRON_FOSSIL.get());

        basicItem(ANItems.ANOMALOCARIS.get());
        basicItem(ANItems.COOKED_ANOMALOCARIS.get());
        basicItem(ANItems.DODO.get());
        basicItem(ANItems.COOKED_DODO.get());
        basicItem(ANItems.PARANOGMIUS.get());
        basicItem(ANItems.COOKED_PARANOGMIUS.get());
        basicItem(ANItems.TRILOBITE.get());
        basicItem(ANItems.COOKED_TRILOBITE.get());
        basicItem(ANItems.TUZOIA.get());
        basicItem(ANItems.COOKED_TUZOIA.get());
        basicItem(ANItems.TUZOIA_EGGS.get());
        basicItem(ANItems.WORM.get());

        basicItem(ANItems.MUSIC_DISC_ANCIENT_MELODY.get());
        basicItem(ANItems.MUSIC_DISC_WHERE_YOUR_JOURNEY_BEGINS.get());
    }
}