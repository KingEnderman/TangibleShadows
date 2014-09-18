package com.KingEnderman.TangibleShadows;

import com.KingEnderman.TangibleShadows.blocks.*;
import com.KingEnderman.TangibleShadows.containers.BlockShadowFurnace;
import com.KingEnderman.TangibleShadows.containers.TileEntityShadowFurnace;
import com.KingEnderman.TangibleShadows.items.*;
import com.KingEnderman.helpers.RegisterHelper;

import net.minecraft.block.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
@Mod(modid = TangibleShadows.MODID, version = TangibleShadows.VERSION)
public class TangibleShadows
{
    public static final String MODID = "TangibleShadows";
    public static final String VERSION = "2.0";
    
    public static Block shadow;
    
    public static TileEntity shadowFurnace;
    
    public static Block shadowFurnaceIdle;
    
    public static Block shadowFurnaceActive;
    
    public static Item disintegratedShadow;
    
    public static Item shadowSword;
    
    public static Item shadowAxe;
    
    public static Item shadowHoe;
    
    public static Item shadowPickaxe;
    
    public static ItemArmor shadowHelmet;
    
    public static ItemArmor shadowChestplate;
    
    public static ItemArmor shadowLegs;
    
    public static ItemArmor shadowBoots;
    
    public static Item shadowShovel;
    
    public static Item shadowShard;
    
    public static Item shadowGem;
    
    public static Item rawShadowGem;
    
    public static Item shadowCleaver;
    
    public static Item shadowBattleAxe;
    
    public static Item nutritiousLeaf;
    
    public static Item shadowShears;
    
    public static Item shadowBigSword;
    
    public static Item shadowDagger;
    
    public static Item shadowShield;
    
    ShadowEventHandler Handler = new ShadowEventHandler();
    
    ShadowDeathEventHandler Handler1 = new ShadowDeathEventHandler();
    
    static ToolMaterial shadowToolMaterial = EnumHelper.addToolMaterial("shadowToolMaterial", 4, 200000, 25.0f, 8.0f, 20);
    static ArmorMaterial shadowArmorMaterial = EnumHelper.addArmorMaterial("shadowArmorMaterial", 66, new int[]{18, 18, 18, 18}, 200);
    static ToolMaterial shadowToolMaterial2 = EnumHelper.addToolMaterial("shadowToolMaterial2", 4, 200000, 20.0f, 10.0f, 18);
    static ToolMaterial shadowToolMaterial3 = EnumHelper.addToolMaterial("shadowToolMaterial3", 4, 200000, 20.0f, 9.0f, 18);
    static ToolMaterial shadowToolMaterial4 = EnumHelper.addToolMaterial("shadowToolMaterial4", 4, 200000, 20.0f, 12.0f, 20);
    static ToolMaterial shadowToolMaterial5 = EnumHelper.addToolMaterial("shadowToolMaterial5", 4, 200000, 20.0f, 3.0f, 20);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	FMLCommonHandler.instance().bus().register(Handler);
    	MinecraftForge.EVENT_BUS.register(Handler);
    	
    	FMLCommonHandler.instance().bus().register(Handler1);
    	MinecraftForge.EVENT_BUS.register(Handler1);
    	
    	shadow = new BlockCongealedShadow();
    	RegisterHelper.registerBlock(shadow, MODID);
    	
    	shadowFurnace = new TileEntityShadowFurnace();
    	//GameRegistry.registerTileEntity(TileEntityShadowFurnace.class, MODID + "_" + "tileEntityShadowFurnace");
    	
    	shadowFurnaceIdle = new BlockShadowFurnace(false).setCreativeTab(CreativeTabs.tabDecorations);
    	//RegisterHelper.registerBlock(shadowFurnaceIdle, MODID);
    	
    	shadowFurnaceActive = new BlockShadowFurnace(true);
    	//RegisterHelper.registerBlock(shadowFurnaceActive, MODID);
    	
    	disintegratedShadow = new ItemDisintegratedShadow();
    	RegisterHelper.registerItem(disintegratedShadow, MODID);
    	
    	shadowSword = new ItemShadowSword(shadowToolMaterial);
    	RegisterHelper.registerItem(shadowSword, MODID);
    	
    	shadowAxe = new ItemShadowAxe(shadowToolMaterial);
    	RegisterHelper.registerItem(shadowAxe, MODID);
    	
    	shadowHoe = new ItemShadowHoe(shadowToolMaterial);
    	RegisterHelper.registerItem(shadowHoe, MODID);
    	
    	shadowPickaxe = new ItemShadowPickaxe(shadowToolMaterial);
    	RegisterHelper.registerItem(shadowPickaxe, MODID);
    	
    	shadowHelmet = new ItemShadowArmor(shadowArmorMaterial, 0, "shadowHelmet");
    	RegisterHelper.registerItem(shadowHelmet, MODID);
    	
    	shadowChestplate = new ItemShadowArmor(shadowArmorMaterial, 1, "shadowChestplate");
    	RegisterHelper.registerItem(shadowChestplate, MODID);
    	
    	shadowLegs = new ItemShadowArmor(shadowArmorMaterial, 2, "shadowLegs");
    	RegisterHelper.registerItem(shadowLegs, MODID);
    	
