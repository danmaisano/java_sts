package orders_items;

import java.text.DecimalFormat;
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    	DecimalFormat decimalFormat = new DecimalFormat("#.00");
    	
    	Item item1 = new Item("Drip Coffee", 2.00);
    	Item item2 = new Item("Mocha", 4.00);
    	Item item3 = new Item("Frap", 5.00);
    	Item item4 = new Item("Espresso", 2.50);
       
    	Order order1 = new Order();
    	Order order2 = new Order();
    	
    	Order order3 = new Order("Dan");
    	Order order4 = new Order("Lana");
    	Order order5 = new Order("Sterling");
    	
    	order1.AddItem(item1);
    	order1.AddItem(item1);
    	order2.AddItem(item3);
    	order2.AddItem(item4);
    	order3.AddItem(item1);
    	order3.AddItem(item2);
    	order3.getStatusMessage();
    	order3.getOrderTotal();
    	
    	order4.AddItem(item3);
    	order4.AddItem(item2);
    	order5.AddItem(item2);
    	order5.AddItem(item4);
    	order5.setReady(true);
    	System.out.println(order5.getStatusMessage());
    	System.out.println("$" + decimalFormat.format(order4.getOrderTotal()));
    	
    	order1.display();
    	order2.display();
    	order3.display();
    	order4.display();
    	order5.display();
    }
}

