package fr.hugo06830.annonce;

import fr.hugo06830.annonce.commandes.CommandAnnonce;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
 
{
  private CommandAnnonce cmd = new CommandAnnonce();
  
  public void onEnable()
  {
    getCommand("annonce").setExecutor(this.cmd);
  }
  
  public void onDisable()
  {
    
  }
}
