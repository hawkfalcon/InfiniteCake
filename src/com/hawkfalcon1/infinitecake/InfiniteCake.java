//Made by: Hawkfalcon1. Feel free to use the code
package com.hawkfalcon1.infinitecake;


import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class InfiniteCake extends JavaPlugin implements Listener{

	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
	}

	public void onDisable(){}


	@EventHandler
	public void playerInteract(PlayerInteractEvent event)
	{
		if(event.getAction() == Action.RIGHT_CLICK_BLOCK)
		{
			Block block = event.getClickedBlock();
			if(block.getType() == Material.CAKE_BLOCK)
			{
				Player player = event.getPlayer();
				if(player.hasPermission("infinitecake.use") && block.getData() == 5)
				{
					block.setData((byte) 0);
					player.sendMessage("Nom...");
					event.setCancelled(true);
				}
				if(block.getData() == 0);{
					player.sendMessage("Nom...");

				}
			}
		}
	}
}

