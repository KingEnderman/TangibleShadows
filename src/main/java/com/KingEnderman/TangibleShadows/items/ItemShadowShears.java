package com.KingEnderman.TangibleShadows.items;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemShadowShears extends ItemShears {
	
	public ItemShadowShears()
    {
        setMaxStackSize(1);
        setMaxDamage(238);
        setUnlocalizedName("shadowShears");
        setTextureName(TangibleShadows.MODID + ":" + "shadowShears");
        setCreativeTab(CreativeTabs.tabTools);
    }
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
	if(itemstack.isItemEnchanted() == false)
	{
	itemstack.addEnchantment(Enchantment.fortune, 20);
	}
	}
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		    return true;
	}


}
