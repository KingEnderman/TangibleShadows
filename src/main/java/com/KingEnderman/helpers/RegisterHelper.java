package com.KingEnderman.helpers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper {
	
	public static void registerBlock(Block block, String modId)
	{
		GameRegistry.registerBlock(block, modId + "_" + block.getUnlocalizedName().substring(5));
	}
	public static void registerItem(Item item, String modId)
	{
		GameRegistry.registerItem(item, modId + "_" + item.getUnlocalizedName().substring(5));
	}

}
