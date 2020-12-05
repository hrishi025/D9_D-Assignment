/*
package ass4.que8;

import java.util.Scanner;

public class ArithmaticFraction {
    private int numerator;
    private int denominator;

    static Scanner sc = new Scanner(System.in);

    public ArithmaticFraction(){

    }

    //Parameterized constructor that intialise numerator and denominator with reduce form
    public ArithmaticFraction(int numerator, int denominator) {

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


    public static void divide(ArithmaticFraction r1,ArithmaticFraction r2) {

        int num = (r1.numerator*r2.denominator);
        int denum = (r2.numerator*r2.denominator);

        ArithmaticFraction.printReducedForm(num, denum,"Division");
    }


    public static void multiplication(ArithmaticFraction r1,ArithmaticFraction r2) {

        int num = (r1.numerator*r2.numerator);
        int denum =(r1.denominator)*(r2.denominator);
        ArithmaticFraction.printReducedForm(num, denum,"Multiplication");
    }


    public static void add(ArithmaticFraction r1,ArithmaticFraction r2) {

        int num = (r1.numerator*r2.denominator)+(r2.numerator*r1.denominator);
        int denum = (r2.denominator*r2.denominator);

        ArithmaticFraction.printReducedForm(num, denum,"Addition");
    }

    public static void substract(ArithmaticFraction r1,ArithmaticFraction r2) {
        int num = (r1.numerator*r2.denominator)-(r2.numerator*r1.denominator);
        int denum = (r2.denominator*r2.denominator);

        ArithmaticFraction.printReducedForm(num, denum,"Substraction");
    }

    public static String numberRepresentation(ArithmaticFraction r1)
    {
        String returnString = null;

        returnString = r1.numerator+"/"+r1.denominator;

        return returnString;
    }

    public static String floatingPointRepresentation(ArithmaticFraction r1) {
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

}
*/
