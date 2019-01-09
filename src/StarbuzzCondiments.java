import java.util.ArrayList;
import java.util.Hashtable;

public class StarbuzzCondiments implements Menu{
    public static int MAX_ITEMS = 4;
    Hashtable starbuzzCondiments;

    public StarbuzzCondiments() {
        // Initializing menu
        starbuzzCondiments = new Hashtable(MAX_ITEMS);

        //Add items to menu
        addItem("Steamed Milk", "", true, 0.10);
        addItem("Mocha", "", true, 0.20);
        addItem("Soy","", true, 0.15);
        addItem("Whip", "", true, 0.10);
    }

    public void addItem(String name, String description, 
    		boolean isVegetarian, double price) {
        ArrayList items = new ArrayList();
        items.add(name);
        items.add(description);
        items.add(isVegetarian);
        items.add(price);
        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
        starbuzzCondiments.put(name, menuItem);
    }

    public Hashtable getMenuItems() {
        return starbuzzCondiments;
    }

    public Iterator createIterator() {
        return new StarbuzzCondimentsIterator(starbuzzCondiments);
    }
}
