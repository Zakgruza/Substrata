package com.zakgruza.substrata.creativetab;

import com.zakgruza.substrata.items.SubstrataItems;
import com.zakgruza.substrata.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;


public class CreativeTab
{
	public static final CreativeTabs SUBSTRATA_TAB = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return Items.cake;
		}
		
		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel()
		{
			return "Substrata";
		}		
	};
}
