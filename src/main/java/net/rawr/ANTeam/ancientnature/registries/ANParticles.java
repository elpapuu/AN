package net.rawr.ANTeam.ancientnature.registries;

import net.minecraft.core.particles.ParticleType;
 import net.minecraft.core.particles.SimpleParticleType;
 import net.minecraft.core.registries.Registries;
 import net.neoforged.neoforge.registries.DeferredRegister;
 import net.rawr.ANTeam.ancientnature.AncientNature;
 
 import java.util.function.Supplier;
 
 public class ANParticles {
 
     public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(Registries.PARTICLE_TYPE, AncientNature.MODID);
 
 
     public static final Supplier<SimpleParticleType> MUD_PARTICLE = register("mud_particle", false);
     public static final Supplier<SimpleParticleType> STONE_PARTICLE = register("stone_particle", false);
     public static final Supplier<SimpleParticleType> GINKGO_PARTICLE = register("ginkgo_particle", false);
     public static final Supplier<SimpleParticleType> BLEEDING_PARTICLE = register("bleeding_particle", false);
     public static final Supplier<SimpleParticleType> GOLDEN_GINKGO_PARTICLE = register("golden_ginkgo_particle", false);
     public static final Supplier<SimpleParticleType> REVIVAL_STAND_PARTICLE = register("revival_stand_particle", false);
     public static final Supplier<SimpleParticleType> DEEPSLATE_DUST_PARTICLE = register("deepslate_dust_particle", false);
 
 
     public static Supplier<SimpleParticleType> register(String name, boolean pOverrideLimiter){
         Supplier<SimpleParticleType> ret = PARTICLES.register(name, () -> new SimpleParticleType(pOverrideLimiter));
         return ret;
     }
 }