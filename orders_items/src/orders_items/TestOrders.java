package orders_items;

import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        Item item1 = new Item();
        item1.name = "drip";
        item1.price = 2.00;
        
        Item item2 = new Item();
        item2.name = "mocha";
        item2.price = 3.50;
        
        Item item3 = new Item();
        item3.name = "frap";
        item3.price = 5.00;
        
        Item item4 = new Item();
        item4.name = "espresso";
        item4.price = 3.00;
        
        Order order1 = new Order();
        order1.name = "Cindhuri";
        
        Order order2 = new Order();
        order2.name = "Jimmy";
        
        Order order3 = new Order();
        order3.name = "Noah";
        
        Order order4 = new Order();
        order4.name = "Sam";
    
        order2.items.add(item1);
        order2.total += item1.price;
        
        order3.items.add(item3);
        order3.total += item3.price;
        
        order4.items.add(item4);
        order4.total += item4.price;
        
        order1.ready = true;
        
        order4.items.add(item3);
        order4.items.add(item3);
        order4.total += item3.price*2;
        
        order2.ready = true;
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}

