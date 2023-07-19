package net.atticusjay.passionfruit.data;

import net.atticusjay.passionfruit.block.ModBlocks;
import net.atticusjay.passionfruit.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TERMINAL);
        addDrop(ModBlocks.ENDERITE_BLOCK);
        addDrop(ModBlocks.ENDERITE_ORE,
                oreDrops(ModBlocks.ENDERITE_ORE, ModItems.ENDERITE_DUST));
        addDrop(ModBlocks.LAVENDER_LOG);
        addDrop(ModBlocks.STRIPPED_LAVENDER_LOG);
        addDrop(ModBlocks.LAVENDER_WOOD);
        addDrop(ModBlocks.STRIPPED_LAVENDER_WOOD);
        addDrop(ModBlocks.LAVENDER_PLANKS);
        addDrop(ModBlocks.TERMINAL,
                leavesDrops(ModBlocks.LAVENDER_LEAVES, ModBlocks.LAVENDER_SAPLING));
        addDrop(ModBlocks.LAVENDER_SAPLING);
    }
}
