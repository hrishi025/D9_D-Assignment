package ass4.que5;

import java.util.Scanner;

public class QueueSimulation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int arr[] = new int[5];
        int input;
        int rear = 0;
        int front = 0;

        do {
            System.out.println("\n\n0.Exit\n1.Enqueue\n2.Dequeue\n3.Peek");
            System.out.println("Enter operation to be performed: ");
            input = sc.nextInt();

            if (input == 1) {
                if (rear < arr.length) {
                    System.out.println("Enter Element: ");
                    arr[rear] = sc.nextInt();
                    System.out.println("\nElement " + arr[rear] + " inserted in Queue..!!!");
                    rear++;
                }
                else {
                    System.out.println("\nQueue Full..!!");
                }
            }

            if (input == 2) {
                if (front < rear){
                    System.out.println("\nElement " + arr[front] + " removed from Queue..!!!");
                    arr[front] = 0;
                    front++;
                    if (front == rear){
                        System.out.println("\nQueue Empty");
                        front = 0;
                        rear = 0;
                    }
                }
                else{
                    System.out.println("\nQueue Empty");
                }
            }

            if (input == 3) {
                if (front == rear){
                    System.out.println("\nQueue is Empty");
                }
                else {
                    System.out.println("\nFront Element in Queue: " + arr[front]);
                }
            }

            if (input == 4) {
                System.out.println("\nQueue Elements: ");
                if (front == rear){
                    System.out.println("\tQueue Empty");
                }
                for (int i = front; i < rear; i++) {
                    System.out.print(arr[i]+"   ");
                }
            }
        } while (input != 0);
    }
}


