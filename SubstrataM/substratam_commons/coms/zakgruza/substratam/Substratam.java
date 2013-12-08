package coms.zakgruza.substratam;

import coms.zakgruza.substratam.block.metal.TitaniumBlock;
import coms.zakgruza.substratam.block.ore.Emerald;
import coms.zakgruza.substratam.block.ore.Rutile;
import coms.zakgruza.substratam.block.ore.Spodumene;
import coms.zakgruza.substratam.block.ore.Tincal;
import coms.zakgruza.substratam.block.terrain.Scoria;
import coms.zakgruza.substratam.block.terrain.Scoria1;
import coms.zakgruza.substratam.item.ingot.TitaniumIngot;
import coms.zakgruza.substratam.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid=Reference.ID, name=Reference.NAME, version=Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Substratam
{
	// state terrain blocks here
	public static Block scoria = new Scoria(1401, Material.rock);
	public static Block scoria1 = new Scoria1(1402, Material.rock);
	
	// state ore blocks here
	public static Block spodumene = new Spodumene(1003, Material.rock);
	public static Block emerald = new Emerald(1004, Material.rock);
	public static Block rutile = new Rutile(1022, Material.rock);
	public static Block tincal = new Tincal(1005, Material.rock);
	
	// state metal blocks and construction blocks here
	public static Block titaniumblock = new TitaniumBlock(1222, Material.iron);
	
	// state ingots here
	public static Item titaniumingot = new TitaniumIngot(5222);
	
	// state dusts and elements here
	
	// state machine blocks
	
	
	 @Instance(Reference.NAME)
     public static Substratam instance;
     
     @SidedProxy(clientSide=Reference.CLIENTPROXY + ".ClientProxy", serverSide=Reference.COMMONPROXY + ".CommonProxy")
     public static CommonProxy proxy;
     
    
     
     @EventHandler
     public void preInit(FMLPreInitializationEvent event)
     {
             proxy.registerRenderers();
           
             // call registers for terrain blocks
             GameRegistry.registerBlock(scoria, "scoria");
             LanguageRegistry.addName(scoria, "Scoria");
             MinecraftForge.setBlockHarvestLevel(scoria, "pickaxe", 2);
             
             GameRegistry.registerBlock(scoria1, "scoria1");
             LanguageRegistry.addName(scoria1, "Thin Scoria");
             MinecraftForge.setBlockHarvestLevel(scoria1, "pickaxe", 2);
                          
             // call registers for ore blocks
             GameRegistry.registerBlock(rutile, "rutile");
             LanguageRegistry.addName(rutile, "Rutile");
             MinecraftForge.setBlockHarvestLevel(rutile, "pickaxe", 3);
                          
             GameRegistry.registerBlock(spodumene, "spodumene");
             LanguageRegistry.addName(spodumene, "Spodumene");
             MinecraftForge.setBlockHarvestLevel(spodumene, "pickaxe", 3);
             
             GameRegistry.registerBlock(emerald, "emerald");
             LanguageRegistry.addName(emerald, "Emerald");
             MinecraftForge.setBlockHarvestLevel(emerald, "pickaxe", 3); 
             
             GameRegistry.registerBlock(tincal, "tincal");
             LanguageRegistry.addName(tincal, "Tincal");
             MinecraftForge.setBlockHarvestLevel(tincal, "pickaxe", 3); 
             
             // call registers for other blocks
             GameRegistry.registerBlock(titaniumblock, "titaniumblock");
             LanguageRegistry.addName(titaniumblock, "Titanium block");
             MinecraftForge.setBlockHarvestLevel(titaniumblock, "pickaxe", 3);
             
             // call registers for items
             GameRegistry.registerItem(titaniumingot, "titanium_ingot");
             LanguageRegistry.addName(titaniumingot, "Titanium Ingot");
            
     }
     
     @EventHandler
     public void Init(FMLInitializationEvent event)
     {
             // Stub Method
     }
     
     @EventHandler
     public void postInit(FMLPostInitializationEvent event)
     {
             // Stub Method
     }
}
