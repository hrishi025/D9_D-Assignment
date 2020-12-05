package ass3.question.no5;

import java.util.Scanner;

public class FixedDeposit {

	private int principleDepositAmount;
	private double timePeriod; // in years
	private double rateOfIntrest;
	private double compoundIntrest;
	private double totalAmount; // ==> principleDepositAmount + compoundIntrest

	// Constructor
	public FixedDeposit(int principleDepositAmount, int timePeriod, float rateOfIntrest, double compoundIntrest,
			double totalAmount) {
		super();
		this.principleDepositAmount = principleDepositAmount;
		this.timePeriod = timePeriod;
		this.rateOfIntrest = rateOfIntrest;
		this.compoundIntrest = compoundIntrest;
		this.totalAmount = totalAmount;
	}

	public FixedDeposit() {
		// TODO Auto-generated constructor stub
	}

	// Getter and Setter Methods
	public int getPrincipleDepositAmount() {
		return principleDepositAmount;
	}

	public void setPrincipleDepositAmount(int principleDepositAmount) {
		this.principleDepositAmount = principleDepositAmount;
	}

	public double getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(float timePeriod) {
		this.timePeriod = timePeriod;
	}

	public double getRateOfIntrest() {
		return rateOfIntrest;
	}

	public void setRateOfIntrest(float rateOfIntrest) {
		this.rateOfIntrest = rateOfIntrest;
	}

	public double getCompoundIntrest() {
		return compoundIntrest;
	}

	public void setCompoundIntrest(double compoundIntrest) {
		this.compoundIntrest = compoundIntrest;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	// Main Method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FixedDeposit fd = new FixedDeposit();

		System.out.print("Enter Principal Amount to be Deposited : ");
		fd.setPrincipleDepositAmount(sc.nextInt());

		System.out.print("Enter Time Period in Years : ");
		fd.setTimePeriod(sc.nextFloat());

		if (fd.getPrincipleDepositAmount() < 2000)
			fd.setRateOfIntrest(5);
		else if (fd.getPrincipleDepositAmount() > 2000 && fd.getPrincipleDepositAmount() < 6000 && fd.getTimePeriod ()> 2)
			fd.setRateOfIntrest(7);
		else if (fd.getPrincipleDepositAmount() > 6000 && fd.getTimePeriod() > 1)
			fd.setRateOfIntrest(8);
		else if (fd.timePeriod > 5)
			fd.setRateOfIntrest(10);
		else
			fd.setRateOfIntrest(3);
		
		fd.setCompoundIntrest(fd.getPrincipleDepositAmount() * (Math.pow((1 + fd.getRateOfIntrest()/100), fd.getTimePeriod()))); 
		
		fd.setTotalAmount(fd.getPrincipleDepositAmount() + fd.getCompoundIntrest());
		
		System.out.println("Annual Compount Intrest is :" + fd.getCompoundIntrest());
		System.out.println(" Money in the Customer's Account at the End of the " + fd.getTimePeriod() + " years is : " + fd.getTotalAmount());

	}
}
