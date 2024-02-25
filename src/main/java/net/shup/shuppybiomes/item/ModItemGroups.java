package net.shup.shuppybiomes.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shup.shuppybiomes.ShuppyBiomes;

public class ModItemGroups {
    public static final ItemGroup SHUPPY_BIOMES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ShuppyBiomes.MOD_ID, "shuppy-biomes-group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.shuppy-biomes-group"))
                    .icon(() -> new ItemStack(ModItems.HEMLOCK_BOAT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.HEMLOCK_BOAT);
                        entries.add(ModItems.HEMLOCK_CHEST_BOAT);

                    }).build());

    public static void registerItemGroups() {
        ShuppyBiomes.LOGGER.info("Registering ModItemGroups for " + ShuppyBiomes.MOD_ID);
    }
}
