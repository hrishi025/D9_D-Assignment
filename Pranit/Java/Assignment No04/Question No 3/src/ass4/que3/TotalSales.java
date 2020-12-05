package ass4.que3;

import java.util.Scanner;

public class TotalSales {

    public static void print( int [] [] arr){
        int col, row, sum = 0;
        System.out.println("                          S1     S2      S3     S4      Product Total ");
        for ( col = 0; col < arr.length; col++ ){
            System.out.print("P"+(col+1)+":                    ");
            for ( row = 0; row < arr [ col ].length; row++ ){
                System.out.print(arr[ col ] [ row ]+"    ");
                sum = sum + arr [ col ] [ row ];
            }
            System.out.println(sum);
            sum = 0;
        }
        System.out.print("Total Sale  ");
        sum = 0;
        for ( row = 0; row < 5; row++  ){
            for ( col = 0; col < 4; col++ ){
                sum = sum + arr  [ row ] [ col ];
            }
            System.out.print("     " + sum);
            sum = 0;
        }

    }

    public static void accept(int [] [] arr){
        Scanner sc = new Scanner(System.in);
        int col , row;
        do {
            System.out.println("-1 to exit");

            System.out.println("salesperson number (1 - 4): ");
            col = sc.nextInt();
            if (col != -1) {
                col = col - 1;

                System.out.println("product number (1 - 5): ");
                row = (sc.nextInt() - 1);

                System.out.println("total dollar value of that product sold that day: ");
                arr[row][col] = sc.nextInt();
            }
        }while ( col != -1);


        /*
        for ( col = 0; col < arr.length; col++ ){
            System.out.println("Salesperson "+(col+1)+": ");
            for ( row = 0; row < arr [ col ].length; row++ ){
                System.out.println("Enter Product "+(row+1)+" sales: ");
                arr[ col ] [ row ] = sc.nextInt();
            }
        }*/

    }

}
