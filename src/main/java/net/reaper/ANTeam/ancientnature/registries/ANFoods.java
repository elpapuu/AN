package net.reaper.ANTeam.ancientnature.registries;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ANFoods {

    public static final FoodProperties ANOMALOCARIS
            = new FoodProperties
            .Builder()
            .nutrition(2)
            .saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3f)
            .build();

    public static final FoodProperties COOKED_ANOMALOCARIS
            = new FoodProperties
            .Builder()
            .nutrition(5)
            .saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 0.1f)
            .build();

    public static final FoodProperties DODO
            = new FoodProperties
            .Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3f)
            .build();

    public static final FoodProperties COOKED_DODO
            = new FoodProperties
            .Builder()
            .nutrition(3)
            .saturationModifier(0.7f)
            .build();

    public static final FoodProperties PARANOGMIUS
            = new FoodProperties
            .Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .build();

    public static final FoodProperties COOKED_PARANOGMIUS
            = new FoodProperties
            .Builder()
            .nutrition(7)
            .saturationModifier(0.7f)
            .build();

    public static final FoodProperties TRILOBITE
            = new FoodProperties
            .Builder()
            .nutrition(2)
            .saturationModifier(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 600, 0), 0.3f)
            .build();

    public static final FoodProperties COOKED_TRILOBITE
            = new FoodProperties
            .Builder()
            .nutrition(6)
            .saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 0.3f)
            .build();

    public static final FoodProperties TUZOIA
            = new FoodProperties
            .Builder()
            .nutrition(2)
            .saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3f)
            .build();

    public static final FoodProperties COOKED_TUZOIA
            = new FoodProperties
            .Builder()
            .nutrition(1)
            .saturationModifier(0.2f)
            .build();

    public static final FoodProperties TUZOIA_EGGS
            = new FoodProperties
            .Builder()
            .nutrition(6)
            .saturationModifier(0.5f)
            .fast()
            .build();

    public static final FoodProperties WORM
            = new FoodProperties
            .Builder()
            .nutrition(1)
            .saturationModifier(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 0.3f)
            .build();
}