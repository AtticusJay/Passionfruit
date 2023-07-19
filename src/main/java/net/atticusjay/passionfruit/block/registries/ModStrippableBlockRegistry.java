package net.atticusjay.passionfruit.block.registries;

import net.atticusjay.passionfruit.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlockRegistry {
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(ModBlocks.LAVENDER_LOG, ModBlocks.STRIPPED_LAVENDER_LOG);
        StrippableBlockRegistry.register(ModBlocks.LAVENDER_WOOD, ModBlocks.STRIPPED_LAVENDER_WOOD);
    }
}
