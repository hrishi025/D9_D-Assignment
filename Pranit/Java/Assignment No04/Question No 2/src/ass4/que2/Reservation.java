package ass4.que2;

import java.util.Scanner;

public class Reservation {
    static int set1 = 0;
    static int set2 = 5;
    int p;
    static Scanner sc = new Scanner(System.in);
    boolean[] seat = {false, false, false, false, false, false, false, false, false, false};

    public void setSeat(int i) {
        if (this.seat[i] != true)
            this.seat[i] = true;
    }

    public void Class() {
        int choice;
        do {
            System.out.print("\nEnter Choice \n1. First Class\n2. Economy Class\n3. See Seat Status\n0. Exit\nYour Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (set1 < 5) {
                        this.setSeat(set1);
                        ++set1;
                        System.out.println(" Seat Number " + set1 + " Assigned in First Class ");
                    } else {
                        System.out.println("Seat Already Assigned\n Would You Like to get Seat In  Alternate Class\nPres 1 -> YES\nPress 2 -> No");
                        p = sc.nextInt();
                        if (p == 1) {
                            this.setSeat(set2);
                            System.out.println(" Seat Number " + (set2+1) + " Assigned in Economy Class ");
                        } else {
                            System.out.println("Next flight leaves in 3 hours\n");
                        }
                    }
                    break;

                case 2:
                    try {
                        if (set2 >= 5 && set2 <= 10) {
                            this.setSeat(set2);
                            ++set2;
                            System.out.println(" Seat Number " + set2 + " Assigned in Economy Class ");
                        }
                    } catch (Exception e) {
                        System.out.println("Seat Already Assigned\n Would You Like to get Seat In  Alternate Class\nPres 1 -> YES\nPress 2 -> No");
                        p = sc.nextInt();
                        if (p == 1) {
                            this.setSeat(set1);
                            System.out.println(" Seat Number " + (set1+1) + " Assigned in Economy Class ");
                        } else {
                            System.out.println("Next flight leaves in 3 hours\n");
                        }
                    }
                    break;
                case 3 :
                        displaySeat();

                default:
                    break;
            }
        } while (choice != 0);
    }

    public void displaySeat() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Seat No:   " + (i + 1) + "      " + seat[i]);
        }
    }
}

