package com.github.Shiul93.MineReporter.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReportsCommandHandler implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args) {
		if (args.length > 0) {
			
		} else {
			sender.sendMessage(command.getUsage());
		}
		return false;
	}

}
