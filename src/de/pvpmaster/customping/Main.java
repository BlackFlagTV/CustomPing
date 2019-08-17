package de.pvpmaster.customping;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static String message;

    @Override
    public void onEnable() {

        this.getCommand("ping").setExecutor(new PingCommand(this));

        loadConfiguration();
        reloadConfig();

        message = getConfig().getString("config.ping");


        System.out.println("[CustomPing] Plugin loaded!");

    }

    @Override
    public void onDisable() {

        System.out.println("[CustomPing] Plugin disabled!");

    }

    private void loadConfiguration() {
        getConfig().addDefault("config.ping", "§aPing: %ping%ms");
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public static String getMessage() {
        return message;
    }
}
