package coms.zakgruza.substratam.block.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Emerald extends Block
{

	public Emerald(int id, Material material)
	{
		super(id, material);
		//Beryllium ore, Aluminum ore, Emerald(Be3Al2(SiO3)6)
		
		setHardness(4.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("emerald");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("substratam:emerald");
	}
	
}