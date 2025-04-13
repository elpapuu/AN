package net.rawr.ANTeam.ancientnature.registries;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ANFoods {

    public static final FoodProperties RAW_DODO
            = new FoodProperties
            .Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200), 0.1f)
            .build();
}
