#MineReport
Report incidents, such as hackers, insults or server issues

##Commands

    /report [user] [reason] [descipription]

Report a user for given reason with a description.  
Reason must beone of the defined reason names in configuration.  
`[user]` may be `!` so that no name is given, or that the issue is not related
to a specific user.

    /reports list

List all reports, in this format:
    [id]. [user] [reason] [First 10 or so characters of description]

Close a report

    /reports close [id]

Reopen a report

    /reports reopen [id]

Delete a report

    /reports delete [id]

Delete *all* reports

    /reports clear
