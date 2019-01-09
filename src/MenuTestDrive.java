/*Name: Thien Nguyen
* ID: 903324444*/

import java.util.*;

public class MenuTestDrive {
	/*Name: Thien Nguyen
	 * Pattern Assignment 3*/
	public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
 		StarbuzzMenu starbuzzMenu = new StarbuzzMenu(); //starbuzz coffee menu
		StarbuzzCondiments starbuzzCondiments = new StarbuzzCondiments(); //starbuzz condiments menu

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, starbuzzMenu, starbuzzCondiments);
 
		waitress.printMenu();
	}

	public static void printMenu() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		StarbuzzMenu starbuzzMenu = new StarbuzzMenu(); //starbuzz menu

		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
 
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}

		MenuItem[] lunchItems = dinerMenu.getMenuItems();
 
		for (int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}

		Hashtable starbuzzItems = starbuzzMenu.getMenuItems();
		Set<String> keys = starbuzzItems.keySet();
		for (String key: keys) {
			MenuItem menuItem = new MenuItem(key, "", true, (double)starbuzzItems.get(key));
		}
	}
}
