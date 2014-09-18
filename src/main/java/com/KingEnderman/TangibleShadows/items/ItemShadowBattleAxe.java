package com.KingEnderman.TangibleShadows.items;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemShadowBattleAxe extends ItemSword {
	public ItemShadowBattleAxe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("shadowBattleAxe");
		setTextureName(TangibleShadows.MODID + ":" + "shadowBattleAxe");
		setCreativeTab(CreativeTabs.tabCombat);
		
	}
	
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
	if(itemstack.isItemEnchanted() == false)
	{
	itemstack.addEnchantment(Enchantment.knockback, 1);
	}
	}
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		    return false;
	}

}
