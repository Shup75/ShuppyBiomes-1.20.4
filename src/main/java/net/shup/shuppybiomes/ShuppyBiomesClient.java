package net.shup.shuppybiomes;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.shup.shuppybiomes.block.ModBlocks;
import net.shup.shuppybiomes.util.ModWoodTypes;

public class ShuppyBiomesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HEMLOCK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HEMLOCK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HEMLOCK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HEMLOCK_SAPLING, RenderLayer.getCutout());

        TexturedRenderLayers.SIGN_TYPE_TEXTURES.put(ModWoodTypes.HEMLOCK, TexturedRenderLayers.getSignTextureId(ModWoodTypes.HEMLOCK));
    }
}
