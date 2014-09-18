package com.KingEnderman.TangibleShadows.blocks;

import java.util.Random;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockCongealedShadow extends Block {

	public BlockCongealedShadow() {
		super(Material.rock);
		setBlockName("congealedShadow");
		setBlockTextureName(TangibleShadows.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setLightLevel(-200f);
		setHardness(2.0f);
		setResistance(90f);
		setHarvestLevel("pickaxe", 1);
		setStepSound(soundTypeCloth);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune)
    {
        return TangibleShadows.disintegratedShadow;
    }
	@Override
	public int quantityDropped(Random p_149745_1_)
    {
        return 4;
    }
}
