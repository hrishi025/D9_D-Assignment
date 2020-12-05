package ass4.que7;

import java.util.Scanner;

public class SavingAccountEntity {
    static Scanner sc = new Scanner(System.in);
    static double annualIntrestRate;
    private double savingBalance;

    //Constructor
    public SavingAccountEntity(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public static void modifyAnnualIntrestRate() {
        System.out.print("Enter  Annual Intrest Rate : ");
        SavingAccountEntity.annualIntrestRate = sc.nextDouble();
    }

    public void monthlyIntrest() {

        double monthlyIntrest = (this.savingBalance * SavingAccountEntity.annualIntrestRate) / 12;
        for (int i = 12; i >= 1; i--) {
            double intrest = monthlyIntrest / i;
            System.out.println("Monthly Intrest for Month " + i +" is  " + intrest);
        }
    }


    public void calculateMonthlyIntrest() {
        double monthlyIntrest = (this.savingBalance * SavingAccountEntity.annualIntrestRate) / 12;
        this.savingBalance = this.savingBalance + monthlyIntrest;
        System.out.println("Total Intrest : " + monthlyIntrest);
    }


    public void displayData() {

        System.out.println("Current Saving Balance : " + this.savingBalance);
        System.out.println();
    }

}
