package ass5.que2;

import java.util.Scanner;

public class Circle {
    static AreaPerimeter apc = new AreaPerimeter();
    static Scanner sc = new Scanner(System.in);

    private  double radius;

//Default Constructor
    public Circle() {
        this.radius = 0;
    }

    //Parameterised Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Getter
    public double getRadius() {
        return radius;
    }

    //Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Accept Data
    public void acceptData() {
        System.out.print("Enter Radius of Circle: ");
        this.radius = sc.nextDouble();
    }

    //Set Area
    public void setArea() {
        apc.setArea(Math.PI * this.radius * this.radius);
    }

    //Set Perimeter
    public void setPerimeter() {
        apc.setPerimeter(2 * Math.PI * this.radius);
    }

    //Display Data
    public void displayData() {
        System.out.println("Area Of Circle is : " + apc.getArea());
        System.out.println("Perimeter Of Circle is : " + apc.getPerimeter());
    }
}
