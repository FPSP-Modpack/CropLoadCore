package com.github.bartimaeusnek.croploadcore.oredict;

import net.minecraftforge.oredict.OreDictionary;

import static thaumcraft.api.ItemApi.getBlock;

public class RegisterThaumcraft implements Runnable {

    @Override
    public void run() {
        OreDictionary.registerOre("cropShimmerleaf", getBlock("blockCustomPlant", 2));
        OreDictionary.registerOre("cropCinderpearl", getBlock("blockCustomPlant", 3));
        OreDictionary.registerOre("cropGrass", getBlock("blockTaintFibres", 1));
    }
}
