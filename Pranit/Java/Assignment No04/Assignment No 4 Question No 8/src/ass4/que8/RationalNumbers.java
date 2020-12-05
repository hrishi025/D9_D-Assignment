package ass4.que8;


import java.util.Scanner;

public class RationalNumbers {

    private int numerator;
    private int denominator;

    static Scanner sc = new Scanner(System.in);

    public RationalNumbers(){

    }

    //Parameterized constructor that intialise numerator and denominator with reduce form
    public RationalNumbers(int numerator, int denominator) {

        int count = 2;
        while(numerator>count) {
            if( (numerator%count) == 0 && (denominator%count)==0) {
                numerator=(numerator/count);
                denominator=(denominator/count);
            }
            count++;
        }
        if(denominator%numerator==0) {
            denominator= denominator/numerator;
            numerator= 1;
        }

        System.out.println("num : "+numerator);
        System.out.println("denum : " +denominator);

        this.numerator = numerator;
        this.denominator = denominator;

    }

    //method to convert rational number into reduce form
    public void reduceNumDeno()
    {

        int count = 2;
        while(numerator>count) {
            if( (numerator%count) == 0 && (denominator%count)==0) {
                numerator=(numerator/count);
                denominator=(denominator/count);
            }
            count++;
        }
        if(denominator%numerator==0) {
            denominator= denominator/numerator;
            numerator= 1;
        }

        System.out.println(numerator+"/"+denominator);

    }

    //method to print result in reduced form
    public static void printReducedForm(int num,int denum,String operation) {

        if(num==0) {
            denum =0;
        }

        if(num!=0) {
            int count = 2;
            while(num>count) {
                if( (num%count) == 0 && (denum%count)==0) {
                    num=(num/count);
                    denum=(denum/count);
                }
                count++;
            }
            if(denum%num==0) {
                denum = denum/num;
                num = 1;
            }
        }
        // System.out.println(operation+ " is "+ " numerator : "+num +" dennominator :"+denum);
        System.out.println(operation+ " is "+ num+"/"+denum);
    }


    public static void divide(RationalNumbers r1,RationalNumbers r2) {

        int num = (r1.numerator*r2.denominator);
        int denum = (r2.numerator*r2.denominator);

        RationalNumbers.printReducedForm(num, denum,"Division");
    }


    public static void multiplication(RationalNumbers r1,RationalNumbers r2) {

        int num = (r1.numerator*r2.numerator);
        int denum =(r1.denominator)*(r2.denominator);
        RationalNumbers.printReducedForm(num, denum,"Multiplication");
    }


    public static void add(RationalNumbers r1,RationalNumbers r2) {

        int num = (r1.numerator*r2.denominator)+(r2.numerator*r1.denominator);
        int denum = (r2.denominator*r2.denominator);

        RationalNumbers.printReducedForm(num, denum,"Addition");
    }

    public static void substract(RationalNumbers r1,RationalNumbers r2) {
        int num = (r1.numerator*r2.denominator)-(r2.numerator*r1.denominator);
        int denum = (r2.denominator*r2.denominator);

        RationalNumbers.printReducedForm(num, denum,"Substraction");
    }

    public static String numberRepresentation(RationalNumbers r1)
    {
        String returnString = null;

        returnString = r1.numerator+"/"+r1.denominator;

        return returnString;
    }

    public static String floatingPointRepresentation(RationalNumbers r1) {
        String returnString = null;

        double temp = (r1.numerator/r1.denominator);
        temp = Math.abs(temp);

        returnString = (String)(""+ String.format("%.10f", temp));

        return returnString;
    }

    public void readInput(String number) {
        System.out.println("Enter The Numerator of a "+number +" number");
        this.numerator = sc.nextInt();
        System.out.println("Enter the Denominator of a "+number+" number");
        this.denominator = sc.nextInt();
        // this.reduceNumDeno();

    }

    //method to show menu
    public static int menuList() {
        int choice;
        System.out.println("Press for following :     ");
        System.out.println("1.for Addition");
        System.out.println("2.for Substraction");
        System.out.println("3.for Multiplication");
        System.out.println("4.for Division");
        System.out.println("5.for String Represntation of rational number i.e a/b");
        System.out.println("6.for String Represntation of rational number in floating-point format.");
        choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int choice;


        RationalNumbers r1 = new RationalNumbers();
        RationalNumbers r2 = new RationalNumbers();

        while( ( choice = menuList() )!=0) {

            switch(choice) {

                case 1:
                    r1.readInput("First");
                    r2.readInput("Second");
                    add(r1, r2);
                    break;
                case 2 :
                    r1.readInput("First");
                    r2.readInput("Second");
                    substract(r1, r2);
                    break;
                case 3 :
                    r1.readInput("First");
                    r2.readInput("Second");
                    multiplication(r1, r2);
                    break;
                case 4:
                    r1.readInput("First");
                    r2.readInput("Second");
                    divide(r1, r2);
                    break;
                case 5:
                    r1.readInput("");
                    System.out.println("String Representation : "+numberRepresentation(r1));
                case 6:
                    r1.readInput("");
                    System.out.println("String Representation in floating-point format : "+floatingPointRepresentation(r1));
            }

        }


    }

}
