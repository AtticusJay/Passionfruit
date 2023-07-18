package net.atticusjay.passionfruit.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnderStar extends Item {

    public EnderStar(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
