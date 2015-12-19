package com.ekclifford.BroadCastIt;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class BroadCastIt extends JavaPlugin{
	public void onEnable(){
		getLogger().info("Plugin Enabled");
		
	}
	
	public boolean oncommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("broadcastit Donate")){
			Player player = (Player) sender;
			if(player.hasPermission("broadcastit.use") || player.isOp())
				Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] " + ChatColor.GREEN + "Enjoying the server? Then please donate to keep the server running!");
				return true;
			}
			
			else if(cmd.getName().equalsIgnoreCase("broadcastit grief")){
				Player player = (Player) sender;
				if(player.hasPermission("broadcastit.use") || player.isOp())
				Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] " + "Please contact staff if you believe that you have been griefed!");
				return true;
			}
			
			else if(cmd.getName().equalsIgnoreCase("broadcastit hello")){
				Player player = (Player) sender;
				if(player.hasPermission("broadcastit.use") || player.isOp())
				Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] " + ChatColor.LIGHT_PURPLE + "Hello everyone!!! I hope you are all having a good day!");
				return true;
			}
			
			else if(cmd.getName().equalsIgnoreCase("broadcastit mail")){
				Player player = (Player) sender;
				if(player.hasPermission("broadcastit.use") || player.isOp())
				Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] " + ChatColor.DARK_AQUA + "Remember to check your mail everyday for important notices!");
				return true;
			}
			
			else if(cmd.getName().equalsIgnoreCase("broadcastit staff")){
				Player player = (Player) sender;
				if(player.hasPermission("broadcastit.use") || player.isOp())
				Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] " + ChatColor.DARK_BLUE + "The staff of this server are here for you! Please let us know if you feel like something needs to be changed.");
				return true;
			}
			
			else if(cmd.getName().equalsIgnoreCase("broadcastit reward")){
				Player player = (Player) sender;
				if(player.hasPermission("broadcastit.use") || player.isOp())
				Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] " + ChatColor.GREEN + "Everyone tp to spawn for a reward!!!");
				return true;
			}
			
			else if(cmd.getName().equalsIgnoreCase("broadcastit nostaff")){
				Player player = (Player) sender;
				if(player.hasPermission("broadcastit.use") || player.isOp())
				Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] Do not ask for staff or op!!!");
				return true;
			}
			
			else if(cmd.getName().equalsIgnoreCase("broadcastit rules")){
				Player player = (Player) sender;
				if(player.hasPermission("broadcastit.use") || player.isOp())
				Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] " + ChatColor.GREEN + "Please remember to read the rules!");
				return true;
			}
			
			else if(cmd.getName().equalsIgnoreCase("broadcastit vote")){
				Player player = (Player) sender;
				if(player.hasPermission("broadcastit.use") || player.isOp())
				Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] " + ChatColor.DARK_BLUE + "Please remember to vote for this server everyday!");
				return true;
			}
			
			else if(cmd.getName().equalsIgnoreCase("broadcastit glitch")){
				Player player = (Player) sender;
				if(player.hasPermission("broadcastit.use") || player.isOp())
				Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] " + ChatColor.DARK_GREEN + "If you find a glitch please report it so we can fix the problem!");
				return true;
			}
			
			else if(cmd.getName().equalsIgnoreCase("broadcastit questions")){
				Player player = (Player) sender;
				if(player.hasPermission("broadcastit.use") || player.isOp())
				Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] " + ChatColor.GREEN + "If you have any questions or concerns please feel free to ask or tell us!");
				return true;
			}
			else if(cmd.getName().equalsIgnoreCase("broadcastit")){
				sender.sendMessage("Not enough arguments!");
				return true;
			}
			
		
		return false;
		
	}
}
