package net.shup.shuppybiomes.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.shup.shuppybiomes.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.HEMLOCK_LOG);
        addDrop(ModBlocks.HEMLOCK_WOOD);
        addDrop(ModBlocks.STRIPPED_HEMLOCK_LOG);
        addDrop(ModBlocks.STRIPPED_HEMLOCK_WOOD);
        addDrop(ModBlocks.HEMLOCK_PLANKS);
        addDrop(ModBlocks.HEMLOCK_LEAVES, leavesDrops(ModBlocks.HEMLOCK_LEAVES, ModBlocks.HEMLOCK_SAPLING, 0.005f));
        addDrop(ModBlocks.HEMLOCK_SAPLING);

        addDrop(ModBlocks.HEMLOCK_STAIRS);
        addDrop(ModBlocks.HEMLOCK_SLAB, slabDrops((ModBlocks.HEMLOCK_SLAB)));

        addDrop(ModBlocks.HEMLOCK_BUTTON);
        addDrop(ModBlocks.HEMLOCK_PRESSURE_PLATE);

        addDrop(ModBlocks.HEMLOCK_FENCE);
        addDrop(ModBlocks.HEMLOCK_FENCE_GATE);

        addDrop(ModBlocks.HEMLOCK_DOOR, doorDrops(ModBlocks.HEMLOCK_DOOR));
        addDrop(ModBlocks.HEMLOCK_TRAPDOOR);

    }
}
