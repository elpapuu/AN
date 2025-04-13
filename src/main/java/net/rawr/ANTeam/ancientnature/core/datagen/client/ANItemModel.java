package net.rawr.ANTeam.ancientnature.core.datagen.client;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.registries.ANItems;

public class ANItemModel extends ItemModelProvider {
    public ANItemModel(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AncientNature.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
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
    }
}