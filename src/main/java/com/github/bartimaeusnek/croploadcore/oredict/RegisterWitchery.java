package com.github.bartimaeusnek.croploadcore.oredict;

import com.emoniph.witchery.Witchery;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterWitchery implements Runnable {

    @Override
    public void run() {
        //herb
        OreDictionary.registerOre("listAllherb", new ItemStack(Witchery.Items.SEEDS_GARLIC));
        OreDictionary.registerOre("listAllveggie", new ItemStack(Witchery.Items.GENERIC, 1, 69));

        //Plants
        OreDictionary.registerOre("cropGlintWeed", new ItemStack(Witchery.Blocks.GLINT_WEED));
        OreDictionary.registerOre("cropSpanishMoss", new ItemStack(Witchery.Blocks.SPANISH_MOSS));
        OreDictionary.registerOre("cropEmberMoss", new ItemStack(Witchery.Blocks.EMBER_MOSS));

        //Seeds
        OreDictionary.registerOre("seedWaterArtichoke", new ItemStack(Witchery.Items.SEEDS_ARTICHOKE));
        OreDictionary.registerOre("seedWolfsBane", new ItemStack(Witchery.Items.SEEDS_WOLFSBANE));
        OreDictionary.registerOre("seedMandrake", new ItemStack(Witchery.Items.SEEDS_MANDRAKE));
        OreDictionary.registerOre("seedSnowbell", new ItemStack(Witchery.Items.SEEDS_SNOWBELL));
        OreDictionary.registerOre("seedBelladonna", new ItemStack(Witchery.Items.SEEDS_BELLADONNA));

        OreDictionary.registerOre("listAllseed", new ItemStack(Witchery.Items.SEEDS_ARTICHOKE));
        OreDictionary.registerOre("listAllseed", new ItemStack(Witchery.Items.SEEDS_WOLFSBANE));
        OreDictionary.registerOre("listAllseed", new ItemStack(Witchery.Items.SEEDS_MANDRAKE));
        OreDictionary.registerOre("listAllseed", new ItemStack(Witchery.Items.SEEDS_SNOWBELL));
        OreDictionary.registerOre("listAllseed", new ItemStack(Witchery.Items.SEEDS_BELLADONNA));

        //items
        //OreDictionary.registerOre("itemWaterArtichoke", new ItemStack(Witchery.Items.GENERIC,1,69));
        OreDictionary.registerOre("cropArtichoke", new ItemStack(Witchery.Items.GENERIC, 1, 69));
        OreDictionary.registerOre("itemWolfsBane", new ItemStack(Witchery.Items.GENERIC, 1, 156));
        OreDictionary.registerOre("itemMandrake", new ItemStack(Witchery.Items.GENERIC, 1, 22));
        OreDictionary.registerOre("itemSnowbell", new ItemStack(Witchery.Items.GENERIC, 1, 78));
        OreDictionary.registerOre("itemBelladonna", new ItemStack(Witchery.Items.GENERIC, 1, 21));
        //OreDictionary.registerOre("itemGypsum",new ItemStack(Witchery.Items.GENERIC,1,17));

        //dusts
        //OreDictionary.registerOre("dustQuicklime",new ItemStack(Witchery.Items.GENERIC,1,16));

    }
}