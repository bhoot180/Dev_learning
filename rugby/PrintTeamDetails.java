package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintTeamDetails {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Team> teams = new ArrayList<Team>();
		
		// Instantiate an New instance of player
		
		Player player1 = new Player();
		
		// Using player1 to set the variables for new player instance
		player1.setScores(7);
		player1.setPersonName("John");
		player1.setMemberType("Player");
		
		// Repeat of player1
		Player player2 = new Player();
		player2.setScores(15);
		player2.setPersonName("Mark");
		player2.setMemberType("Player");
		
		// Instantiate an New instance of coach
		
		Coach coach1 = new Coach();
		
		// Using coach1 to set the variables for new coach instance
		coach1.setPersonName("Jim");
		coach1.setTimeCoaching(2);
		coach1.setMemberType("Coach");
		
		// Instantiate an New instance of sponsor

		Sponsor sponsor1 = new Sponsor();
		
		// Using sponsor1 to the set the variables for new sponsor instance
		sponsor1.setPersonName("Bill");
		sponsor1.setDonations(5000.00);
		sponsor1.setMemberType("Sponsor");
		
		// Instantiate an New instance of Team
		
		Team team1 = new Team();
		
		// Instantiate an New instance of TeamMember
		List<TeamMember> teamMembers = new ArrayList<TeamMember>();
		
		// Adding team members to the new Array list
		teamMembers.add(player1);
		teamMembers.add(player2);
		teamMembers.add(coach1);
		teamMembers.add(sponsor1);
		
		//
		team1.setTeamMembers(teamMembers);
		team1.setTeamName("All Blacks");
		
		teams.add(team1);
		
		
		
			
		Player player3 = new Player();
		player3.setScores(3);
		player3.setPersonName("Paul");
		player3.setMemberType("Player");
		
		Player player4 = new Player();
		player4.setScores(10);
		player4.setPersonName("Rick");
		player4.setMemberType("Player");
		
		
		Coach coach2 = new Coach();
		coach2.setPersonName("Doc");
		coach2.setTimeCoaching(5);
		coach2.setMemberType("Coach");
		

		Sponsor sponsor2 = new Sponsor();
		sponsor2.setPersonName("Steve");
		sponsor2.setDonations(50000.00);
		sponsor2.setMemberType("Sponsor");
		
		Team team2 = new Team();
		
		List<TeamMember> teamMembers1 = new ArrayList<TeamMember>();
		
		teamMembers1.add(player3);
		teamMembers1.add(player4);
		teamMembers1.add(coach2);
		teamMembers1.add(sponsor2);
		
		
		team2.setTeamMembers(teamMembers1);
		team2.setTeamName("Spring Bok");
		
		teams.add(team2);
		/**
		 * teams - list of Team Objects
		 * each Team object is holding list of TeamMember objects
		 * each TeamMember object holds the team member details
		 */
		
		//Initiate a new scanner

		Scanner userInputScanner = new Scanner(System.in);
		
		// Collect the team name from the user
		System.out.println("What team would you like to know about?");
		String teamName = (userInputScanner.nextLine());	
		
		// creating a search function for finding the team name
		for(int i = 0; i < teams.size(); i++){
			
			
			Team team = teams.get(i);
			
			// if statement that compares the team name the user entered to the team name declared in the team class
			if(team.getTeamName().equals(teamName)){
				
				// If the team name matches print out the team name the user enters
				System.out.println("Team Name: " + team.getTeamName());
				
				// After finding team name run another for loop to run through the team members array list
				for(int p = 0; p < team.getTeamMembers().size(); p++){
					
					TeamMember teamMember = team.getTeamMembers().get(p); 
					
					System.out.println("Team Member name: " + teamMember.getPersonName());
					if (teamMember.getMemberType().equals("Player")){
						System.out.println("Player Score: " + ((Player)teamMember).getScores());
						if (((Player)teamMember).getScores() < 10){
							System.out.println("You have scored less than 10 tries.");
						}
						else {
							System.out.println("You have scored more than 10 tries!");
						}
					} 
					else if(teamMember.getMemberType().equals("Coach")){
						System.out.println("Years coaching: " + ((Coach)teamMember).getTimeCoaching());
						
					}
					else{
						System.out.println("Amount Donated: " + ((Sponsor)teamMember).getDonations());
						
					}
				}
					
			}
			
		}
		
		
	}

}



// Fix the second team
// Create a new statement that determines if a player has scored less then 10 goals
