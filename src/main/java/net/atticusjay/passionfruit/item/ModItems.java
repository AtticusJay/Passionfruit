package net.atticusjay.passionfruit.item;

import net.atticusjay.passionfruit.Passionfruit;
import net.atticusjay.passionfruit.item.custom.GlintedItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ENDER_STAR = registerItem("ender_star", new GlintedItem(new FabricItemSettings()));
    public static final Item WITHER_BREATH = registerItem("wither_breath", new Item(new FabricItemSettings()));
    public static final Item ENDERITE_DUST = registerItem("enderite_dust", new Item(new FabricItemSettings()));
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new FabricItemSettings()));

    public static final Item ENDERITE_SWORD = registerItem("enderite_sword",
            new SwordItem(ModToolMaterials.ENDERITE, 0, -2.4f, new FabricItemSettings()));

    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERITE, -3, -2.8f, new FabricItemSettings()));

    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE, -5, -3f, new FabricItemSettings()));

    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new HoeItem(ModToolMaterials.ENDERITE, -10, -3f, new FabricItemSettings()));

    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new AxeItem(ModToolMaterials.ENDERITE, 1, -3f, new FabricItemSettings()));

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
