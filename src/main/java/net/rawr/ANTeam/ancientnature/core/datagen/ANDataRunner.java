package net.rawr.ANTeam.ancientnature.core.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.core.datagen.client.ANBlockStateProvider;
import net.rawr.ANTeam.ancientnature.core.datagen.client.ANItemModel;
import net.rawr.ANTeam.ancientnature.core.datagen.client.ANDatapackProvider;
import net.rawr.ANTeam.ancientnature.core.datagen.client.ANItemTagGenerator;
import net.rawr.ANTeam.ancientnature.core.datagen.server.ANBlockTagsProvider;
import net.rawr.ANTeam.ancientnature.core.datagen.server.loot.ANBlockLootTableProvider;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = AncientNature.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ANDataRunner {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        PackOutput output = event.getGenerator().getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        var generator = event.getGenerator();

        if (event.includeClient()) {
            generator.addProvider(event.includeServer(), new LootTableProvider(output, Collections.emptySet(),
                    List.of(new LootTableProvider.SubProviderEntry(ANBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
            generator.addProvider(true, new ANItemModel(output, helper));
            generator.addProvider(true, new ANBlockStateProvider(output, helper));
            generator.addProvider(event.includeServer(), new ANDatapackProvider(output, lookupProvider));
            ANBlockTagsProvider blockTags = generator.addProvider(event.includeServer(), new ANBlockTagsProvider(output, lookupProvider, helper));
            generator.addProvider(true, new ANItemTagGenerator(output, lookupProvider, blockTags.contentsGetter(), helper));
        }
    }
}