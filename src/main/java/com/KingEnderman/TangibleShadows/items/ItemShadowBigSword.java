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

public class ItemShadowBigSword extends ItemSword {
	public ItemShadowBigSword(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("shadowBigSword");
		setTextureName(TangibleShadows.MODID + ":" + "shadowBigSword");
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
	player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 2, 2, true));
	player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 2, 2, true));
	}
	}
	}


}
