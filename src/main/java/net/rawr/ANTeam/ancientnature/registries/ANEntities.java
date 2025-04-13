package net.rawr.ANTeam.ancientnature.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rawr.ANTeam.ancientnature.AncientNature;

public class ANEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, AncientNature.MODID);



    public static void register(IEventBus eventBus) {ENTITY_TYPES.register(eventBus);
    }
}
