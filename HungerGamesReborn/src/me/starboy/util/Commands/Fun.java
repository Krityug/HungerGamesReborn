package me.starboy.util.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fun implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Islands V2.5.0 BETA!");
            player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "If you find issues don't forget to post them on the forums!");



        }
        return true;
    }
}
