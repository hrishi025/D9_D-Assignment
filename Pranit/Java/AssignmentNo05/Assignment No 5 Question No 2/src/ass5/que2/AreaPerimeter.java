package ass5.que2;

public class AreaPerimeter {
    private double area;
    private double perimeter;

    //Default Constructor
    public AreaPerimeter() {
        this.area = 0.0;
        this.perimeter = 0.0;
    }

    //Parameterised Constructor
    public AreaPerimeter(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    //Setter
    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    //Getter
    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
