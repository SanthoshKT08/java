package Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Java_34_HandlingException {
	
	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try
		{
			FileReader fr = new FileReader(file);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("Fianl LIne");
		}

}
