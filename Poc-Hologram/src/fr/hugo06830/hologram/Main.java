package fr.hugo06830.hologram;

import fr.hugo06830.hologram.commandes.CommandHologram;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
  

  public void onEnable()
  {
    getCommand("hologram").setExecutor(new CommandHologram());
  }
}
