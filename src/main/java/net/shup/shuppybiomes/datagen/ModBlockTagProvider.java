package net.shup.shuppybiomes.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.shup.shuppybiomes.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        // Allow axe to mine wood blocks
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.HEMLOCK_LOG)
                .add(ModBlocks.HEMLOCK_WOOD)
                .add(ModBlocks.STRIPPED_HEMLOCK_LOG)
                .add(ModBlocks.STRIPPED_HEMLOCK_WOOD)
                .add(ModBlocks.HEMLOCK_PLANKS)

                .add(ModBlocks.HEMLOCK_STAIRS)
                .add(ModBlocks.HEMLOCK_SLAB)

                .add(ModBlocks.HEMLOCK_BUTTON)
                .add(ModBlocks.HEMLOCK_PRESSURE_PLATE)

                .add(ModBlocks.HEMLOCK_FENCE)
                .add(ModBlocks.HEMLOCK_FENCE_GATE)

                .add(ModBlocks.HEMLOCK_DOOR)
                .add(ModBlocks.HEMLOCK_TRAPDOOR);

        // Allow shear to mine leaves
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.HEMLOCK_LEAVES);

        // Allow fences and fence gates to connect with each other
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.HEMLOCK_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.HEMLOCK_FENCE_GATE);
    }
}
