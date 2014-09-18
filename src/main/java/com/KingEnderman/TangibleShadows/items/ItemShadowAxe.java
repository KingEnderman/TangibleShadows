package com.KingEnderman.TangibleShadows.items;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemShadowAxe extends ItemAxe
	{

		public ItemShadowAxe(ToolMaterial material) 
		{
			super(material);
			setUnlocalizedName("shadowAxe");
			setTextureName(TangibleShadows.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(CreativeTabs.tabTools);
		}
	
	}
