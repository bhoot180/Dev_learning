package preferences;

import java.io.*;
import java.util.Scanner;

/**
 * @author nmk263
 *
 * This is the main method. This class contains the instructions for the program.
 *
 */

public class PreferenceTester {

	public static void main(String[] args) throws IOException {

		UserInfo buddy = new UserInfo();
		buddy.setFirstName("Buddy");
		
		MyPreference user1 = new MyPreference();
		user1.setUserEmail("Test@email.com");
		user1.setUserPhoneNumber(1999000123);
		
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
