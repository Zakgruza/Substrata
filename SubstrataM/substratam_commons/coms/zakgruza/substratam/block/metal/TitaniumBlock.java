package coms.zakgruza.substratam.block.metal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TitaniumBlock extends Block {

	public TitaniumBlock(int id, Material material) {
		super(id, material);
		
		setHardness(4.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("Titanium block");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("substrata:titaniumblock");
	}

}
