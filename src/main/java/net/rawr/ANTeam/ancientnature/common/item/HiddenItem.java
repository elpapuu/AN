package net.rawr.ANTeam.ancientnature.common.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class HiddenItem extends Item {
    public HiddenItem(Properties properties) {
        super(properties);
    }

    @Override
    public String getDescriptionId(ItemStack stack) {
        return "";
    }
}