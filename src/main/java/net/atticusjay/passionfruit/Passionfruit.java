package net.atticusjay.passionfruit;

import net.atticusjay.passionfruit.block.ModBlocks;
import net.atticusjay.passionfruit.item.ModItemGroups;
import net.atticusjay.passionfruit.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Passionfruit implements ModInitializer {
	public static final String MOD_ID = "passionfruit";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}