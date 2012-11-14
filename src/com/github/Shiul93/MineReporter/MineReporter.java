package com.github.Shiul93.MineReporter;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.*;
public final class MineReporter extends JavaPlugin {
	
	@Override
    public void onEnable(){
		List<Report> reportList = new ArrayList<Report>();
		getLogger().info("MineReporter enabled");
		
		// "report" was registered in plugin.yml. now delete this comment.
		getCommand("report").setExecutor(new ReportCommandHandler());
    }
	
 
    @Override
    public void onDisable() {
    	getLogger().info("MineReporter disabled");
    }
}
