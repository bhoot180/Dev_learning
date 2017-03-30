package readfile;

import java.io.*;

public class ReadFile {
	
	private static String fileName = "DevLearning.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader nFileRead = null; 
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
		
			String currentRow;
			
			while ((currentRow = br.readLine()) != null) {
				System.out.println(currentRow);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
		
		
}


