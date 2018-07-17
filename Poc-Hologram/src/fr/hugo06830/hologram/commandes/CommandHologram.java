package fr.hugo06830.hologram.commandes;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class CommandHologram
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (((sender instanceof Player)) && (cmd.getName().equalsIgnoreCase("hologram")) && (sender.isOp()))
    {
      Player player = (Player)sender;
      Location ploc = player.getLocation();
      StringBuilder bc = new StringBuilder();
      String[] arrayOfString;
      int j = (arrayOfString = args).length;
      for (int i = 0; i < j; i++)
      {
        String parts = arrayOfString[i];
        bc.append(" " + parts);
      }
      ArmorStand stand = (ArmorStand)ploc.getWorld().spawnEntity(ploc, EntityType.ARMOR_STAND);
      stand.setVisible(false);
      stand.setCustomName(bc.toString());
      stand.setCustomNameVisible(true);
    }
    return false;
  }
}
