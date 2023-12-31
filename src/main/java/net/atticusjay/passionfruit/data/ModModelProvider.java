package net.atticusjay.passionfruit.data;

import net.atticusjay.passionfruit.block.ModBlocks;
import net.atticusjay.passionfruit.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.BeaconBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERITE_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.LAVENDER_LOG).log(ModBlocks.LAVENDER_LOG).wood(ModBlocks.LAVENDER_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_LAVENDER_LOG).log(ModBlocks.STRIPPED_LAVENDER_LOG).wood(ModBlocks.STRIPPED_LAVENDER_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LAVENDER_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LAVENDER_LEAVES);

        blockStateModelGenerator.registerTintableCross(ModBlocks.LAVENDER_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ENDER_STAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHER_BREATH, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_AXE, Models.HANDHELD);

    }
}
