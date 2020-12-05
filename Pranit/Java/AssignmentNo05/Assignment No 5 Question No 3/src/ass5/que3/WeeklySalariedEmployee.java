package ass5.que3;

import java.util.Scanner;

public class WeeklySalariedEmployee extends Employee {
    static Scanner sc = new Scanner(System.in);

    private double weeklySalary;

    // Default Constructor
    public WeeklySalariedEmployee() {
        this.weeklySalary = 0.0;
    }

    // Parameterised Constructor
    public WeeklySalariedEmployee(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public WeeklySalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    // Getter And Setter
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    // Accept Data
    public void acceptData() {
        super.acceptData();
        System.out.print("Enter Weekly Salary : ");
        this.setWeeklySalary(sc.nextDouble());

    }

    //Display Data
    public void displayData() {
        super.displayData();
        System.out.println("Weekly Salary : " + this.getWeeklySalary());
    }
}
