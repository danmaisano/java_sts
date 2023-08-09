package orders_items;

import java.util.ArrayList;
import java.text.DecimalFormat;


public class Order {
	private String name;
	private boolean ready;
	private ArrayList<Item> items = new ArrayList<Item>();
	DecimalFormat decimalFormat = new DecimalFormat("#.00");

	
	public Order() {
		this.name = "Guest";
		this.items = new ArrayList<Item>();
	}
	
	public Order(String name) {
		this.name = name;
		this.items = new ArrayList<Item>();
//		this.ready = ready;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void AddItem(Item item) {
		items.add(item);
	}
	
	public String getStatusMessage() {
		if (this.ready) {
			return("Your order is ready");
		}
		else {
			return("Thank you for waiting, your order will be ready soon.");
		}
	}
	
	public Double getOrderTotal() {
		double sum = 0.00;
		for(Item item: items) {
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void display(){
		System.out.println("Customer Name: " + name);
		for (Item item: items) {
			System.out.println(item.getName() + " - $" +  decimalFormat.format(item.getPrice()));
		}
		System.out.println("Total : $" + decimalFormat.format(this.getOrderTotal()));
		System.out.println("-----------------");
	}
	
}
