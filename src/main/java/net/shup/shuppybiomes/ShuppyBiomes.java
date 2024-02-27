package net.shup.shuppybiomes;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.shup.shuppybiomes.block.ModBlocks;
import net.shup.shuppybiomes.item.ModItemGroups;
import net.shup.shuppybiomes.item.ModItems;
import net.shup.shuppybiomes.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShuppyBiomes implements ModInitializer {
	public static final String MOD_ID = "shuppy-biomes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuff();
	}
}
