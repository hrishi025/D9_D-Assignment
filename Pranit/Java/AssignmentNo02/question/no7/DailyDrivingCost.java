package question.no7;

import java.util.Scanner;

/*	7. Create an application that calculates your daily driving cost, so that you can estimate how much money could be saved by 
 	car pooling, which also has other advantages such as reducing carbon emissions and reducing traffic congestion. 
 	The application should input the following information and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.

*/

public class DailyDrivingCost {

	public static void main(String[] args) {

		 double dailyDrivingCost, totalMiles, gasolineCost, avegrageMiles, parkingFees, tollFees;
		
		Scanner input = new Scanner(System.in);
				
		System.out.print ("Enter Total Miles Driven Per Day: ");
        totalMiles = input.nextInt();
        System.out.print ("Enter Cost Per Gallon Of Gasoline: ");
        gasolineCost = input.nextInt();
        System.out.print ("Enter Average Miles Per Gallon: ");
        avegrageMiles = input.nextInt();
        System.out.print ("Enter Parking Fees Per Day: ");
        parkingFees = input.nextInt();
        System.out.print ("Enter Tolls Per Day: ");
        tollFees = input.nextInt();
         
        dailyDrivingCost = (totalMiles / avegrageMiles) * gasolineCost + parkingFees + tollFees;
         
        System.out.println("\n");
        System.out.printf ("Your Daily Driving Cost Is: " +  dailyDrivingCost);
 

	}

}
