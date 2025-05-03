package net.rawr.ANTeam.ancientnature.registries;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rawr.ANTeam.ancientnature.AncientNature;

import java.util.function.Supplier;

public class ANSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, AncientNature.MOD_ID);

    public static final ResourceKey<JukeboxSong> ANCIENT_MELODY_RESOURCE_KEY = createDiscSound("ancient_melody");
    private static final Supplier<SoundEvent> ANCIENT_MELODY = registerSoundEvent("ancient_melody");
    public static final ResourceKey<JukeboxSong> WHERE_YOUR_JOURNEY_BEGINS_RESOURCE_KEY = createDiscSound("where_your_journey_begins");
    private static final Supplier<SoundEvent> WHERE_YOUR_JOURNEY_BEGINS = registerSoundEvent("where_your_journey_begins");

    public static final Supplier<SoundEvent> LEPIDODENDRON_SCALE_DROP = registerSoundEvent("lepidodendron_scale_drop_1");

    private static ResourceKey<JukeboxSong> createDiscSound(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(AncientNature.MOD_ID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(AncientNature.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}