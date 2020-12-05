package ass5.que1;

public class Date {
    int day;
    int month;
    int year;

    //Default Constructor
    public Date() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    //Parameterised Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Setters
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //Getters
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
}
