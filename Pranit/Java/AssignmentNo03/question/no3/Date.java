package ass3.question.no3;

import java.util.Scanner;

/*	Q.3 Create a class called Date that includes three instance
variables�a month (type int), a day (type int) and a year (type
int). Provide a constructor that initializes the three instance
variables and assumes that the values provided are correct.
Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month,
day and year separated by forward
slashes (/).
Write a test application named DateTest that demonstrates class
Date�s capabilities.
*/

public class Date {

	private int day;
	private int month;
	private int year;

	//Date Display method
	public void Displaydate() {

		System.out.println(this.day + " / " + this.month + " / " + this.year);
	}

	// Constructor
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;

	}

	public Date() {

	}

	// Getter and Setter Methods
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Date dt = new Date();

		System.out.print("Enter Day: ");
		dt.setDay(sc.nextInt());

		System.out.print("Enter Month: ");
		dt.setMonth(sc.nextInt());

		System.out.print("Enter Year: ");
		dt.setYear(sc.nextInt());

		dt.Displaydate();

	}

}
