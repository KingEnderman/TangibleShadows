package com.KingEnderman.TangibleShadows.items;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemShadowShovel extends ItemSpade
	{

		public ItemShadowShovel(ToolMaterial material) 
		{
			super(material);
			setUnlocalizedName("shadowShovel");
			setTextureName(TangibleShadows.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(CreativeTabs.tabTools);
		}
	
	}
