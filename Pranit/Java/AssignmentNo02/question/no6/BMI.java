package question.no6;

import java.util.Scanner;

public class BMI {

	/*
	 * 6. Create a BMI (Body Mass Index) calculator that reads the user’s weight in
	 * pounds and height in inches (or, if you prefer, the user’s weight in
	 * kilograms and height in meters), then calculates and displays the user’s body
	 * mass index. The formula for calculating BMI is BMI =
	 * (WeightInKiloGrams)/(HeightInMeters * HeightInMeters); BMI VALUES Underweight
	 * if BMI is less than 18.5 Normal if BMI is in between 18.5 and 24.9 Overweight
	 * if BMI is in between 25 and 29.9 Obese if BMI is 30 or greater
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		float weight, height, bmi;

		System.out.print("\nEnter Weight in kilograms : ");
		Scanner sc = new Scanner(System.in);
		weight = sc.nextFloat();

		System.out.print("Enter Height in Meters : ");
		height = sc.nextFloat();

		bmi = weight / (height * height);

		if (bmi < 18.5)
			System.out.println("Under Weight");

		else if (bmi > 18.5 && bmi < 24.9)
			System.out.println("Normal");

		else if (bmi > 25 && bmi < 29.9)
			System.out.println("Over Weight");

		else
			System.out.println("Obese");

	}

}
