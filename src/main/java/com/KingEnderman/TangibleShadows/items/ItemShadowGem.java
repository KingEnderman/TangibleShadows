package com.KingEnderman.TangibleShadows.items;



import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemShadowGem extends Item
	{

		public ItemShadowGem() 
		{
			super();
			setUnlocalizedName("shadowGem");
			setTextureName(TangibleShadows.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(CreativeTabs.tabMaterials);
		}
	
	}
