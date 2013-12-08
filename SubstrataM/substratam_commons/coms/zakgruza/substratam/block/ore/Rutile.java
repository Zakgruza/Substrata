package coms.zakgruza.substratam.block.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Rutile extends Block
{

	public Rutile(int id, Material material)
	{
		super(id, material);
		//Titanium ore, Rutile(TiO2)
		
		setHardness(4.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("rutile");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("substratam:rutile");
	}
	
}


