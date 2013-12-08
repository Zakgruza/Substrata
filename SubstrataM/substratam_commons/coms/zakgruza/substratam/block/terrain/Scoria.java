package coms.zakgruza.substratam.block.terrain;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Scoria extends Block
{

	public Scoria(int id, Material material)
	{
		super(id, material);
		
		setHardness(3.5f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("scoria");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("substratam:scoria0");
		
		
	}

}
