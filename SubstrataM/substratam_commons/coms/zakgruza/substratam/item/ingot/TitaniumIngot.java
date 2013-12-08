package coms.zakgruza.substratam.item.ingot;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TitaniumIngot extends Item
{

	public TitaniumIngot(int id)
	{
		super(id);
		
		setUnlocalizedName("titanium_ingot");
		setCreativeTab(CreativeTabs.tabMaterials);
		setTextureName("substratam:titanium_ingot");
		
	}
	

}
