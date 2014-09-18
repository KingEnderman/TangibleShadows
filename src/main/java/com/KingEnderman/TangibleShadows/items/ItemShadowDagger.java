package com.KingEnderman.TangibleShadows.items;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemShadowDagger extends ItemSword {
	public ItemShadowDagger(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("shadowDagger");
		setTextureName(TangibleShadows.MODID + ":" + "shadowDagger");
		setCreativeTab(CreativeTabs.tabCombat);
	

	}
	public void onUpdate (ItemStack stack, World world, Entity entity, int par4, boolean par5)
	{
	super.onUpdate(stack, world, entity, par4, par5);
	if (entity instanceof EntityPlayer)
	{
	EntityPlayer player = (EntityPlayer) entity;
	ItemStack equipped = player.getCurrentEquippedItem();
	if (equipped == stack)
	{
	player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 2, 2, true));
	player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2, 1, true));
	}
	}
	}
}	
