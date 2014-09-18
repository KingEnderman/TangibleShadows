package com.KingEnderman.TangibleShadows.items;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemShadowHoe extends ItemHoe
	{

		public ItemShadowHoe(ToolMaterial material) 
		{
			super(material);
			setUnlocalizedName("shadowHoe");
			setTextureName(TangibleShadows.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(CreativeTabs.tabTools);
		}
	
	}
