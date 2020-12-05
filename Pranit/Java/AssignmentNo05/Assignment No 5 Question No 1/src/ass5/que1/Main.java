package ass5.que1;

import java.util.Scanner;

public class Main {
   /* static Scanner sc = new Scanner(System.in);*/

    static  Person person = new Person();
  /*  Date date = new Date();
    Address address = new Address();*/

    public static void main(String[] args) {
        //Main main = new Main();
        person.acceptData();
        person.displayData();

    }


/*    private void acceptData() {

        System.out.print("Enter name : ");
        person.setName(sc.nextLine());
        System.out.print("Enter Age : ");
        person.setAge(sc.nextInt());

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

    private void displayData() {
        System.out.println("\n\nName : " + person.getName());
        System.out.println("Age : " + person.getAge());
        System.out.println("\nDate of Birth : " + date.getDay() + " / " + date.getMonth() + " / " + date.getYear());
        System.out.println("\nAddress :- \nCiti Name:  " + address.getCityName() + "\nState Name : " + address.getStateName() + "\nPin : " + address.getPin());*//*
    }*/
}
