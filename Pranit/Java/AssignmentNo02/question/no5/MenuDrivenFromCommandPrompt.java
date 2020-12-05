package question.no5;

import java.util.Scanner;

public class MenuDrivenFromCommandPrompt {

	/*
	 * 5. Modify above assignment and write a menu driven program. Accept input from
	 * command prompt.
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int a, b, option;
		
		while (true) {
			
		System.out.print("\nEnter 1st Number: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		System.out.print("Enter 2st Number: ");
		b = sc.nextInt();

			System.out.print("\nSelect Option:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nOption: ");

			option = sc.nextInt();
			switch (option) {

			case 0:
				System.exit(0);

			case 1:
				int c = a + b;
				System.out.println("Addition : " + c);
				break;

			case 2:
				int d = a - b;
				System.out.println("Subtraction : " + d);
				break;

			case 3:
				int e = a * b;
				System.out.println("Multiplication : " + e);
				break;

			case 4:
				int f = a / b;
				System.out.println("Division : " + f);
				break;

			default:
				System.out.println(" Wrong option");

			}

		}
	}

}
