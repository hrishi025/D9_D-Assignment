package ass3.question.no10;

import java.util.Scanner;

class SalesCommission {
	 
	 private static  double basePay = 200.0;
	 private static  double commissionPercentage = 0.09;

	 private double total;

	 // Constructor
	 public SalesCommission(double total) {
		this.total = total;
	}

	public SalesCommission() {
		// TODO Auto-generated constructor stub
	}

	public void enterItem(int x){
	        switch(x){
	            case 1:
	                total += 239.99;
	                break;
	            case 2:
	                total += 129.75;
	                break;
	            case 3:
	                total += 99.95;
	                break;
	            case 4:
	                total += 350.89;
	                break;
	            default:
	                break;
	        }
	    }
	
	public double getSalesTotal(){
        return total;
    }
    public double calculateCommission(){
        return basePay + total * commissionPercentage;
    }
}



public class SalesCommissionCalculator {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        SalesCommission salesCal = new SalesCommission();

	        int choice = 0;

	        while(choice != 5){
	            System.out.print("\nEnter the Option of the item sold \n\n1 for Item1 - 239.99\n2 for Item2- 129.75\n3 for Item3- 99.95\n4 for Item  4- 350.89 "
	            		+ "\n\n5 total Calculation\n\nEnter Your Choice :  ");
	            choice = sc.nextInt();

	            
	            
	            
	            
	            salesCal.enterItem(choice);
	        }

	        if(salesCal.getSalesTotal() > 0){
	            System.out.print("\nWEEKLY COMMISSION\n");
	            System.out.println("Weekly sales total: " +  salesCal.getSalesTotal());
	            System.out.println("Weekly earnings: " +  salesCal.calculateCommission());

	        }
		

	}

}
