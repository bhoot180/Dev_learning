package Recursion;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printRow(1,4);
		
		//makeTriangleString(10);
		
		System.out.println(makeTriangleString(10));

	}
	
	public static String makeTriangleString(int numRows){
		
		StringBuilder printTriangle = new StringBuilder();
		
		for (int c = 0; c < numRows; c++){
			
			String rowString = makeRowString(2 * c +1,numRows - c - 1) + '\n';
			
			printTriangle.append(rowString);
		
		}
		
		return printTriangle.toString();
		
	}

	public static String makeRowString(int star, int space){
		
		StringBuilder print = new StringBuilder();
		
		for (int a = 0; a < space; a++){
			
			print.append(" ");
			
		}
			
		for (int b = 0; b < star; b++){
			
			print.append("*");
			
		}
			
		return print.toString();
		
		//System.out.println(print);
		
	}
	
}
