package me.starboy.util.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Inventory inventory = Bukkit.createInventory(null, 45, ChatColor.RED + "" + ChatColor.BOLD + "Player Manager");
            player.openInventory(inventory);


            ItemStack ender = new ItemStack((Material.ENDER_CHEST));
            ItemStack beacon = new ItemStack(Material.BEACON);
            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);





            //Naming all the items in the inventory we just created above:


            //For the names

            ItemMeta meta = ender.getItemMeta();
            meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Player Settings");
            ender.setItemMeta(meta);

            inventory.setItem(10, ender);

            ItemMeta meta2 = beacon.getItemMeta();
            meta2.setDisplayName(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Friends Settings");
            beacon.setItemMeta(meta2);

            inventory.setItem(13, beacon);

            ItemMeta meta3 = sword.getItemMeta();
            meta3.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "PvP Settings");
            sword.setItemMeta(meta3);

            inventory.setItem(16, sword);

            //lores of all the items

            List<String> list = new ArrayList<>();
            list.add(ChatColor.GRAY + "Manage your Stats, Kits etc on our PvP Network right from here");
            list.add(ChatColor.BLUE + "You can also earn points by upgrading your PvP Stats");
            meta.setLore(list);
            sword.setItemMeta(meta);





        }
        return true;
    }
}
