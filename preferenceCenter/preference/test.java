/*package preferences;

import java.io.*;
import java.util.Scanner;

*//**
 * @author nmk263
 *
 * This is the main method. This class contains the instructions for the program.
 *
 *//*

public class test {

		public static void main(String[] args) throws IOException {

			UserInfo buddy = new UserInfo();
			buddy.setFirstName("Buddy");
			
			MyPreference user1 = new MyPreference();
			user1.setUserEmail("Test@email.com");
			user1.setUserPhoneNumber(1999000123);
			
			PreferenceValues defaultValues = new PreferenceValues();
			defaultValues.setPreferenceID(1);
			defaultValues.setPrefrenceDescription("Preferred method of communication for password reset.");
			defaultValues.setPrefrenceType("security");
			 
			SelectedParams defaultEmailParams = new SelectedParams();
			defaultEmailParams.setParamName("Email");
			
			
			// Preference options available to customer
			
			Parameter email1 = new Parameter();
			email1.setChannel("Email");
			email1.setChannelType("Business");
			
			Parameter email2 = new Parameter();
			email2.setChannel("Email");
			email2.setChannelType("Personal");
			
			Parameter sms1 = new Parameter();
			sms1.setChannel("SMS");
			sms1.setChannelType("Business");
			
			Parameter sms2 = new Parameter();
			sms2.setChannel("SMS");
			sms2.setChannelType("Personal");
			
			Parameter push1 = new Parameter();
			push1.setChannel("Push");
			push1.setChannelType("Application");
			
			
			
			
			
			
			
			
			
			String fileName = "userPrefrences.txt";


			// TODO Auto-generated method stub

			Scanner login = new Scanner(System.in);

			System.out.println("Please enter your user name: ");

			String userName = (login.nextLine());

			if(buddy.getFirstName().equals(userName)){

				int pageView = 2;

				if (pageView < 1){

					Scanner commPrefrence = new Scanner(System.in);

					System.out.println("Please select a communication preference: (Email, Sms or Push)");

					String commType = (commPrefrence.nextLine());

					FileWriter nFileObj = null; {

						try {
							nFileObj = new FileWriter(fileName);
						} 

						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						BufferedWriter buffFileObj = new BufferedWriter(nFileObj);

						buffFileObj.write("Users name: " + buddy.getFirstName());
						buffFileObj.newLine();
						buffFileObj.write("Prefrence: " + commType);
						buffFileObj.newLine();


						buffFileObj.close();

					}	

					commPrefrence.close();
				}

				else{

					try (BufferedReader br = new BufferedReader(new FileReader(fileName))){

						String currentRow;

						while ((currentRow = br.readLine()) != null) {
							System.out.println(currentRow);
						}

					} 

					catch (IOException e) {					
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					Scanner changePrefrence = new Scanner(System.in);

					System.out.println("Would you like to change your communication preference: (Yes/No)");

					String changeType = (changePrefrence.nextLine());

					if(changeType.equals("Yes") || changeType.equals("yes")) {

						Scanner commPrefrence = new Scanner(System.in);

						System.out.println("Please select a communication preference: (Email, Sms or Push)");

						String commType = (commPrefrence.nextLine());

						FileWriter nFileObj = null; {

							try {
								nFileObj = new FileWriter(fileName);
							} 

							catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							BufferedWriter buffFileObj = new BufferedWriter(nFileObj);

							buffFileObj.write("Users name: " + buddy.getFirstName());
							buffFileObj.newLine();
							buffFileObj.write("Prefrence: " + commType);
							buffFileObj.newLine();


							buffFileObj.close();

						}
						commPrefrence.close();

						changePrefrence.close();
					}

					else { 

						System.out.println("No changes have been made!");

					}
				}



				login.close();
			}

			else {

				System.out.println("Not a valid user!");

			}



		}	


	}

	
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
	

}
*/