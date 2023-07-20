package net.atticusjay.passionfruit;

import net.atticusjay.passionfruit.block.ModBlocks;
import net.atticusjay.passionfruit.entity.ModEntities;
import net.atticusjay.passionfruit.entity.client.EnderKingRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class PassionfruitClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TERMINAL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVENDER_SAPLING, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.ENDER_KING, EnderKingRenderer::new);
    }
}
