package net.rawr.ANTeam.ancientnature.core.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.core.datagen.client.ANItemModel;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = AncientNature.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ANDataRunner {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        PackOutput output = event.getGenerator().getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        var generator = event.getGenerator();

        if (event.includeClient()) {
            generator.addProvider(true, new ANItemModel(output, helper));
        }
    }
}