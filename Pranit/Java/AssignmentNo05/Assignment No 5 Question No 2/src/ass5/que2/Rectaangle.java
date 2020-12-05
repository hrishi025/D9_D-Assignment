package ass5.que2;

import java.util.Scanner;

public class Rectaangle {
    static AreaPerimeter apr = new AreaPerimeter();
    static Scanner sc = new Scanner(System.in);
    private double width;
    private double height;

    //Parameterised Constructor
    public Rectaangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Default Constructor
    public Rectaangle() {
        this.width = 0;
        this.height = 0;
    }

    //Setter
    public void setSide1(double width) {
        this.width = width;
    }

    public void setSide2(double height) {
        this.width = height;
    }

    //Getters
    public double getSide1() {
        return width;
    }

    public double getSide2() {
        return height;
    }

    //Accept Data
    public void acceptData() {
        System.out.print("Enter Width Value: ");
        this.width = sc.nextDouble();
        System.out.print("Enter Height Value: ");
        this.height = sc.nextDouble();
      }

    //Set Area
    public void setArea() {
        apr.setArea(this.width * this.height);
    }

    //Set Perimeter
    public void setPerimeter() {
        apr.setPerimeter(2 * (this.width + this.height));
    }

    //Display Data
    public void displayData() {
        System.out.println("Area Of Rectangle is : " + apr.getArea());
        System.out.println("Perimeter Of Rectangle is : " + apr.getPerimeter());
    }
}
