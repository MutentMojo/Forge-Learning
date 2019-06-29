package com.DungeonCaptursMod.MutentMojo.util.handlers;

import com.DungeonCaptursMod.MutentMojo.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;



@EventBusSubscriber

public class RegistryHandler 

{

	@SubscribeEvent

	public static void onItemRegister(RegistryEvent.Register<Item> event)

	{

		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));

	}

	

	public static void postInitRegistries()

	{

		

	}

	

	public static void serverRegistries(FMLServerStartingEvent event)

	{

		

	}
}