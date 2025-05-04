package net.rawr.ANTeam.ancientnature.common.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

import java.util.Random;

public class BrushingRecipe implements Recipe<BrushingRecipeInput> {
    protected final ResourceLocation id;
    protected final Ingredient inputIngredient;
    protected final Ingredient brush;
    protected final ItemStack output;
    protected final float probabilityForOutput;
    protected Random cachedRandom;

    public BrushingRecipe(ResourceLocation id, Ingredient input, Ingredient brush, ItemStack output, float probabilityForOutput) {
        this.id = id;
        this.inputIngredient = input;
        this.brush = brush;
        this.output = output;
        this.probabilityForOutput = probabilityForOutput;
    }


    @Override
    public boolean matches(BrushingRecipeInput input, Level level) {
        if (input.size() == 2) {
            if (brush.test(input.getItem(0)) && input.getItem(0).isDamageableItem() && inputIngredient.test(input.getItem(1)))
                return true;
            if (inputIngredient.test(input.getItem(0)) && brush.test(input.getItem(1)) && input.getItem(1).isDamageableItem())
                return true;
        }
        return false;
    }

    @Override
    public ItemStack assemble(BrushingRecipeInput input, HolderLookup.Provider registries) {
        if (this.cachedRandom == null)
            this.cachedRandom = new Random();
        return this.cachedRandom.nextFloat() <= this.probabilityForOutput ? this.output.copy() : ItemStack.EMPTY;
    }

    public Ingredient getBrush() {
        return brush;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        return this.output.copy();
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return null;
    }

    public static class Serializer implements RecipeSerializer<BrushingRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        private final MapCodec<BrushingRecipe> codec;
//        private final StreamCodec<RegistryFriendlyByteBuf, BrushingRecipe> streamCodec;

        public Serializer() {
            this.codec = RecordCodecBuilder.mapCodec((instance) -> instance.group(
                    Ingredient.CODEC.fieldOf("input").forGetter(recipe -> recipe.inputIngredient),
                    Ingredient.CODEC.fieldOf("brush").forGetter(recipe -> recipe.brush),
                    ItemStack.CODEC.fieldOf("output").forGetter(recipe -> recipe.output),
                    Codec.FLOAT.optionalFieldOf("probability", 0.2f).forGetter(recipe -> recipe.probabilityForOutput)
            ).apply(instance, (input, brush, output, probability) ->
                    new BrushingRecipe(null, input, brush, output, probability) // ID will be filled in by NeoForge
            ));

//            this.streamCodec = StreamCodec.composite(BrushingRecipe.Serializer::)
        }

        @Override
        public MapCodec<BrushingRecipe> codec() {
            return codec;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, BrushingRecipe> streamCodec() {
            return null;
        }


//        public @Nullable BrushingRecipe readItem(ResourceLocation id, RegistryFriendlyByteBuf buffer) {
//            float probability = buffer.readFloat();
//            Ingredient input = Ingredient.CONTENTS_STREAM_CODEC.decode(buffer);
//            Ingredient brush = Ingredient.CONTENTS_STREAM_CODEC.decode(buffer);
//            ItemStack output = buffer.readItem();
//            return new BrushingRecipe(id, input, brush, output, probability);
//        }
//
//        public void write(RegistryFriendlyByteBuf buffer, BrushingRecipe recipe) {
//            buffer.writeFloat(recipe.probabilityForOutput);
//            recipe.inputIngredient.toNetwork(buffer);
//            recipe.brush.toNetwork(buffer);
//            buffer.writeItem(recipe.output);
//        }
    }
}
