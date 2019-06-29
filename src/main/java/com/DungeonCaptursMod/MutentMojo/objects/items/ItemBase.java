package com.DungeonCaptursMod.MutentMojo.objects.items;

import com.DungeonCaptursMod.MutentMojo.DungeonCapturesMod;
import com.DungeonCaptursMod.MutentMojo.init.ItemInit;
import com.DungeonCaptursMod.MutentMojo.util.interfaces.IHasModle;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModle 

{

	public ItemBase(String name)

	{

		setUnlocalizedName(name);

		setRegistryName(name);

		setCreativeTab(CreativeTabs.MATERIALS);

		

		ItemInit.ITEMS.add(this);

	}


	@Override
	public void registerModles() 
	{
		DungeonCapturesMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}




