package net.atticusjay.passionfruit.data;

import net.atticusjay.passionfruit.block.ModBlocks;
import net.atticusjay.passionfruit.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.ENDERITE_DUST), RecipeCategory.MISC, ModItems.ENDERITE_INGOT,
                3f, 200, "enderite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDERITE_INGOT, RecipeCategory.MISC,
                ModBlocks.ENDERITE_BLOCK);

        offerSword(exporter, ModItems.ENDERITE_SWORD, ModItems.ENDERITE_INGOT, Items.STICK);
        offerPickaxe(exporter, ModItems.ENDERITE_PICKAXE, ModItems.ENDERITE_INGOT, Items.STICK);
    }

    public void offerSword(Consumer<RecipeJsonProvider> exporter, Item result, Item material, Item handle) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, result)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I', material)
                .input('S', handle)
                .criterion(FabricRecipeProvider.hasItem(material),
                        FabricRecipeProvider.conditionsFromItem(material))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(result)));
    }
    public void offerPickaxe(Consumer<RecipeJsonProvider> exporter, Item result, Item material, Item handle) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, result)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', material)
                .input('S', handle)
                .criterion(FabricRecipeProvider.hasItem(material),
                        FabricRecipeProvider.conditionsFromItem(material))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(result)));
    }
}
