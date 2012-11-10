package com.github.Shiul93.MineReporter;

import org.bukkit.plugin.java.JavaPlugin;

final class Report extends JavaPlugin{
	
	private String reporter = "";
	private String reportedUsr = "";
	private String reportMsg = "";
	
	
public Report(String reporter,String reportedUser, String message){

this.reporter=reporter;	
this.reportedUsr=reportedUser;
this.reportMsg=message;
	
	
}
public String getReporter(){
	
	return this.reporter;
}

public String getUsr(){
	
	return this.reportedUsr;
}

public String getReportMsg(){
	
	return this.reportMsg;
}
@Override
public String toString(){
	
	return "The user "+this.reportedUsr+" has been reported by "+this.reporter+" for "+this.reportMsg;
	
	
}
}
