package net.reaper.ANTeam.ancientnature.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.reaper.ANTeam.ancientnature.AncientNature;
import java.util.function.Supplier;

public class ANEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, AncientNature.MODID);

    public static void register(IEventBus eventBus) {ENTITY_TYPES.register(eventBus);
    }
}
