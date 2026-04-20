package me.tvojejmeno.awelcome;

import me.tvojejmeno.awelcome.commands.SetWelcomeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class AdvancedWelcome extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new JoinListener(this), this);
        getCommand("setwelcome").setExecutor(new SetWelcomeCommand(this));

        getLogger().info("AdvancedWelcome plugin byl zapnut!");
    }

    @Override
    public void onDisable() {
        getLogger().info("AdvancedWelcome plugin byl vypnut!");
    }
}
