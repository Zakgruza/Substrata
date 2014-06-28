package com.zakgruza.substrata.blocks;

import com.zakgruza.substrata.lib.Names;

import cpw.mods.fml.common.registry.GameRegistry;



public class SubstrataBlocks
{
	public static final BlockSS scoria = new BlockScoria();
	
	
	public static void init()
	{
		GameRegistry.registerBlock(scoria, "tile." + Names.Blocks.SCORIA);
		
	}

}
