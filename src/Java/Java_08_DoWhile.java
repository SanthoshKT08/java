package Java;

import java.util.Scanner;

public class Java_08_DoWhile {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
//		int value;
//		do {
//			
//			System.out.println("Enter the number");
//			 value = input.nextInt();
//			
//		} while (value!=3);
//		
//		System.out.println("I got number 3");
		
		int a=0;
		String name;
		for(a=0;a<5;a++)
		{
			System.out.println("Enter your name");
			name = input.nextLine();
			System.out.println("My name is "+name);
		}
		
		System.out.println("Came our form for loop");
		
		
		
	}

}
