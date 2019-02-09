package me.starboy.util;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PluginTransferProtocol implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.sendMessage(ChatColor.RED + "The Plugin is being disabled because CTP Key received by a OP Player");
            player.sendMessage(ChatColor.GREEN + "CTP Key is Successfully Valid");
            player.sendMessage(ChatColor.RED + "Protocol = Valid.ShutDown");


        }
        return true;
    }
}
