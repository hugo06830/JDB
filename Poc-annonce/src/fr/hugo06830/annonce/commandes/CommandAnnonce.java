package fr.hugo06830.annonce.commandes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandAnnonce
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args)
  {
    if ((sender instanceof Player))
    {
      Player p = (Player)sender;
      if (args.length == 0) {
        p.sendMessage(ChatColor.RED + "La commande est : /annonce <message>");
      }
      if (args.length >= 1)
      {
        StringBuilder bc = new StringBuilder();
        String[] arrayOfString;
        int j = (arrayOfString = args).length;
        for (int i = 0; i < j; i++)
        {
          String parts = arrayOfString[i];
          bc.append(parts + " ");
        }
        Bukkit.broadcastMessage(ChatColor.DARK_RED + bc.toString());
      }
      return true;
    }
    return false;
  }
}
