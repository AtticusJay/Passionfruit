package net.atticusjay.passionfruit.entity;

import net.atticusjay.passionfruit.Passionfruit;
import net.atticusjay.passionfruit.entity.custom.EnderKingEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<EnderKingEntity> ENDER_KING = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(Passionfruit.MOD_ID, "ender_king"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EnderKingEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 6f)).build());
}
