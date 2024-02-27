package net.shup.shuppybiomes.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.shup.shuppybiomes.block.ModBlocks;
import net.shup.shuppybiomes.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    // Generate block models
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.HEMLOCK_LOG).log(ModBlocks.HEMLOCK_LOG).wood(ModBlocks.HEMLOCK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_HEMLOCK_LOG).log(ModBlocks.STRIPPED_HEMLOCK_LOG).wood(ModBlocks.STRIPPED_HEMLOCK_WOOD);
        BlockStateModelGenerator.BlockTexturePool hemlockPlankTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HEMLOCK_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEMLOCK_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.HEMLOCK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


        hemlockPlankTexturePool.stairs(ModBlocks.HEMLOCK_STAIRS);
        hemlockPlankTexturePool.slab(ModBlocks.HEMLOCK_SLAB);

        hemlockPlankTexturePool.button((ModBlocks.HEMLOCK_BUTTON));
        hemlockPlankTexturePool.pressurePlate((ModBlocks.HEMLOCK_PRESSURE_PLATE));

        hemlockPlankTexturePool.fence((ModBlocks.HEMLOCK_FENCE));
        hemlockPlankTexturePool.fenceGate((ModBlocks.HEMLOCK_FENCE_GATE));

        blockStateModelGenerator.registerDoor(ModBlocks.HEMLOCK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.HEMLOCK_TRAPDOOR);


    }

    // Generate item models
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.HEMLOCK_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEMLOCK_CHEST_BOAT, Models.GENERATED);

    }
}
