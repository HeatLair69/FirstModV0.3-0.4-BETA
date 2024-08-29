package net.firstmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.firstmod.entity.ModEntities;
import net.firstmod.entity.client.ModModelLayers;
import net.firstmod.entity.client.PorcupineModel;
import net.firstmod.entity.client.PorcupineRenderer;

public class FirstModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
    }
}
