package Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java_33_ReadingTextFiles {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String filePath = "D:/File.txt";
		
		File text = new File(filePath);
		
		//System.out.println(text);
		
		Scanner in = new Scanner(text);
		
		String value = in.nextLine();
		System.out.println("Read value " + value);
		
		in.nextLine();
		int count = 0;
		while (in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count + ":" +line);
			count++;
		}
		
		in.close();
		
	}

}
