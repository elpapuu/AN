package net.rawr.ANTeam.ancientnature;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.ANFoliagePlacerTypes;
import net.rawr.ANTeam.ancientnature.common.worldgen.tree.ANTrunkPlacerTypes;
import net.rawr.ANTeam.ancientnature.registries.*;
import net.rawr.ANTeam.ancientnature.registries.util.ANWoodTypes;

@Mod(AncientNature.MOD_ID)
public class AncientNature {
    public static final String MOD_ID = "ancientnature";

    public AncientNature(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        ANCreativeTabs.register(modEventBus);
        ANItems.register(modEventBus);
        ANSounds.register(modEventBus);
        ANBlocks.register(modEventBus);

        ANTrunkPlacerTypes.register(modEventBus);
        ANFoliagePlacerTypes.register(modEventBus);

        Sheets.addWoodType(ANWoodTypes.GINKGO);
        Sheets.addWoodType(ANWoodTypes.LEPIDODENDRON);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
    public static ResourceLocation modLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
    }

    public static ResourceLocation entityTexture(String name){
        return modLoc("textures/entity/" + name);
    }


    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