    	shadowBoots = new ItemShadowArmor(shadowArmorMaterial, 3, "shadowBoots");
    	RegisterHelper.registerItem(shadowBoots, MODID);
    	
    	shadowShovel = new ItemShadowShovel(shadowToolMaterial);
    	RegisterHelper.registerItem(shadowShovel, MODID);
    	
    	shadowShard = new ItemShadowShard();
    	RegisterHelper.registerItem(shadowShard, MODID);
    	
    	shadowGem = new ItemShadowGem();
    	RegisterHelper.registerItem(shadowGem, MODID);
    	
    	rawShadowGem = new ItemRawShadowGem();
    	RegisterHelper.registerItem(rawShadowGem, MODID);
    	
    	shadowCleaver = new ItemShadowCleaver(shadowToolMaterial2);
    	RegisterHelper.registerItem(shadowCleaver, MODID);
    	
    	shadowBattleAxe = new ItemShadowBattleAxe(shadowToolMaterial3);
    	RegisterHelper.registerItem(shadowBattleAxe, MODID);
    	
    	nutritiousLeaf = new ItemNutritiousLeaf();
    	RegisterHelper.registerItem(nutritiousLeaf, MODID);
    	
    	shadowShears = new ItemShadowShears();
    	RegisterHelper.registerItem(shadowShears, MODID);
    	
    	shadowBigSword = new ItemShadowBigSword(shadowToolMaterial4);
    	RegisterHelper.registerItem(shadowBigSword, MODID);
    	
    	shadowDagger = new ItemShadowDagger(shadowToolMaterial);
    	RegisterHelper.registerItem(shadowDagger, MODID);
    	
    	shadowShield = new ItemShadowShield(shadowToolMaterial5);
    	RegisterHelper.registerItem(shadowShield, MODID);
    	
    	GameRegistry.addRecipe (new ItemStack(shadow), new Object[]
			{
    			" x ",
    			"x x",
    		    " x ",
    			'x', disintegratedShadow
			});
    	GameRegistry.addRecipe (new ItemStack(shadow), new Object[]
			{
    			"x x",
    			"   ",
    		    "x x",
    			'x', disintegratedShadow
			});
    	GameRegistry.addRecipe (new ItemStack(shadowChestplate), new Object[]
    			{
        			"x x",
        			"xxx",
        		    "xxx",
        			'x', shadowGem
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowLegs), new Object[]
    			{
        			"xxx",
        			"x x",
        		    "x x",
        			'x', shadowGem
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowHelmet), new Object[]
    			{
        			"xxx",
        			"x x",
        			'x', shadowGem
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowBoots), new Object[]
    			{
        			"x x",
        			"x x",
        			'x', shadowGem
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowPickaxe), new Object[]
    			{
        			"xxx",
        			" y ",
        		    " y ",
        			'x', shadowGem, 'y', Items.blaze_rod
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowAxe), new Object[]
    			{
        			"xx",
        			"xy",
        		    " y",
        			'x', shadowGem, 'y', Items.blaze_rod
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowBattleAxe), new Object[]
    			{
        			"xxx",
        			"xyx",
        		    " y ",
        			'x', shadowGem, 'y', Items.blaze_rod
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowHoe), new Object[]
    			{
        			"xxx",
        			"  y",
        		    "  y",
        			'x', shadowGem, 'y', Items.blaze_rod
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowShard), new Object[]
    			{
        			"xxx",
        			"xyx",
        		    "xxx",
        			'x', Items.quartz, 'y', Items.coal
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowShovel), new Object[]
    			{
        			" x ",
        			" y ",
        		    " y ",
        			'x', shadowGem, 'y', Items.blaze_rod
    			});
    	GameRegistry.addSmelting(TangibleShadows.shadowShard, new ItemStack(TangibleShadows.disintegratedShadow, 1, 0), 10);
    	GameRegistry.addRecipe (new ItemStack(rawShadowGem), new Object[]
    			{
        			"xxx",
        			"xyx",
        		    "xxx",
        			'x', disintegratedShadow, 'y', Items.diamond
    			});
    	GameRegistry.addSmelting(rawShadowGem, new ItemStack(TangibleShadows.shadowGem, 1, 0), 80);
    	GameRegistry.addRecipe (new ItemStack(shadowSword), new Object[]
    			{
        			" x ",
        			" x ",
        		    " y ",
        			'x', shadowGem, 'y', Items.blaze_rod
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowCleaver), new Object[]
    			{
        			"xxx",
        			"xxy",
        		    "  y",
        			'x', shadowGem, 'y', Items.blaze_rod
    			});
    	GameRegistry.addShapelessRecipe(new ItemStack(nutritiousLeaf), new ItemStack(Items.wheat_seeds), new ItemStack(Items.milk_bucket));
    	GameRegistry.addRecipe (new ItemStack(shadowBigSword), new Object[]
    			{
        			"xxx",
        			"xxx",
        		    " y ",
        			'x', shadowGem, 'y', Items.blaze_rod
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowBigSword), new Object[]
    			{
        			"x",
        		    "y",
        			'x', shadowGem, 'y', Items.blaze_rod
    			});
    	GameRegistry.addRecipe (new ItemStack(shadowShield), new Object[]
    			{
        			" x ",
        			"xyx",
        		    " x ",
        			'x', shadowGem, 'y', Items.blaze_rod
    			});

    	
    }
}
