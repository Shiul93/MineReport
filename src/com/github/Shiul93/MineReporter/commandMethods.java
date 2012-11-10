package com.github.Shiul93.MineReporter;

import java.util.ArrayList;

import com.github.Shiul93.MineReporter.Report;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class commandMethods extends JavaPlugin{
	
	
	
	
public void reportCmd(String reporter,String reported,String reportMsg, ArrayList<Report> list)	
{
	Report report = new Report(reporter,reported,reportMsg);

	list.add(report);

	getLogger().info(report.toString());

	org.bukkit.Bukkit.broadcastMessage(report.toString());

	
}
public void showReportedCmd(CommandSender sender,ArrayList<Report> list){
	if (list==null){sender.sendMessage("There are no reported players");}
	else
	{
		sender.sendMessage("The reported players are:");	
	for (Report repor :list){
		
		sender.sendMessage(repor.getName());
		
		
	}
	sender.sendMessage("To see the details of the reports type /mr show [player] on the chat terminal");
	}
}

}
