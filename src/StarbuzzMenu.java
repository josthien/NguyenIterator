import java.util.ArrayList;
import java.util.Hashtable;

public class StarbuzzMenu implements Menu {
    public static int MAX_ITEMS = 4;
    Hashtable starbuzzMenu;

    public StarbuzzMenu() {
        // Initializing menu
        starbuzzMenu = new Hashtable(MAX_ITEMS);

        //Add items to menu
        addItem("House Blend", "", true, 0.89);
        addItem("Dark Roast", "", true, 0.99);
        addItem("Decaf","", true, 1.05);
        addItem("Espresso", "", true, 1.99);

    }

    public void addItem(String name, String description, 
    		boolean isVegetarian, double price) {
        ArrayList items = new ArrayList();
        items.add(name);
        items.add(description);
        items.add(isVegetarian);
        items.add(price);
        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
        starbuzzMenu.put(name, menuItem);
    }

    public Hashtable getMenuItems() {
        return starbuzzMenu;
    }

    public Iterator createIterator() {
        return new StarbuzzMenuIterator(starbuzzMenu);
    }

//    public void addItem(String name, String description, boolean isVegetarian, double price)
//    {
//        ArrayList items = new ArrayList();
//        items.add(name);
//        items.add(description);
//        items.add(isVegetarian);
//        items.add(price);
//
//        MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
//        starbuzzMenu.put(name, menuItem);
//    }
}
