package com.github.Shiul93.MineReporter.Command;

import java.util.ArrayList;
import java.util.Arrays;

import com.github.Shiul93.MineReporter.Report;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ReportCommandHandler implements CommandExecutor {
	
	private ArrayList<Report> list;

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args) {
		if (args.length > 0) {
			
			//TODO: check correctness of arguments, we expect "user" "reason" "the" "rest" "is" "description"
			
			String description = null;
			
			if (args.length > 2) {
				description = args[2];
				for(int i = 3; i < args.length; i++) {
					description += " " + args[i];
				}
			}
			
			reportCmd(sender.getName(), args[0], description);
			
		} else {
			sender.sendMessage(command.getUsage());
		}
		return false;
	}

	/**
	 * Create a report and add to list
	 * @param reporter
	 * @param reported
	 * @param reportMsg may be null
	 */
	private void reportCmd(String reporter, String reported, String reportMsg) {
		Report report = new Report(reporter,reported,reportMsg);
	
		list.add(report);
	
	
		//org.bukkit.Bukkit.broadcastMessage(report.toString());
	}
	
	public void showReportedCmd(CommandSender sender, ArrayList<Report> list) {
		if (list==null) {
			sender.sendMessage("There are no reported players");
		} else {
			sender.sendMessage("The reported players are:");	
			for (Report repor: list) {
				sender.sendMessage(repor.getUsr());
				
			}
			sender.sendMessage("To see the details of the reports type /mr show [player] on the chat terminal");
		}
	}
}
