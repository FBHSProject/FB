package chejian;

import java.util.ArrayList;

public class Sale{
	public enum color{
		GREEN,
		YELLOW,
		RED
	}
//inner helper class to handel sale order
public class SaleOrder {
	String client;
	String model;
	Date due;
	double expectAmount;
	Date expectFinish;	
	color color;
	public SaleOrder(String client, String model, Date due, double expectAmount, color color) {
		setFactory(client);
		setModel(model);
		setDue(due);
		setExpectAmount(expectAmount);
	}

	/**
	 * @return the factory
	 */
	public String getFactory() {
		return client;
	}

	/**
	 * @param factory the factory to set
	 */
	public void setFactory(String factory) {
		this.client = factory;
	}
	/**
	 * @param color 
	 */
	public void setColor(color color) {
		this.color = color;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the due
	 */
	public Date getDue() {
		return due;
	}

	/**
	 * @param due the due to set
	 */
	public void setDue(Date due) {
		this.due = due;
	}

	/**
	 * @return the expectAmount
	 */
	public double getExpectAmount() {
		return expectAmount;
	}

	/**
	 * @param expectAmount the expectAmount to set
	 */
	public void setExpectAmount(double expectAmount) {
		this.expectAmount = expectAmount;
	}

	/**
	 * @return the expectFinish
	 */
	public Date getExpectFinish() {
		return expectFinish;
	}

	/**
	 * @param expectFinish the expectFinish to set
	 */
	public void setExpectFinish(Date expectFinish) {
		this.expectFinish = expectFinish;
	}
}
	ArrayList<SaleOrder> orderList = new ArrayList<SaleOrder>();
	
	void AddSaleOrder(SaleOrder order){
		orderList.add(order);
	}
}