package com.KingEnderman.TangibleShadows.items;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemShadowPickaxe extends ItemPickaxe
	{

		public ItemShadowPickaxe(ToolMaterial material) 
		{
			super(material);
			setUnlocalizedName("shadowPickaxe");
			setTextureName(TangibleShadows.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(CreativeTabs.tabTools);
		}
	
	}
