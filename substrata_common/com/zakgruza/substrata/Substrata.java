package com.zakgruza.substrata;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.zakgruza.substrata.blocks.SubstrataBlocks;
import com.zakgruza.substrata.lib.Reference;
import com.zakgruza.substrata.proxy.CommonProxy;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)


public class Substrata
{
   
    // add in sidedproxy here
	 @Instance(Reference.MOD_NAME)
     public static Substrata instance;
     
     @SidedProxy(clientSide=Reference.CLIENTPROXY + ".ClientProxy", serverSide=Reference.COMMONPROXY + ".CommonProxy")
     public static CommonProxy proxy;

	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		 proxy.registerRenderers();
		//add renderers
		//add sounds init
		
		//add Items.init();
		//add Blocks.init();
		//load configs
		
		SubstrataBlocks.init();
		
		
		
		
	}
	
    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
		//recipes
    	//gui's
    	//ore spawn, terrain gen
    
    }
    
    @EventHandler
    public static void postInit(FMLInitializationEvent event)
    {
    	
    }
}
