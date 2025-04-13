package net.rawr.ANTeam.ancientnature.registries;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rawr.ANTeam.ancientnature.AncientNature;

public class ANItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AncientNature.MODID);

    public static final DeferredItem<Item> RAW_DODO = ITEMS.register("raw_dodo", () -> new Item(new Item.Properties().food(ANFoods.RAW_DODO)));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);
    }
}
