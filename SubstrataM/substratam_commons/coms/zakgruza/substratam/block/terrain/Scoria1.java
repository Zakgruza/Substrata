package coms.zakgruza.substratam.block.terrain;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Scoria1 extends Block
{

	public Scoria1(int id, Material material)
	{
		super(id, material);
		
		setHardness(3.5f);
		setStepSound(Block.soundGravelFootstep);
		setUnlocalizedName("scoria1");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("substrata:scoria4");
		
		
	}

}
