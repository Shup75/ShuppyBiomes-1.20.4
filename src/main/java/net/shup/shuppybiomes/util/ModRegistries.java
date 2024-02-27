package net.shup.shuppybiomes.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.shup.shuppybiomes.block.ModBlocks;
import net.shup.shuppybiomes.item.ModItems;

public class ModRegistries {
    public static void registerModStuff() {
        registerStrippables();
        registerFlammables();
        registerFuels();
    }

    // Set fuel ticks for blocks and items that do not have the same fuel tick as logs (300).
    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        // Blocks
        registry.add(ModBlocks.HEMLOCK_SLAB, 150);
        registry.add(ModBlocks.HEMLOCK_BUTTON, 100);
        registry.add(ModBlocks.HEMLOCK_SAPLING, 100);

        // Items
        registry.add(ModItems.HEMLOCK_BOAT, 200);
        registry.add(ModItems.HEMLOCK_CHEST_BOAT, 200);
    }

    // Allow blocks to be flammable
    private static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HEMLOCK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HEMLOCK_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HEMLOCK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HEMLOCK_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HEMLOCK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HEMLOCK_LEAVES, 30, 60);
    }

    // Allow logs and wood to be stripped
    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.HEMLOCK_LOG, ModBlocks.STRIPPED_HEMLOCK_LOG);
        StrippableBlockRegistry.register(ModBlocks.HEMLOCK_WOOD, ModBlocks.STRIPPED_HEMLOCK_WOOD);
    }
}
