package chejian;

import java.util.ArrayList;

public class Line {
	
	ArrayList<Order> array = new ArrayList<Order>();
	public Line(ArrayList<Order> array) {
		this.array = array;
	}
	
	public void addOrder(Order neworder) {
		array.add(neworder);
	}
}
