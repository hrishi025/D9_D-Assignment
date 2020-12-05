package ass5.que2;

import java.util.Scanner;

public class Main {
   static Scanner sc  = new Scanner(System.in);
    static  Circle c = new Circle();
    static  Triangle t = new Triangle();
    static  Rectaangle r = new Rectaangle();
    static  int choice;
    public static void main(String[] args) {
        do {
            System.out.print("Enter Preference :\n1. Rectangel\n2. Circle\n3. Triangle\n      Your Choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    r.acceptData();
                    r.setArea();
                    r.setPerimeter();
                    r.displayData();
                    break;

                    case 2:
                        c.acceptData();
                        c.setArea();
                        c.setPerimeter();
                        c.displayData();
                        break;

                    case 3:
                        t.acceptData();
                        t.setArea();
                        t.setPerimeter();
                        t.displayData();
                        break;

                default:
                    break;
            }
        }while (choice != 0);
    }
}
