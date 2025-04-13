package net.rawr.ANTeam.ancientnature.registries;

import com.google.common.base.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rawr.ANTeam.ancientnature.AncientNature;

public class ANBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AncientNature.MODID);



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, boolean registerItem) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        if (registerItem) {
            ANItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties()));
        }
        return toReturn;
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        return registerBlock(name, block, true);
    }
    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);
    }
}
