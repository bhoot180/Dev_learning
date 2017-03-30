package AbstractClass;

import java.util.Scanner;

public class ImplementAbstract extends AbstractClass {

	
	public static void main(String[] args) {
		
		ImplementAbstract var = new ImplementAbstract();
		
		var.getUserInput();
	
		var.doSomething();
	}
	
	@Override
	public String getUserInput() {
		// TODO Auto-generated method stub
		
		System.out.println("enter something");
		
		Scanner inputScanner = new Scanner(System.in);
		
		String userInput = (inputScanner.nextLine());
		
				
		return userInput;
	}

	@Override
	public void doSomething(){
		
		super.doSomething();
		System.out.println("hello worl");
		
	}
}
