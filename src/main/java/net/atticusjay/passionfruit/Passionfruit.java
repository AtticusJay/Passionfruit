package net.atticusjay.passionfruit;

import net.atticusjay.passionfruit.block.ModBlocks;
import net.atticusjay.passionfruit.block.registries.ModStrippableBlockRegistry;
import net.atticusjay.passionfruit.entity.ModEntities;
import net.atticusjay.passionfruit.entity.custom.EnderKingEntity;
import net.atticusjay.passionfruit.item.ModItemGroups;
import net.atticusjay.passionfruit.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class Passionfruit implements ModInitializer {
	public static final String MOD_ID = "passionfruit";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GeckoLib.initialize();

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModStrippableBlockRegistry.registerStrippableBlocks();

		FabricDefaultAttributeRegistry.register(ModEntities.ENDER_KING, EnderKingEntity.setAttributes());
	}
}