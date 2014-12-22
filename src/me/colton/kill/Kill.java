package me.colton.kill;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Kill extends JavaPlugin {


@SuppressWarnings("deprecation")
public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
	Player player = (Player)sender; 
	if (cmd.getName().equalsIgnoreCase("suicide")) {
    	 player.setHealth(0);
     }
	
	return true;
	
	}

}