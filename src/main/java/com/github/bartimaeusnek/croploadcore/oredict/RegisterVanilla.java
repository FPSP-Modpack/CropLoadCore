package com.github.bartimaeusnek.croploadcore.oredict;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterVanilla {
    public static void register() {
        OreDictionary.registerOre("cropVine", Blocks.vine);
        OreDictionary.registerOre("cropVines", Blocks.vine);
        OreDictionary.registerOre("cropGrass", new ItemStack(Blocks.deadbush, 1, 0));
        OreDictionary.registerOre("cropGrass", new ItemStack(Blocks.tallgrass, 1, 2));
        OreDictionary.registerOre("cropGrass", new ItemStack(Blocks.tallgrass, 1, 1));
        OreDictionary.registerOre("cropGrass", new ItemStack(Blocks.double_plant, 1, 2));
        OreDictionary.registerOre("cropGrass", new ItemStack(Blocks.double_plant, 1, 3));
        OreDictionary.registerOre("cropCacti", Blocks.cactus);
        OreDictionary.registerOre("cropCactus", Blocks.cactus);
    }
}
