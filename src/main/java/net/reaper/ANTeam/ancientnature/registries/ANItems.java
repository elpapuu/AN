package net.reaper.ANTeam.ancientnature.registries;

import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reaper.ANTeam.ancientnature.AncientNature;
import net.reaper.ANTeam.ancientnature.common.item.NauseaItem;

public class ANItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AncientNature.MODID);
    public static final DeferredItem<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> MOSQUITO_AMBER = ITEMS.register("mosquito_amber", () -> new Item(new Item.Properties().fireResistant().stacksTo(16)));
    public static final DeferredItem<Item> LIZARD_AMBER = ITEMS.register("lizard_amber", () -> new Item(new Item.Properties().fireResistant().stacksTo(16)));
    public static final DeferredItem<Item> FERN_AMBER = ITEMS.register("fern_amber", () -> new Item(new Item.Properties().fireResistant().stacksTo(16)));

    public static final DeferredItem<Item> LEPIDODENDRON_SCALE = ITEMS.register("lepidodendron_scale", () -> new Item(new Item.Properties()));

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

    //SIGNS
    public static final DeferredItem<Item> GINKGO_SIGN = ITEMS.register("ginkgo_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ANBlocks.GINKGO_SIGN.get(), ANBlocks.GINKGO_WALL_SIGN.get()));
    public static final DeferredItem<Item> LEPIDODENDRON_SIGN = ITEMS.register("lepidodendron_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ANBlocks.LEPIDODENDRON_SIGN.get(), ANBlocks.LEPIDODENDRON_WALL_SIGN.get()));
    public static final DeferredItem<Item> GINKGO_HANGING_SIGN = ITEMS.register("ginkgo_hanging_sign", () -> new HangingSignItem(ANBlocks.GINKGO_HANGING_SIGN.get(), ANBlocks.GINKGO_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> LEPIDODENDRON_HANGING_SIGN = ITEMS.register("lepidodendron_hanging_sign", () -> new HangingSignItem(ANBlocks.LEPIDODENDRON_HANGING_SIGN.get(), ANBlocks.LEPIDODENDRON_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);
    }
}