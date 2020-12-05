package ass3.question.no2;

import java.util.Scanner;

/*	Q.2 Create a class called Employee that includes three instance
variables—a first name (type String), a last name (type String)
and a monthly salary (double). Provide a constructor that
initializes the three instance variables. Provide a set and a
get method for each instance variable. If the monthly salary is
not positive, do not set its value. Write a test application
named EmployeeTest that demonstrates class Employee’s
capabilities. Create two Employee objects and display each
object’s yearly salary. Then give each Employee a 10% raise and
display each Employee’s yearly salary again.
*/

class EmployeeTest {

	private String firstName;
	private String lastName;
	private double salary;
	private double incrementedSalary;

	// Constructor
	public EmployeeTest(String firstName, String lastName, double salary, double incrementedSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.incrementedSalary = incrementedSalary;
	}

	public EmployeeTest() {
		// TODO Auto-generated constructor stub
	}

	// Getter and Setter Methods
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 0)
			this.salary = 0;
		else
			this.salary = salary;
	}
	
	public void setIncrementedSalary() {
		this.incrementedSalary = (this.getSalary() + this.getSalary() * 0.1) * 12;		
	}

	public double getIncrementedSalary() {
		return incrementedSalary;
	}
	
}

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmployeeTest emp1 = new EmployeeTest();
		System.out.print("Enter First Name of Employee 1: ");
		emp1.setFirstName(sc.nextLine());
		System.out.print("Enter Last Name of Employee 1: ");
		emp1.setLastName(sc.nextLine());
		System.out.print("Enter Salary of Employee 1: ");
		emp1.setSalary(sc.nextDouble());
		emp1.setIncrementedSalary();
		
		System.out.println();
		
		EmployeeTest emp2 = new EmployeeTest();
		System.out.print("Enter First Name of Employee 2: ");
		emp2.setFirstName(sc.nextLine());
		System.out.print("Enter Last Name of Employee 2: ");
		emp2.setLastName(sc.nextLine());
		System.out.print("Enter Salary of Employee 2: ");
		emp2.setSalary(sc.nextDouble());
		emp2.setIncrementedSalary();
		
		System.out.println("\nSalary Of Employee 1 :" + emp1.getSalary());
		System.out.println("Salary Of Employee 1 :" + emp2.getSalary());
		
		System.out.println("Incremented Salary Of Employee 1 :" + emp1.getIncrementedSalary());
		System.out.println("Incremented Salary Of Employee 2 :" + emp2.getIncrementedSalary());
		
		
	}


}