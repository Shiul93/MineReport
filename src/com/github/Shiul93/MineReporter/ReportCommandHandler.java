package com.github.Shiul93.MineReporter;

import java.util.ArrayList;

import com.github.Shiul93.MineReporter.Report;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ReportCommandHandler implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args) {
		if (args.length > 0) {
			
		} else {
			sender.sendMessage(command.getUsage());
		}
		return false;
	}

	private void reportCmd(String reporter, String reported, String reportMsg, ArrayList<Report> list) {
		Report report = new Report(reporter,reported,reportMsg);
	
		list.add(report);
	
	
		//org.bukkit.Bukkit.broadcastMessage(report.toString());
	}
	
	public void showReportedCmd(CommandSender sender, ArrayList<Report> list) {
		if (list==null) {
			sender.sendMessage("There are no reported players");
		} else {
			sender.sendMessage("The reported players are:");	
			for (Report repor :list) {
				sender.sendMessage(repor.getName());
				
			}
			sender.sendMessage("To see the details of the reports type /mr show [player] on the chat terminal");
		}
	}
}
