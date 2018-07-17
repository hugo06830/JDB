package fr.hugo06830.hologram.commandes;



import org.bukkit.ChatColor;
import org.bukkit.Location;
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
    if (((sender instanceof Player)) && (cmd.getName().equalsIgnoreCase("hologram")) && (sender.isOp())){
    
    	
      Player player = (Player)sender;
      Location ploc =  player.getLocation();
      
      	if(args.length ==0) {
      		player.sendMessage(ChatColor.RED + "la commande est : /hologram  <message>");
      	}else {
      	
      StringBuilder bc = new StringBuilder();
      String[] arrayOfString;
      int j = (arrayOfString = args).length;
      for (int i = 0; i < j; i++)
      {
        String parts = arrayOfString[i];
       if(parts.contentEquals("RED")) {
    	   parts = "§c";
       }
       if(parts.contentEquals("GREEN")) {
    	   parts = "§a";
       }
   
       if(parts.contentEquals("YELLOW")) {
    	   parts ="§e";
       }
   
       if(parts.contentEquals("BLUE")) {
    	   parts = "§9";
       }
      
   
        bc.append(" " + parts);
      }
      
      
      ArmorStand stand = (ArmorStand)ploc.getWorld().spawnEntity(ploc, EntityType.ARMOR_STAND);
      stand.setVisible(false);
      stand.setCustomName(bc.toString());
      stand.setCustomNameVisible(true);
      stand.setGravity(false);
            

      
      }
  
    	
    	
  return true;  
    	
    }
    
    return false;
  }
}
