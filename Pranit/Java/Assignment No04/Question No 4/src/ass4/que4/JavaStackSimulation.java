package ass4.que4;

import java.util.Scanner;

public class JavaStackSimulation {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int arr[] = new int[5];
        int input;
        int count = 0;

        do {
            System.out.println("\n\n0.Exit\n1.Push\n2.Pop\n3.Peek");
            System.out.println("Enter operation to be performed: ");
            input = sc.nextInt();

            if (input == 1) {
                if (count < arr.length) {
                    System.out.println("Enter Element: ");
                    arr[count] = sc.nextInt();
                    System.out.println("\nElement " + arr[count] + " inserted in stack..!!!");
                    count++;
                } else
                    System.out.println("\nStack Full..!!");
            }

            if (input == 2) {
                if (count != 0) {
                    count--;
                    System.out.println("\nElement " + arr[count] + " removed in stack..!!!");
                    arr[count] = 0;
                } else {
                    System.out.println("\nStack Empty");
                }
            }

            if (input == 3) {
                System.out.println("\nTopmost Element in Stack: " + arr[count - 1]);
            }

            if (input == 4) {
                int j = count - 1;
                System.out.println("\nStack Elements: ");
                for (int i = (arr.length - 1); i >= (arr.length - count); i--) {
                    System.out.println(arr[j]);
                    j--;
                }
            }
        } while (input != 0);
    }
}

