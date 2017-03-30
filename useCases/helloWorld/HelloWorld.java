package helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String helloWorld = "Hello World";
		String hello = "Hello";
		String world = "World";
		
		System.out.println(helloWorld);
		
		if (helloWorld.equals(hello)) {
			
			System.out.println("Compared " + helloWorld + " with " + hello);
		}
		else if (helloWorld.equals(world)) {
			System.out.println("Compared " + helloWorld + " with " + helloWorld);
		}
		
		else {
			
			System.out.println("Compared " + helloWorld + " with " + helloWorld);
		}

		
	}

}
