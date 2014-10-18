package com.KingEnderman.TangibleShadows.items;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMultiPass extends Item {
	public ItemMultiPass() 
	{
		super();
		setUnlocalizedName("multiPass");
		setTextureName(TangibleShadows.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMisc);
	}
}
