package me.marlon;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public static Plugin plugin;

	public static Plugin getPlugin() {
		return plugin;
	}

	public void onEnable() {
		plugin = this;
	}

}
