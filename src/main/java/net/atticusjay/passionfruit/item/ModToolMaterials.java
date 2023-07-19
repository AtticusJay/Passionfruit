package net.atticusjay.passionfruit.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ModToolMaterials implements ToolMaterial {

    public static final ToolMaterial ENDERITE = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 3000;
        }

        @Override
        public float getMiningSpeedMultiplier() {return 39;
        }

        @Override
        public float getAttackDamage() {
            return 9;
        }

        @Override
        public int getMiningLevel() {
            return 5;
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}