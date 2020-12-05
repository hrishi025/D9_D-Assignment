package ass5.que3;

import java.util.Scanner;

public class HourlySalariedEmployee extends Employee {
    static Scanner sc = new Scanner(System.in);

private double hourlyWage;
private double hoursWorked;
private double totalWages;

// Parameterised Constructor
    public HourlySalariedEmployee(double hourlyWage, double hoursWorked, double totalWages) {
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.totalWages = totalWages;
    }
    public HourlySalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double hourlyWage, double hoursWorked, double totalWages) {
        super(firstName, lastName, socialSecurityNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.totalWages = totalWages;
    }

    // Parameter less Constructor
    public HourlySalariedEmployee() {
        super();
        this.hourlyWage = 0.0;
        this.hoursWorked = 0.0;
        this.totalWages = 0.0;
    }


    //Getters and Setters
    public double getWage() {
        return hourlyWage;
    }
    public void setWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalWages() {
        return totalWages;
    }
    public void setTotalWages() {
        if (this.hoursWorked <= 40) {
            this.totalWages = (this.hourlyWage * this.hoursWorked);
        }
        else if (this.hoursWorked > 40){
            this.totalWages = (40 * this.hourlyWage + (this.hoursWorked -40) * this.hourlyWage * 1.5);
        }
    }

    // Accept Data
    public void acceptData() {
        super.acceptData();
        System.out.print("Enter Wages Per Hour : ");
        this.setWage(sc.nextDouble());
        System.out.print("Enter Working Hours : ");
        this.setHoursWorked(sc.nextDouble());
        this.setTotalWages();

    }

    //Display Data
    public void displayData() {
        super.displayData();
        System.out.println("Wages per Hour : " + this.getWage());
        System.out.println("Working Hours : " + this.getHoursWorked());
        System.out.println("Total Wages : " + this.getTotalWages());

    }
}
