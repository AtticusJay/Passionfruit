package net.atticusjay.passionfruit.item;

import net.atticusjay.passionfruit.Passionfruit;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ENDER_STAR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Passionfruit.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ender_star"))
                    .icon(() -> new ItemStack(ModItems.ENDER_STAR)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDER_STAR);


                    }).build());

    public static void registerItemGroups() {
        Passionfruit.LOGGER.info("Registering Item Groups for " + Passionfruit.MOD_ID);
    }
}
