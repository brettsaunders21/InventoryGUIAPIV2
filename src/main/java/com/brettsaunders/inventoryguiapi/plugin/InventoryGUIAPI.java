package com.brettsaunders.inventoryguiapi.plugin;

import org.bukkit.plugin.java.JavaPlugin;

import com.brettsaunders.inventoryguiapi.language.GUILanguageManager;
import com.brettsaunders.inventoryguiapi.listeners.BukkitEventListener;

/**
 * The 'plugin' class. This class is the entrypoint of the plugin and is what defines a 'Plugin' to the Bukkit API
 */
public class InventoryGUIAPI extends JavaPlugin {
    private static InventoryGUIAPI instance; //The instance of the plugin; we can do this because there will only ever be one instance of the plugin object on the server
    private static GUILanguageManager languageManager; //The language manager which defines all the messages the plugin uses

    public static InventoryGUIAPI getInstance(){
        return instance;
    }

    public static GUILanguageManager getLanguageManager(){
        return languageManager;
    }

    
    public void onEnable() { //Called when the server starts up and this plugin gets enabled
        instance = this;
        languageManager = new GUILanguageManager();

        getServer().getPluginManager().registerEvents(new BukkitEventListener(), this);

        getLogger().info(languageManager.getFormattedString("plugin.startup", getName()));
    }

    
    public void onDisable(){ //Called when the server shuts down and this plugin gets disabled
        getLogger().info(languageManager.getFormattedString("plugin.shutdown", getName()));
    }

}
