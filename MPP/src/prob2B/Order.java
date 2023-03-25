package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	private List<OrderLine> orderLine;
	public Order(int orderNum, int lineNumber, double unitPrice, int quantity) {
		this.orderNum = orderNum;
		this.orderLine = new ArrayList<OrderLine>();
		addOrderLine(lineNumber, unitPrice, quantity);
		
	}
	
	public void addOrderLine(int lineNumber, double unitPrice, int quantity) {
		this.orderLine.add(new OrderLine(this, lineNumber, unitPrice, quantity));
	}
	
	@Override
	public String toString() {
		String message = "Order Number # " + orderNum + "\n";
		for(OrderLine line : orderLine) {
			message += line.toString() + "\n";
		}
		
		return message;
	}
}
