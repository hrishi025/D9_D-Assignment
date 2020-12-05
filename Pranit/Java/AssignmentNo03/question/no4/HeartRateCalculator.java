package ass3.question.no4;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class HeartRateCalculator {

	public class Date {
		private int day;
		private int month;
		private int year;

		public Date(int day, int month, int year) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;

		}

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

		public Date() {
			// TODO Auto-generated constructor stub
		}

	}

	Date dt = new Date();

	private String firstName;
	private String lastName;
	private Date dateofBirth;
	private int age; // age in years
	private int maxHeartRate; // maxHeartRatePerMinute ==> 220 - age
	private int targetHeartRate; // ==> 50 - 85 % of maxHeartRate

	public HeartRateCalculator(String firstName, String lastName, Date dateofBirth, int age, int maxHeartRate,
			int targetHeartRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.age = age;
		this.maxHeartRate = maxHeartRate;
		this.targetHeartRate = targetHeartRate;
	}

	public HeartRateCalculator() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = 2020 - age;
	}

	public int getMaxHeartRate() {
		return maxHeartRate;
	}

	public void setMaxHeartRate(int maxHeartRate) {
		this.maxHeartRate = maxHeartRate;
	}

	public int getTargetHeartRate() {
		return targetHeartRate;
	}

	public void setTargetHeartRate(int targetHeartRate) {
		this.targetHeartRate = targetHeartRate;
	}

	Date dte = new Date();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HeartRateCalculator hc = new HeartRateCalculator();

		System.out.print("Enter First Name: ");
		hc.setFirstName(sc.nextLine());
		System.out.print("Enter Last Name : ");
		hc.setLastName(sc.nextLine());
		System.out.print("Enter Day of Date Of Birth: ");
		hc.dt.setDay(sc.nextInt());
		System.out.print("Enter Month of Date Of Birth: ");
		hc.dt.setMonth(sc.nextInt());
		System.out.print("Enter Year of Date Of Birth: ");
		hc.dt.setYear(sc.nextInt());
		
		hc.setAge(hc.dt.getYear());
		
		System.out.println("\n");
		
		System.out.println("Full Name : " + hc.getFirstName() + " " + hc.getLastName());
		System.out.println("Age : " + hc.getAge());
		System.out.println("Date of Birth : " + hc.dt.getDay() + "/ " + hc.dt.getMonth() + " / " + hc.dt.getYear());

		hc.maxHeartRate = 220 - hc.age;
		System.out.println("Maximum Heart Rate Per Minute is: " + hc.maxHeartRate);

		if (hc.maxHeartRate > 0.5 * hc.maxHeartRate && hc.maxHeartRate < 0.85 * hc.maxHeartRate)
			System.out.println("Target Heart Rate is in Healty Range");
		else
			System.out.println("Target Heart Rate is not in Healty Range");

	}

}
