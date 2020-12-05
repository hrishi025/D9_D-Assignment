package ass3.question.no6;

import java.util.Scanner;

class Plan {
    int monthlyCharges;
    double callCharges;
    double smsCharges;
    int freeCalls;
    final double discount = 0.5;
    int noofcall;
    int noofsms;
    double amountcall;
    double amountsms;
    double amount;

    @Override
    public String toString() {
        return "Plan{" +
                "monthlyCharges=" + monthlyCharges +
                ", callCharges=" + callCharges +
                ", smsCharges=" + smsCharges +
                ", freeCalls=" + freeCalls +
                ", discount=" + discount +
                ", noofcall=" + noofcall +
                ", noofsms=" + noofsms +
                ", amountcall=" + amountcall +
                ", amountsms=" + amountsms +
                ", amount=" + amount +
                '}';
    }

    public void acceptdata(int choice) {

        switch (choice) {
            case 1:
                this.monthlyCharges = 199;
                this.callCharges = 1;
                this.smsCharges = 1;
                this.freeCalls = 50;
                break;
            case 2:
                this.monthlyCharges = 299;
                this.callCharges = 0.80;
                this.smsCharges = 0.75;
                this.freeCalls = 75;
                break;
            case 3:
                this.monthlyCharges = 399;
                this.callCharges = 0.60;
                this.smsCharges = 0.55;
                this.freeCalls = 100;
                break;
        }

        // Call Charges
        if (this.noofcall <= this.freeCalls)
            this.amountcall = 0;

        else      //100
        {
            this.noofcall = this.noofcall - this.freeCalls;   //25

            if (this.noofcall > 0 && this.noofcall < this.freeCalls) //25
                this.amountcall = this.noofcall * (this.callCharges * this.discount);        // 25 * 0.4

            else if (this.noofcall > this.freeCalls)                       //225
            {
                this.noofcall = this.noofcall - this.freeCalls;                   //150
                this.amountcall = this.freeCalls * (this.callCharges * this.discount);                     //75* 0.40
                if (this.noofcall > 0)                          //150
                    this.amountcall = this.amountcall + (this.noofcall * this.callCharges);    //150 *

            }

        }

    }

}

public class MobileBill {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Plan p = new Plan();

        System.out.print("1. Plan - A\n2.Plan - B\n3.Plan - C\nSelect your Plan: ");
        int choice = sc.nextInt();

        System.out.print("Enter No of calls done: ");
        p.noofcall = sc.nextInt();

        System.out.print("Enter no of sms: ");
        p.noofsms = sc.nextInt();

        p.acceptdata(choice);


        System.out.println("Call Amount : " + p.amountcall);
        // SMS Charges
        p.amountsms = p.noofsms * p.smsCharges;
        System.out.println("SMS Amount: " + p.amountsms);

        p.amount = ((p.amountcall + p.amountsms) + p.monthlyCharges);

        p.amount = p.amount + (p.amount * 0.125);

        System.out.println("Total Bill Amount : " + p.amount);
        System.out.println(p.toString());
    }
}
