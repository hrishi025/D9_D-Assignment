package ass5.que2;

import java.util.Scanner;

public class Triangle {
    static AreaPerimeter apt = new AreaPerimeter();
    static Scanner sc = new Scanner(System.in);
    private double base;
    private double height;
    private double side1;
    private double side2;

    //Parameterised Constructor
    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    //Default Constructor
    public Triangle() {
        this.base = 0;
        this.height = 0;
        this.side1 = 0;
        this.side2 = 0;
    }

    //Setter
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.base = height;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side1 = side2;
    }

    //Getters
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    //Accept Data
    public void acceptData() {
        System.out.print("Enter Base Value: ");
        this.base = sc.nextDouble();
        System.out.print("Enter Height Value: ");
        this.height = sc.nextDouble();
        System.out.print("Enter Side 1 Value: ");
        this.side1 = sc.nextDouble();
        System.out.print("Enter Side 2 Value: ");
        this.side2 = sc.nextDouble();
    }

    //Set Area
    public void setArea() {
        apt.setArea((this.base * this.height) /2 );
    }

    //Set Perimeter
    public void setPerimeter() {
        apt.setPerimeter(this.base + this.side1 + this.side2);
    }

    //Display Data
    public void displayData() {
        System.out.println("Area Of Triangle is : " + apt.getArea());
        System.out.println("Perimeter Of Triangle is : " + apt.getPerimeter());
    }


}
