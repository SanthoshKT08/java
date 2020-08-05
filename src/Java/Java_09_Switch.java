package Java;

import java.util.Scanner;

public class Java_09_Switch {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a command");
		String text=   input.nextLine();
		switch (text) {
		case "start":
			System.out.println("Program starts");
			break;

		case "end":
			System.out.println("Program ended");
			break;

		default:
			System.out.println("not recognize");
			break;
		}

	}

}
