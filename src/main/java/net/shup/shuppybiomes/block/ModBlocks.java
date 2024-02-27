package net.shup.shuppybiomes.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shup.shuppybiomes.ShuppyBiomes;

public class ModBlocks {
    // Logs, wood, stripped logs, stripped wood, and planks
    public static final Block HEMLOCK_LOG = registerBlock("hemlock_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block HEMLOCK_WOOD = registerBlock("hemlock_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_HEMLOCK_LOG = registerBlock("stripped_hemlock_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_HEMLOCK_WOOD = registerBlock("stripped_hemlock_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block HEMLOCK_PLANKS = registerBlock("hemlock_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block HEMLOCK_LEAVES = registerBlock("hemlock_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block HEMLOCK_SAPLING = registerBlock("hemlock_sapling",
            new SaplingBlock(null, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    // Stairs and slabs
    public static final Block HEMLOCK_STAIRS = registerBlock("hemlock_stairs",
            new StairsBlock(ModBlocks.HEMLOCK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block HEMLOCK_SLAB = registerBlock("hemlock_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));

    // Buttons and pressure plates
    public static final Block HEMLOCK_BUTTON = registerBlock("hemlock_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)));
    public static final Block HEMLOCK_PRESSURE_PLATE = registerBlock("hemlock_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)));

    // Fences and fence gates
    public static final Block HEMLOCK_FENCE = registerBlock("hemlock_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block HEMLOCK_FENCE_GATE = registerBlock("hemlock_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)));

    // Doors and trapdoors
    public static final Block HEMLOCK_DOOR = registerBlock("hemlock_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR)));
    public static final Block HEMLOCK_TRAPDOOR = registerBlock("hemlock_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR)));














    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ShuppyBiomes.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ShuppyBiomes.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks () {
        ShuppyBiomes.LOGGER.info("Registering ModBlocks for " + ShuppyBiomes.MOD_ID);
    }
}
