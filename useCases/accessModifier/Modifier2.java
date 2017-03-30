package accessModifier;

public class Modifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifier test = new AccessModifier();
		
		int first = test.x;		
		int second = test.getY();
		int third = test.z;
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
	}

}
