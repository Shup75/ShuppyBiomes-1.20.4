package net.shup.shuppybiomes.util;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;
import net.shup.shuppybiomes.ShuppyBiomes;

public class ModWoodTypes {
    public static final WoodType HEMLOCK = WoodTypeRegistry.register(new Identifier(ShuppyBiomes.MOD_ID, "hemlock", BlockSetType.OAK));
}
