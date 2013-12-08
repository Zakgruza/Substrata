package coms.zakgruza.substratam.block.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Tincal extends Block
{

	public Tincal(int id, Material material)
	{
		super(id, material);
		//Boron ore, tincal(Na2B4O7-10(H2O))
		
		setHardness(4.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("tincal");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("substratam:tincal");
	}
	
}
