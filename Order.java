import java.util.ArrayList;

public class Order {
    public String name;
    public boolean ready;
    public ArrayList<Item>items = new ArrayList<Item>();
    public double total = 0;
}