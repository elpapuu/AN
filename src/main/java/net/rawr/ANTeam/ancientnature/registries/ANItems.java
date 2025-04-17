package net.rawr.ANTeam.ancientnature.registries;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rawr.ANTeam.ancientnature.AncientNature;
import net.rawr.ANTeam.ancientnature.common.item.NauseaItem;

public class ANItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AncientNature.MODID);

    public static final DeferredItem<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERN_AMBER = ITEMS.register("fern_amber", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIZARD_AMEBR = ITEMS.register("lizard_amber", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOSQUITO_AMBER = ITEMS.register("mosquito_amber", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DEEPSLATE_CAMBRIAN_FOSSIL = ITEMS.register("deepslate_cambrian_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CARBONIFEROUS_FOSSIL = ITEMS.register("carboniferous_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRETACEOUS_FOSSIL = ITEMS.register("cretaceous_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEVONIAN_FOSSIL = ITEMS.register("devonian_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HOLOCENE_FOSSIL = ITEMS.register("holocene_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUDDY_FOSSIL = ITEMS.register("muddy_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORDOVICIAN_FOSSIL = ITEMS.register("ordovician_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PERMIAN_FOSSIL = ITEMS.register("permian_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEEPSLATE_PERMIAN_FOSSIL = ITEMS.register("deepslate_permian_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLEISTOCENE_FOSSIL = ITEMS.register("pleistocene_fossil", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANOMALOCARIS_FOSSIL = ITEMS.register("anomalocaris_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARANDASPIS_FOSSIL = ITEMS.register("arandaspis_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DODO_FOSSIL = ITEMS.register("dodo_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PARANOGMIUS_FOSSIL = ITEMS.register("paranogmius_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THYLACINE_FOSSIL = ITEMS.register("thylacine_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TRILOBITE_FOSSIL = ITEMS.register("trilobite_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUZOIA_FOSSIL = ITEMS.register("tuzoia_fossil", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GINKGO_FOSSIL = ITEMS.register("ginkgo_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEEPSLATE_GINKGO_FOSSIL = ITEMS.register("deepslate_ginkgo_fossil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEPIDODENDRON_FOSSIL = ITEMS.register("lepidodendron_fossil", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANOMALOCARIS = ITEMS.register("anomalocaris", () -> new Item(new Item.Properties().food(ANFoods.ANOMALOCARIS)));
    public static final DeferredItem<Item> COOKED_ANOMALOCARIS = ITEMS.register("cooked_anomalocaris", () -> new Item(new Item.Properties().food(ANFoods.COOKED_ANOMALOCARIS)));
    public static final DeferredItem<Item> DODO = ITEMS.register("dodo", () -> new Item(new Item.Properties().food(ANFoods.DODO)));
    public static final DeferredItem<Item> COOKED_DODO = ITEMS.register("cooked_dodo", () -> new Item(new Item.Properties().food(ANFoods.COOKED_DODO)));
    public static final DeferredItem<Item> PARANOGMIUS = ITEMS.register("paranogmius", () -> new Item(new Item.Properties().food(ANFoods.PARANOGMIUS)));
    public static final DeferredItem<Item> COOKED_PARANOGMIUS = ITEMS.register("cooked_paranogmius", () -> new Item(new Item.Properties().food(ANFoods.COOKED_PARANOGMIUS)));
    public static final DeferredItem<Item> TRILOBITE = ITEMS.register("trilobite", () -> new Item(new Item.Properties().food(ANFoods.TRILOBITE)));
    public static final DeferredItem<Item> COOKED_TRILOBITE = ITEMS.register("cooked_trilobite", () -> new Item(new Item.Properties().food(ANFoods.COOKED_TRILOBITE)));
    public static final DeferredItem<Item> TUZOIA = ITEMS.register("tuzoia", () -> new Item(new Item.Properties().food(ANFoods.TUZOIA)));
    public static final DeferredItem<Item> COOKED_TUZOIA = ITEMS.register("cooked_tuzoia", () -> new Item(new Item.Properties().food(ANFoods.COOKED_TUZOIA)));
    public static final DeferredItem<Item> TUZOIA_EGGS = ITEMS.register("tuzoia_eggs", () -> new Item(new Item.Properties().food(ANFoods.TUZOIA_EGGS)));
    public static final DeferredItem<Item> WORM = ITEMS.register("worm", () -> new NauseaItem(new Item.Properties().food(ANFoods.WORM)));

    public static final DeferredItem<Item> MUSIC_DISC_ANCIENT_MELODY = ITEMS.register("music_disc_ancient_melody", () -> new Item(new Item.Properties().jukeboxPlayable(ANSounds.ANCIENT_MELODY_RESOURCE_KEY).stacksTo(1)));
    public static final DeferredItem<Item> MUSIC_DISC_WHERE_YOUR_JOURNEY_BEGINS = ITEMS.register("music_disc_where_your_journey_begins", () -> new Item(new Item.Properties().jukeboxPlayable(ANSounds.WHERE_YOUR_JOURNEY_BEGINS_RESOURCE_KEY).stacksTo(1)));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);
    }
}