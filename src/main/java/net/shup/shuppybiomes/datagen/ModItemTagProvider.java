package net.shup.shuppybiomes.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.shup.shuppybiomes.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Allow planks for crafting
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.HEMLOCK_PLANKS.asItem());


        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.HEMLOCK_LOG.asItem())
                .add(ModBlocks.HEMLOCK_WOOD.asItem())
                .add(ModBlocks.STRIPPED_HEMLOCK_LOG.asItem())
                .add(ModBlocks.STRIPPED_HEMLOCK_WOOD.asItem())
                .add(ModBlocks.HEMLOCK_PLANKS.asItem())

                .add(ModBlocks.HEMLOCK_STAIRS.asItem())

                .add(ModBlocks.HEMLOCK_PRESSURE_PLATE.asItem())

                .add(ModBlocks.HEMLOCK_FENCE.asItem())
                .add(ModBlocks.HEMLOCK_FENCE_GATE.asItem())

                .add(ModBlocks.HEMLOCK_DOOR.asItem())
                .add(ModBlocks.HEMLOCK_TRAPDOOR.asItem());

    }
}
