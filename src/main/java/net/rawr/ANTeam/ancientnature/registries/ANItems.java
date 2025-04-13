package net.rawr.ANTeam.ancientnature.registries;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rawr.ANTeam.ancientnature.AncientNature;

public class ANItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AncientNature.MODID);

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
    public static final DeferredItem<Item> WORM = ITEMS.register("worm", () -> new Item(new Item.Properties().food(ANFoods.WORM)));



    public static final DeferredItem<Item> SEA_SNACK = ITEMS.register("sea_snack", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);
    }
}