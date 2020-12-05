package ass3.question.no8;

import java.util.Scanner;
import java.util.Date;  
class ComputerizedHealthRecord {
	
	public class DateDOB {
		private int day;
		private int month;
		private int year;
		// Constructor
		public DateDOB(int day, int month, int year) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}
		public DateDOB() {
			// TODO Auto-generated constructor stub
		}
		// Getter Setter Methods
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
		
	}
	
	DateDOB dt = new DateDOB();
	
	private String firstName;
	private String lastName;
	private String gender;
	private Date dateOfBirth;
	private int height; // Height in Inches
	private float weight; // Weight in Pounds
	private int age;
	private double bmi;
	private int maxHeartrate;
	private double targetHeartRate;
	
	// COnstructor
	public ComputerizedHealthRecord(String firstName, String lastName, String gender, Date dateOfBirth, int height,
			float weight, int age, double bmi, int maxHeartrate, int targetHeartRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.bmi = bmi;
		this.maxHeartrate = maxHeartrate;
		this.targetHeartRate = targetHeartRate;
	}
	public ComputerizedHealthRecord() {
		// TODO Auto-generated constructor stub
	}
	
	// Getter Setter Methods
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = 2020 - age;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public int getMaxHeartrate() {
		return maxHeartrate;
	}

	public void setMaxHeartrate(int maxHeartrate) {
		this.maxHeartrate = 220 - maxHeartrate;
	}

	public double getTargetHeartRate() {
		return targetHeartRate;
	}

	public void setTargetHeartRate(double targetHeartRate) {
		this.targetHeartRate = targetHeartRate;
	}
	
	
}
public class HealthRecord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ComputerizedHealthRecord chr = new ComputerizedHealthRecord();		
		
		System.out.print(" Enter First Name : ");
		chr.setFirstName(sc.nextLine());
		
		System.out.print(" Enter Last Name : ");
		chr.setLastName(sc.nextLine());
		
		System.out.print(" Enter Gender : ");
		chr.setGender(sc.nextLine());
		
		System.out.print(" Enter Day of Date Of Birth  : ");
		chr.dt.setDay(sc.nextInt());
		
		System.out.print(" Enter Month of Date Of Birth  : ");
		chr.dt.setMonth(sc.nextInt());
		
		System.out.print(" Enter Year of Date Of Birth  : ");
		chr.dt.setYear(sc.nextInt());
		
		System.out.print(" Enter Height in Inches  : ");
		chr.setHeight(sc.nextInt());
	
		System.out.print(" Enter Weight in Pounds  : ");
		chr.setWeight(sc.nextInt());
		
		chr.setAge(chr.dt.getYear());
		chr.setMaxHeartrate(220 - chr.getAge());
		chr.setBmi(chr.getWeight() / (chr.getHeight() * chr.getHeight()));
		chr.setTargetHeartRate(0.7 * chr.getMaxHeartrate());
	
		System.out.println();
		
		System.out.println("Full Name : " + chr.getFirstName() + " " + chr.getLastName());
		System.out.println("Gender: " + chr.getGender());
		System.out.println("Date Of Birth : " + chr.dt.getDay() + " / " + chr.dt.getMonth() + " / " + chr.dt.getYear());
		System.out.println("Height : " + chr.getHeight() + " Inches");
		System.out.println("Weight : " + chr.getWeight() + " Pounds");
		System.out.println("Age : " + chr.getAge() + " Years");
		System.out.println("BMI : " + chr.getBmi());
		System.out.println("Max Heart Rate : " + chr.getMaxHeartrate());
		System.out.println("Target Heart Rate : " + chr.getTargetHeartRate());

	}

}



















