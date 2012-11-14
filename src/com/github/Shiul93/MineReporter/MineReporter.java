package com.github.Shiul93.MineReporter;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.Shiul93.MineReporter.Command.ReportCommandHandler;
import com.github.Shiul93.MineReporter.Command.ReportsCommandHandler;

import java.util.*;
public final class MineReporter extends JavaPlugin {
	
	private ArrayList<Report> list;


	@Override
    public void onEnable() {
		
		list = loadReports();
		getLogger().info("MineReporter enabled");
		
		getCommand("report").setExecutor(new ReportCommandHandler());
		getCommand("reports").setExecutor(new ReportsCommandHandler());
    }
	
 
	@Override
    public void onDisable() {
		saveReports(list);
    	getLogger().info("MineReporter disabled");
    }

	/**
	 * Read reports from filesystem
	 * @return
	 */
    private ArrayList<Report> loadReports() {
		// TODO Auto-generated method stub
		return null;
	}
    
    /**
     * Save reports to filesystem
     * @param list2
     */
	private void saveReports(ArrayList<Report> list2) {
		// TODO Auto-generated method stub
		
	}
}
