package net.atticusjay.passionfruit.entity.client;

import net.atticusjay.passionfruit.Passionfruit;
import net.atticusjay.passionfruit.entity.custom.EnderKingEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class EnderKingRenderer extends GeoEntityRenderer<EnderKingEntity> {
    public EnderKingRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new EnderKingModel());
    }

    @Override
    public Identifier getTextureLocation(EnderKingEntity animatable) {
        return new Identifier(Passionfruit.MOD_ID, "textures/entity/ender_king.png");
    }

    @Override
    public void render(EnderKingEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
