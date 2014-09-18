package com.KingEnderman.TangibleShadows.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.KingEnderman.TangibleShadows.TangibleShadows;
public class ItemShadowShard extends Item
	{

		public ItemShadowShard() 
		{
			super();
			setUnlocalizedName("shadowShard");
			setTextureName(TangibleShadows.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(CreativeTabs.tabMaterials);
		}
	
	}
