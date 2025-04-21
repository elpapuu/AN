package net.rawr.ANTeam.ancientnature.registries.util;

import net.minecraft.resources.ResourceLocation;
import net.rawr.ANTeam.ancientnature.AncientNature;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class ResourceUtils {
    @Contract("_ -> new")
    public static @NotNull ResourceLocation modLoc(String path){
        return ResourceLocation.fromNamespaceAndPath(AncientNature.MODID, path);
    }

    @Contract("_ -> new")
    public static @NotNull ResourceLocation mc(String path){
        return ResourceLocation.parse(path);
    }

    @Contract("_ -> new")
    public static @NotNull ResourceLocation png(String path){
        return modLoc("textures/" + path + ".png");
    }

    @Contract("_ -> new")
    public static @NotNull ResourceLocation entity(String path){
        return png("entity/" + path);
    }
}