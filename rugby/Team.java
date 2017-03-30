package test;

import java.util.List;

public class Team { // Parent Class to

	private String teamName;
	
	// create a Array list of TeamMembers
	
	private List<TeamMember> teamMembers;
	
	//Getters and Setters

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<TeamMember> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<TeamMember> teamMembers) {
		this.teamMembers = teamMembers;
	}
	
}