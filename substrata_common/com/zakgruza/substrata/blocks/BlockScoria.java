package com.zakgruza.substrata.blocks;


import com.zakgruza.substrata.lib.Names;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockScoria extends BlockSS
{

	public BlockScoria()
	{
		super(Material.rock);			
		this.setResistance(5F);
		this.setHardness(3F);
		this.setBlockName(Names.Blocks.SCORIA);
		this.setStepSound(Block.soundTypeStone);
		this.setHarvestLevel("pickaxe", 2);
		
	    		
	}

	
	
}