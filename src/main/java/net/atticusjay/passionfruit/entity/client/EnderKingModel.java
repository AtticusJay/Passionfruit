package net.atticusjay.passionfruit.entity.client;

import net.atticusjay.passionfruit.Passionfruit;
import net.atticusjay.passionfruit.entity.custom.EnderKingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class EnderKingModel extends GeoModel<EnderKingEntity> {
    @Override
    public Identifier getModelResource(EnderKingEntity animatable) {
        return new Identifier(Passionfruit.MOD_ID, "geo/ender_king.geo.json");
    }

    @Override
    public Identifier getTextureResource(EnderKingEntity animatable) {
        return new Identifier(Passionfruit.MOD_ID, "textures/entity/ender_king.png");
    }

    @Override
    public Identifier getAnimationResource(EnderKingEntity animatable) {
        return new Identifier(Passionfruit.MOD_ID, "animations/ender_king.animation.json");
    }

    @Override
    public void setCustomAnimations(EnderKingEntity animatable, long instanceId, AnimationState<EnderKingEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
