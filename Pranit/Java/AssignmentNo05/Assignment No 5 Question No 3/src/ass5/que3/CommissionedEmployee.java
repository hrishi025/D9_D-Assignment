package ass5.que3;

import java.util.Scanner;

public class CommissionedEmployee extends Employee {
    static Scanner sc = new Scanner(System.in);

    private double grossSale;
    private double commissionRate;
    private  double totalCommission;

    // Parameterised Constructor

    public CommissionedEmployee(double grossSale, double commissionRate, double totalCommission) {
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
        this.totalCommission = totalCommission;
    }
    public CommissionedEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate, double totalCommission) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
        this.totalCommission = totalCommission;
    }


    // Parameter less Constructor
    public CommissionedEmployee() {
        super();
        this.grossSale = 0.0;
        this.commissionRate = 0.0;
        this.totalCommission = 0.0;
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

    public double getTotalCommission() {
        return totalCommission;
    }
    public void setTotalCommission() {
        this.totalCommission = this.commissionRate * this.grossSale;
    }

    // Accept Data
    public void acceptData() {
        super.acceptData();
        System.out.print("Enter Gross Sale : ");
        this.setGrossSale(sc.nextDouble());
        System.out.print("Enter Commission Rate : ");
        this.setCommissionRate(sc.nextDouble());
        this.setTotalCommission();

    }

    //Display Data
    public void displayData() {
        super.displayData();
        System.out.println("Gross Sale : " + this.getGrossSale());
        System.out.println("Commission Rate : " + this.getCommissionRate());
        System.out.println("Total Commission : " + this.getTotalCommission());
    }

}
