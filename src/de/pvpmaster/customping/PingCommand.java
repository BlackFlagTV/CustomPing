package de.pvpmaster.customping;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;

public class PingCommand implements CommandExecutor {

    private final Main plugin;

    public PingCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        sender.sendMessage(Main.getMessage().replace("%ping%", Integer.toString(((CraftPlayer) sender).getHandle().ping)));

        return true;
    }

}