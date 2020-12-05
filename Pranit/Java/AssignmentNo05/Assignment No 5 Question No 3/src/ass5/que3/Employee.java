package ass5.que3;

import java.util.Scanner;

abstract class Employee {
    static Scanner sc = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Default Constructor
    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.socialSecurityNumber = "";
    }

    // Parameterised Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Getter And Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Accept Data
    protected void acceptData() {
        System.out.print("Enter First Name : ");
        this.setFirstName(sc.nextLine());
        System.out.print("Enter Last Name : ");
        this.setLastName(sc.nextLine());
        System.out.print("Enter Social Security Number : ");
        this.setSocialSecurityNumber(sc.nextLine());
    }

    //Display Data
    protected void displayData() {
        System.out.println("Name : " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Social Security Number : " + this.getSocialSecurityNumber());
    }
}


