package ass4.que6;
import java.util.Scanner;

public class Conversion {
  static   Scanner sc = new Scanner(System.in);

    public static void INRtoUSD() {
        System.out.print("Enter Anount  In Ruppies to be Converted: ");
        double rs = sc.nextDouble();
        System.out.println("Entered Amount in INR: " + rs);
        System.out.println("Converted Amount to USD: " + rs  / 73.76);
    }

    public static void USDtoINR() {
        System.out.print("Enter Anount  In Ruppies to be Converted: ");
        double usd = sc.nextDouble();
        System.out.println("Entered Amount in USD: " + usd);
        System.out.println("Converted Amount to INR: " + usd * 73.76);
    }
}
