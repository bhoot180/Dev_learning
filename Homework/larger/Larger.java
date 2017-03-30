package larger;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {

		// TODO Auto-generated method stub





		System.out.println("Please enter a number: ");



		Scanner input = new Scanner(System.in);



		int a = input.nextInt();



		System.out.println("Please enter a second number: ");



		Scanner input2 = new Scanner(System.in);



		int b = input2.nextInt();



		if (a > b) {

			System.out.println("The larger number is: " + a);

		}

		else if (a < b){

			System.out.println("The larger number is: " + b);

		}

		else {

			System.out.println("Both numbers are the same!");

		}





	}

}


