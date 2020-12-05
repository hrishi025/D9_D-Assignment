package ass5.que1;

import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    Date date = new Date();
    Address address = new Address();


    private  String name;
    private  int age;

    //Default Constructor
    public Person() {
        //this( "",  0 );
        this.name = "";
        this.age = 0;
    }
    //Parameterised Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   /* //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }*/

    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }





    public void acceptData() {

        System.out.print("Enter name : ");
        this.name = sc.nextLine();
        System.out.print("Enter Age : ");
        this.age = sc.nextInt();

        System.out.print("Enter Day Date of Birth : ");
        date.setDay(sc.nextInt());
        System.out.print("Enter Month Date of Birth : ");
        date.setMonth(sc.nextInt());
        System.out.print("Enter Year Date of Birth : ");
        date.setYear(sc.nextInt());

        sc.nextLine();
        System.out.print("Enter City Name : ");
        address.setCityName(sc.nextLine());
        System.out.print("Enter State Name : ");
        address.setStateName(sc.nextLine());
        System.out.print("Enter Pin : ");
        address.setPin(sc.nextLine());
    }

    public void displayData() {
        System.out.println("\n\nName : " + this.getName());
        System.out.println("Age : " + this.getAge());
        System.out.println("\nDate of Birth : " + date.getDay() + " / " + date.getMonth() + " / " + date.getYear());
        System.out.println("\nAddress :- \nCiti Name:  " + address.getCityName() + "\nState Name : " + address.getStateName() + "\nPin : " + address.getPin());
    }
}
