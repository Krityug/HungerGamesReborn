package me.starboy.util;

import me.starboy.util.Commands.API;
import me.starboy.util.Commands.Connecting;
import me.starboy.util.Commands.Fun;
import me.starboy.util.gui.PlayerManager;
import me.starboy.util.gui.Settings;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("HungerGames has been enabled");
        this.getCommand("fun").setExecutor(new Fun());
        this.getCommand("api").setExecutor(new API());
        this.getCommand("connect").setExecutor(new Connecting());
        this.getCommand("manager").setExecutor(new PlayerManager());
        this.getCommand("settings").setExecutor(new Settings());
        this.getCommand("transfer").setExecutor(new PluginTransferProtocol());
    }

    @Override
    public void onDisable() {
        getLogger().info("HungerGames has been disabled");
    }
}
