package com.corprall.practicemod;

import com.corprall.practicemod.handler.ConfigHandler;
import com.corprall.practicemod.proxy.IProxy;
import com.corprall.practicemod.references.ClassRef;
import com.corprall.practicemod.references.GeneralRef;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GeneralRef.MOD_ID, name = GeneralRef.MOD_NAME, version = GeneralRef.VERSION, guiFactory = ClassRef.GUI_FACTORY_CLASS)
public class main {

    @Mod.Instance("PracticeMod")
    public static main instance;

    @SidedProxy(clientSide = "com.corprall.practicemod.proxy.ClientProxy", serverSide = "com.corprall.practicemod.proxy.ServerProxy")
    public static IProxy proxy;

//------------------------------[Pre-Init]-------------------------------
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigHandler.init(event.getSuggestedConfigurationFile());
    }

//---------------------------------[Init]--------------------------------
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){    }

//------------------------------[Post-Init]------------------------------
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){}
}
