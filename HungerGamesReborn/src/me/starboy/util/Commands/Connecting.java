package me.starboy.util.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Connecting implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command,String label,String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.RED + "Our servers are trying to connect with our API servers");
            player.sendMessage(ChatColor.RED + "If this process fails then you need a manual API key by our staff member");
            player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "In case it fails here is something you should deserve");

            ItemStack emerald = new ItemStack(Material.EMERALD);

            emerald.setAmount(15);

            player.getInventory().addItem(emerald);




        }
        return true;
    }

}
