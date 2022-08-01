import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        // Creating 4 items and instantiating them as an object.
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.name = "mocha";
        item1.price = 1.0;
        item2.name = "latte";
        item2.price = 1.5;
        item3.name = "drip coffee";
        item3.price = 2.0;
        item4.name = "capuccino";
        item4.price = 2.5;

        // Creating 4 orders and instantiating them as an object.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";


        // calling all member variables.before initializing any of them
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: $%s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        // add item1 to order2's item list and incrememnt the order's total.
        order2.items.add(item1);

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: $%s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

    }
}
