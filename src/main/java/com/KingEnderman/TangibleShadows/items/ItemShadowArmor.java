package com.KingEnderman.TangibleShadows.items;

import com.KingEnderman.TangibleShadows.TangibleShadows;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemShadowArmor extends ItemArmor
{

	public ItemShadowArmor(ArmorMaterial shadowArmorMaterial, int armorType, String name) 
	{
		super(shadowArmorMaterial, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(TangibleShadows.MODID + ":" + getUnlocalizedName().substring(5));
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == TangibleShadows.shadowHelmet || stack.getItem() == TangibleShadows.shadowChestplate || stack.getItem() == TangibleShadows.shadowBoots)
		{
			return TangibleShadows.MODID + ":models/armor/shadowMail_Layer_1.png";
		}
		else if(stack.getItem() == TangibleShadows.shadowLegs)
		{
			return TangibleShadows.MODID + ":models/armor/shadowMail_Layer_2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemShadowArmor");
			return null;
		}
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
	  player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2, 1));
	  player.addPotionEffect(new PotionEffect(Potion.resistance.id, 2, 2));
	  player.addPotionEffect(new PotionEffect(Potion.jump.id, 2, 1));
	}
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
	if(itemstack.isItemEnchanted() == false)
	{
	itemstack.addEnchantment(Enchantment.thorns, 20);
	itemstack.addEnchantment(Enchantment.fireProtection, 20);
	itemstack.addEnchantment(Enchantment.projectileProtection, 20);
	}
	}
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		    return false;
	}

}
