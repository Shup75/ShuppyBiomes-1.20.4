package net.shup.shuppybiomes.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shup.shuppybiomes.ShuppyBiomes;
import net.shup.shuppybiomes.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SHUPPY_BIOMES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ShuppyBiomes.MOD_ID, "shuppy-biomes-group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.shuppy-biomes-group"))
                    .icon(() -> new ItemStack(ModItems.HEMLOCK_BOAT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.HEMLOCK_BOAT);
                        entries.add(ModItems.HEMLOCK_CHEST_BOAT);

                        entries.add(ModBlocks.HEMLOCK_LOG);
                        entries.add(ModBlocks.HEMLOCK_WOOD);
                        entries.add(ModBlocks.STRIPPED_HEMLOCK_LOG);
                        entries.add(ModBlocks.STRIPPED_HEMLOCK_WOOD);
                        entries.add(ModBlocks.HEMLOCK_PLANKS);
                        entries.add(ModBlocks.HEMLOCK_LEAVES);
                        entries.add(ModBlocks.HEMLOCK_SAPLING);

                        entries.add(ModBlocks.HEMLOCK_STAIRS);
                        entries.add(ModBlocks.HEMLOCK_SLAB);

                        entries.add(ModBlocks.HEMLOCK_BUTTON);
                        entries.add(ModBlocks.HEMLOCK_PRESSURE_PLATE);

                        entries.add(ModBlocks.HEMLOCK_FENCE);
                        entries.add(ModBlocks.HEMLOCK_FENCE_GATE);

                        entries.add(ModBlocks.HEMLOCK_DOOR);
                        entries.add(ModBlocks.HEMLOCK_TRAPDOOR);

                    }).build());

    public static void registerItemGroups() {
        ShuppyBiomes.LOGGER.info("Registering ModItemGroups for " + ShuppyBiomes.MOD_ID);
    }
}
