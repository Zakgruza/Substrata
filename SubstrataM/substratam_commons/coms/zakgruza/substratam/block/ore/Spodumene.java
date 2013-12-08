package coms.zakgruza.substratam.block.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Spodumene extends Block
{

	public Spodumene(int id, Material material)
	{
		super(id, material);
		//Lithium ore, Spodumene(LiAlSi2O6)
		
		setHardness(4.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("spodumene");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("substratam:spodumene");
	}

}
