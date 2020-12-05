package ass5.que3;

import java.util.Scanner;

public class BasePlusCommissionEmployee extends Employee {
    static Scanner sc = new Scanner(System.in);

    private double grossSale;
    private double commissionRate;
    private double baseSalary;
    private double totalSalary;

    // Parameterised Constructor
    public BasePlusCommissionEmployee(double grossSale, double commissionRate, double baseSalary, double totalSalary) {
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
        this.totalSalary = totalSalary;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate, double baseSalary, double totalSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
        this.totalSalary = totalSalary;
    }


    // Parameter less Constructor
    public BasePlusCommissionEmployee() {
        super();
        this.grossSale = 0.0;
        this.commissionRate = 0.0;
        this.baseSalary = 0.0;
        this.totalSalary = 0.0;
    }

    //Getters and Setters
    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary() {
        this.totalSalary = (this.commissionRate * this.grossSale) + this.baseSalary + 0.1 * this.baseSalary;
    }

    // Accept Data
    public void acceptData() {
        super.acceptData();
        System.out.print("Enter Gross Sale : ");
        this.setGrossSale(sc.nextDouble());
        System.out.print("Enter Commission Rate : ");
        this.setCommissionRate(sc.nextDouble());
        System.out.print("Enter Base Salary : ");
        this.setBaseSalary(sc.nextDouble());
        this.setTotalSalary();

    }

    //Display Data
    public void displayData() {
        super.displayData();
        System.out.println("Gross Sale : " + this.getGrossSale());
        System.out.println("Commission Rate : " + this.getCommissionRate());
        System.out.println("Base Salary : " + this.getBaseSalary());
        System.out.println("Increment :" + 0.1 * this.baseSalary);
        System.out.println("Total Salary : " + this.getTotalSalary());

    }
}
