package ass4.que6;

import java.util.Scanner;

public class ForeignExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice:\n1. Convert INR to USD\n2. Convert USD to INR\nYour Choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            Conversion.INRtoUSD();
        }
        else {
            Conversion.USDtoINR();
        }

    }
}
