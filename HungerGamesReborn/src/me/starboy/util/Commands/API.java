package me.starboy.util.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class API implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command,String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.RED + "We are currently In-Progress for API System Please contact Dev team for more info");




        }
        return true;
    }
}
