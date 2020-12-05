package question.no8;
import java.util.Scanner;

public class WorldPopulationGrowthCalc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long population;
        double growthRate;

        System.out.print("Enter current world population: ");
        population = sc.nextLong();

        System.out.print("Enter annual world population growth rate: ");
        growthRate = sc.nextDouble();

        // print growth rate
        for(int i=1; i<6; i++){
        	population *= growthRate;
            System.out.printf(i + " years = " + population);
            System.out.println("\n");
        }
    }
}