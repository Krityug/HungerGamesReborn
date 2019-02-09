package me.starboy.util.gui;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Settings implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Inventory inventory = Bukkit.createInventory(null, 54, ChatColor.GREEN + "" + ChatColor.BOLD + "Settings");
            player.openInventory(inventory);

            ItemStack netherstar = new ItemStack(Material.NETHER_STAR);




            ItemMeta meta = netherstar.getItemMeta();
            meta.setDisplayName(ChatColor.GREEN + "Island Settings");
            netherstar.setItemMeta(meta);

            inventory.setItem(10, netherstar);

        }
        return true;
    }
}
