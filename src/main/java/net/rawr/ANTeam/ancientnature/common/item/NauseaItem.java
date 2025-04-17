package net.rawr.ANTeam.ancientnature.common.item;

import net.minecraft.world.effect.MobEffectInstance;
 import net.minecraft.world.effect.MobEffects;
 import net.minecraft.world.entity.LivingEntity;
 import net.minecraft.world.item.Item;
 import net.minecraft.world.item.ItemStack;
 import net.minecraft.world.level.Level;
 import org.jetbrains.annotations.NotNull;
 
 public class NauseaItem extends Item {
     public NauseaItem(Properties pProperties) {
         super(pProperties);
     }
 
     @Override
     public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pItemStack, @NotNull Level pLevel, @NotNull LivingEntity pEntity) {
         if (!pLevel.isClientSide) {
             pEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 400, 0));
         }
         return super.finishUsingItem(pItemStack, pLevel, pEntity);
     }
 }