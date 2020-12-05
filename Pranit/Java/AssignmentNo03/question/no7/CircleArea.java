package ass3.question.no7;

import java.util.Scanner;

 class CircleAreaTest {

	private int radiuas;
	private double diameter;
	private double circumference;
	private double area;
	
	
	// Constructor
	public CircleAreaTest(int radiuas, double diameter, double circumference, double area) {
		super();
		this.radiuas = radiuas;
		this.diameter = diameter;
		this.circumference = circumference;
		this.area = area;
	}


	public CircleAreaTest() {
		// TODO Auto-generated constructor stub
	}


	//Getter and Setter
	public int getRadiuas() {
		return radiuas;
	}


	public void setRadiuas(int radiuas) {
		this.radiuas = radiuas;
	}
	
	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}

public class CircleArea{
	
	 static double PI = Math.PI;
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		CircleAreaTest a = new CircleAreaTest();
		System.out.print("Enter Radious: ");
		a.setRadiuas(sc.nextInt());
		a.setArea(PI * a.getRadiuas() * a.getRadiuas());
		a.setDiameter(2 * a.getRadiuas());
		a.setCircumference(2 * PI * a.getRadiuas());
		
		System.out.println(" \n Entered radious is: " + a.getRadiuas());
		System.out.println(" Diameter of Circle is: " + a.getDiameter());
		System.out.println(" Area of Circle is: " + a.getArea());
		System.out.println(" Circumference of Circle is: " + a.getCircumference());

		}

}