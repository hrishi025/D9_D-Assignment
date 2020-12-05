package ass3.question.no1;

import java.util.Scanner;

/*Q.1 Create a class called Invoice that a hardware store might 	use to represent an invoice for an item sold at the store. An
		Invoice should include four pieces of information as instance	variables—a part number (type String), a part description (type
		String), a quantity of the item being purchased (type int) and a		price per item (double). Your class should have a constructor
		that initializes the four instance variables. Provide a set and	a get method for each instance variable. In addition, provide a method named
		 getInvoiceAmount that calculates the invoice amount (i.e. multiplies the quantity by 	the price per item), then returns the amount as a double value.
		If the quantity is not positive, it should be set to 0. If the 	price per item is not positive, it should be set to	0.0.
		Write a test application named InvoiceTest that demonstrates	class Invoice’s capabilities.	*/

 class InvoiceTest {

	private String partNumber;
	private String partDesc;
	private int qty;
	private double price;
	private double invoiceAmount;

	// Constructor
	public InvoiceTest(String partNumber, String partDesc, int qty, double price) {
		super();
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		this.qty = qty;
		this.price = price;
	}

	public InvoiceTest() {
		// TODO Auto-generated constructor stub
	}

	// Getter and Setter Methods
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if (qty < 0)
			this.qty = 0;
		else		
			this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0)
			this.price = 0;
		else		
			this.price = price;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount() {
				
		this.invoiceAmount = this.qty * this. price;
	}

}

	class Invoice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		InvoiceTest i = new InvoiceTest();
		System.out.println("Enter Part No:  ");
		i.setPartNumber(sc.nextLine());
		System.out.println("Enter Part Description: ");
		i.setPartDesc(sc.nextLine());
		System.out.println("Enter Quantity: ");
		i.setQty(sc.nextInt());
		System.out.println("Enter Price: ");
		i.setPrice(sc.nextDouble());
		i.setInvoiceAmount();
		System.out.println("Part Number: " + i.getPartNumber()+"\nPart Description:	"+i.getPartDesc()+"\nPart Quantity:	"+i.getQty()+"	\nPart Price:	"+i.getPrice());
		System.out.println("Total Invoice Amount: " + i.getInvoiceAmount());
		

	}
}