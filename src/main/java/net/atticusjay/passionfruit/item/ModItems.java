package net.atticusjay.passionfruit.item;

import net.atticusjay.passionfruit.Passionfruit;
import net.atticusjay.passionfruit.item.custom.EnderStar;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENDER_STAR = registerItem("ender_star", new EnderStar(new FabricItemSettings()));
    public static final Item WITHER_BREATH = registerItem("wither_breath", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Passionfruit.MOD_ID, name), item);
    }
    public static void registerModItems() {

        Passionfruit.LOGGER.info("Registering Mod Items for " + Passionfruit.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
