package question.no4;

import java.util.Scanner;

public class Calculation {

	/*	 4. Write a program for addition, subtraction, multiplication and division of two numbers.	*/
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int a, b;
		System.out.print("Enter 1st Number: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.print("Enter 2st Number: ");
		b = sc.nextInt(); 
		
		int add = a+b;
		System.out.println("Addition of Two Numbers : " + add);
		
		int sub = a-b;
		System.out.println("Subtraction of Two Numbers : " + sub);
		
		int mul = a*b;
		System.out.println("multiplication of Two Numbers : " + mul);
		
		double div = a/b;
		System.out.println("Division of Two Numbers : " + div);

	}

}
