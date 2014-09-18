package com.KingEnderman.TangibleShadows.items;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class ItemNutritiousLeaf extends ItemFood {
	 public ItemNutritiousLeaf() {
		 super(1, false);
		 setPotionEffect(Potion.moveSpeed.id, 3, 2, 1f);
		 setUnlocalizedName("nutritiousLeaf");
		 setTextureName(TangibleShadows.MODID + ":" + "nutritiousLeaf");
		 
	}
	 public boolean hasEffect(ItemStack par1ItemStack)
		{
			    return true;
		}
}
