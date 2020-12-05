package ass5.que3;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Employee employeeWeeklySalaried = new WeeklySalariedEmployee();
    static Employee employeeHourlySalaried = new HourlySalariedEmployee();
    static Employee employeeCommissioned = new CommissionedEmployee();
    static Employee employeeBasePlusCommissioned = new BasePlusCommissionEmployee();


    public static int choice;

    public static void main(String[] args) {

        do {
            System.out.print("\n\nChoose Employee to Process\n 0. Exit\n1. Weekly Salaried Employee\n2. Hourly Salaried Employee\n3. Commissioned Employee\n4. Base Plus Commissioned Employee\n   Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    employeeWeeklySalaried.acceptData();
                    System.out.print("\nWeekly Salaried Employee ");
                    employeeWeeklySalaried.displayData();
                    break;

                case 2:
                    employeeHourlySalaried.acceptData();
                    System.out.print("\nHourly Salaried Employee ");
                    employeeHourlySalaried.displayData();
                    break;

                case 3:
                    employeeCommissioned.acceptData();
                    System.out.print("\nCommissioned Employee ");
                    employeeCommissioned.displayData();
                    break;

                case 4:
                    employeeBasePlusCommissioned.acceptData();
                    System.out.print("\nBase Salaried Commissioned Employee ");
                    employeeBasePlusCommissioned.displayData();
                    break;

                default:
                    break;
            }

        } while (choice != 0);

    }
}
