package ass3.question.no9;

import java.util.Scanner;

class CreditLimit {

	 private String accountNumber;
	 private double balanceAtTheBeginingOfMonth;
	 private double balanceAtTheEndOfMonth;
	 private double chargedItemTotal;
	 private double appliedCreditsTotal;
	 private double allowedCreditLimit;
	 private double newBalance;  // == beginning balance+ charges – credits

	// Default Constructor
	public CreditLimit() {
	}

	 // Constructor
	public CreditLimit(String accountNumber, double balanceAtTheBeginingOfMonth, double balanceAtTheEndOfMonth,
			double chargedItemTotal, double appliedCreditsTotal, double allowedCreditLimit, double newBalance) {
		this.accountNumber = accountNumber;
		this.balanceAtTheBeginingOfMonth = balanceAtTheBeginingOfMonth;
		this.balanceAtTheEndOfMonth = balanceAtTheEndOfMonth;
		this.chargedItemTotal = chargedItemTotal;
		this.appliedCreditsTotal = appliedCreditsTotal;
		this.allowedCreditLimit = allowedCreditLimit;
		this.newBalance = newBalance;
	}

	// Getter Setter Methods
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalanceAtTheBeginingOfMonth() {
		return balanceAtTheBeginingOfMonth;
	}

	public void setBalanceAtTheBeginingOfMonth(double balanceAtTheBeginingOfMonth) {
		this.balanceAtTheBeginingOfMonth = balanceAtTheBeginingOfMonth;
	}

	public double getBalanceAtTheEndOfMonth() {
		return balanceAtTheEndOfMonth;
	}

	public void setBalanceAtTheEndOfMonth(double balanceAtTheEndOfMonth) {
		this.balanceAtTheEndOfMonth = balanceAtTheEndOfMonth;
	}

	public double getChargedItemTotal() {
		return chargedItemTotal;
	}

	public void setChargedItemTotal(double chargedItemTotal) {
		this.chargedItemTotal = chargedItemTotal;
	}

	public double getAppliedCreditsTotal() {
		return appliedCreditsTotal;
	}

	public void setAppliedCreditsTotal(double appliedCreditsTotal) {
		this.appliedCreditsTotal = appliedCreditsTotal;
	}

	public double getAllowedCreditLimit() {
		return allowedCreditLimit;
	}

	public void setAllowedCreditLimit(double allowedCreditLimit) {
		this.allowedCreditLimit = allowedCreditLimit;
	}

	public double getNewBalance() {
		return newBalance;
	}

	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}
	 
}

 
  public class CreditLimitCalculator {
	 
	  public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  
		  CreditLimit l = new CreditLimit();
		  
		  System.out.print(" Enter Account Number : ");
		  l.setAccountNumber(sc.nextLine());
		  		  
		  System.out.print(" Enter Balance At The Begining Of Month : ");
		  l.setBalanceAtTheBeginingOfMonth(sc.nextDouble());
		  
		  System.out.print("Enter Total of All Items charged By the Customer This Month : ");
		  l.setChargedItemTotal(sc.nextDouble());
		  
		  System.out.print("Enter Total of All Credits Applied to the Customer’s Account This Month : ");
		  l.setAppliedCreditsTotal(sc.nextDouble());
		  
		  System.out.print("Enter Allowed Credit Limit : ");
		  l.setAllowedCreditLimit(sc.nextDouble());
		  
		  l.setNewBalance(l.getBalanceAtTheBeginingOfMonth() + l.getChargedItemTotal() - l.getAppliedCreditsTotal());
		  l.setBalanceAtTheEndOfMonth(l.getNewBalance());
		  
		  System.out.println();
		  
		  System.out.println("Account Number : " + l.getAccountNumber());
		  System.out.println("Balance At The Begining Of Month : " + l.getBalanceAtTheBeginingOfMonth());
		  System.out.println("Total of All Items charged By the Customer This Month :" + l.getChargedItemTotal());
		  System.out.println("Total of All Credits Applied to the Customer’s Account This Month : " + l.getAppliedCreditsTotal());
		  System.out.println("Allowed Credit Limit : " + l.getAllowedCreditLimit());
		  System.out.println("Balance At The End Of Month : " + l.getBalanceAtTheEndOfMonth());
		  System.out.println("New Balance : " + l.getNewBalance());
		  
		  if(l.getNewBalance() > l.getAllowedCreditLimit())
			  System.out.println("Credit limit exceeded");
		  
		  
	}
	  
 }