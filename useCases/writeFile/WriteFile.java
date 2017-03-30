package writefile;

import java.io.*;


public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fileName = "DevLearning.txt";
		
		FileWriter nFileObj = null;
		
		try {
			nFileObj = new FileWriter(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter buffFileObj = new BufferedWriter(nFileObj);
		
		buffFileObj.write("Hello,");
		buffFileObj.newLine();
		buffFileObj.write("This is a test program for reading and writing files.");
		buffFileObj.newLine();
		buffFileObj.write("The expected out come is that the WriteFile project will insert this text in a new file.");
		buffFileObj.write("Then we will use this information later in the ReadFile project to call this information back.");
		buffFileObj.newLine();
		buffFileObj.write("Some Inputs: ");
		buffFileObj.write("Apples, ");
		buffFileObj.write("Oranges, ");
		buffFileObj.write("and Peaches.");
		buffFileObj.newLine();
		buffFileObj.newLine();
		buffFileObj.newLine();
		buffFileObj.write("This section is for testing error handling.");
		buffFileObj.newLine();
		buffFileObj.write("THROWEXCEPTION");

		buffFileObj.close();
		
	}

}
