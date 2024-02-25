package net.shup.shuppybiomes.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shup.shuppybiomes.ShuppyBiomes;

public class ModItems {
    public static final Item HEMLOCK_BOAT = registerItem("hemlock_boat", new Item(new FabricItemSettings()));
    public static final Item HEMLOCK_CHEST_BOAT = registerItem("hemlock_chest_boat", new Item(new FabricItemSettings()));

    private static void addItemsToToolItemGroup(FabricItemGroupEntries entries) {
        entries.add(HEMLOCK_BOAT);
        entries.add(HEMLOCK_CHEST_BOAT);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ShuppyBiomes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ShuppyBiomes.LOGGER.info("Registering ModItems for " + ShuppyBiomes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolItemGroup);
    }
}
