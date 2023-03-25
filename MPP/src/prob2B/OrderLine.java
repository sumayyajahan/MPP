package prob2B;

public class OrderLine {

	private Order order;
	private int lineNumber;
	private double unitPrice;
	private int quantity;
	
	OrderLine(Order order, int lineNumber, double unitPrice, int quantity) {
		this.order = order;
		this.lineNumber = lineNumber;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Line# " + lineNumber + "\nUnit Price: " + unitPrice + " X Quantity = " + unitPrice*quantity;
	}
}
