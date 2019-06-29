package com.DungeonCaptursMod.MutentMojo;

import com.DungeonCaptursMod.MutentMojo.proxy.CommonProxy;
import com.DungeonCaptursMod.MutentMojo.util.reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.mod_ID, version = reference.version, name = reference.name)
public class DungeonCapturesMod 
{

	@Instance
	public static DungeonCapturesMod instance;
	
	@SidedProxy(clientSide = reference.client_proxy_class, serverSide = reference.common_proxy_class)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
