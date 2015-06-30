package com.corprall.practicemod.handler;

import com.corprall.practicemod.references.GeneralRef;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile){

        if (configuration == null){
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigChangeEvent (ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase(GeneralRef.MOD_ID)){}
    }

    public void loadConfiguration(){
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Test Config");

        if (configuration.hasChanged()){
            configuration.save();
        }
    }
}
