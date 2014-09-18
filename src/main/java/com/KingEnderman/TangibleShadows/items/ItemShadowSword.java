package com.KingEnderman.TangibleShadows.items;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemShadowSword extends ItemSword
	{

		public ItemShadowSword(ToolMaterial material) 
		{
			super(material);
			setUnlocalizedName("shadowSword");
			setTextureName(TangibleShadows.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(CreativeTabs.tabCombat);
		}
	
	}
