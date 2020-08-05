package Java;

import java.util.Scanner;

public class Java_07_Scanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String line=input.nextLine();
		
		System.out.println("My name is " +line );
	
		System.out.println("Enter the float number");
		float flo = input.nextFloat();
		
		System.out.println("Float value is "+flo);
		
		System.out.println("Enter the string");
		
		String go = input.next();
		
		System.out.println("go is" +go);
		
		System.out.println("Enter a value ");
		
		int value = input.nextInt();
		
		while (value!=10) 
		{
		   System.out.println("Eneter the integer number");
		   
		   value = input.nextInt();
		}
		
		System.out.println("Got the 10");
		
		input.close();
		
	}

}
