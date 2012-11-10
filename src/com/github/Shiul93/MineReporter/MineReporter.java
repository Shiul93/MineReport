package com.github.Shiul93.MineReporter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class MineReporter extends JavaPlugin {
	
	@Override
    public void onEnable(){
		getLogger().info("MineReporter enabled");
    }
	
 
    @Override
    public void onDisable() {
    	getLogger().info("MineReporter disabled");
    }
    
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	if(cmd.getName().equalsIgnoreCase("mr")){ 
    		switch (label){
    			
    			case "report":
    				
    				
    				
    				break;
    			case "showpl":
    				
    				
    				
    				break;	
    			case "show":
    				
    				
    				
    				break;
    			case "del":
    				
    				
    				
    				break;    				
    		
    		}
    		
    		
    		
    		
    		
    		
    		
    		return true;
    	} //If this has happened the function will return true. 
            // If this hasn't happened the a value of false will be returned.
    	return false; 
    }
    
    

    
}
