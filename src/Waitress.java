//package headfirst.iterator.dinermerger;
/*Name: Thien Nguyen
* ID: 903324444*/

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
 	StarbuzzMenu starbuzzMenu; //Starbuzz coffee menu
	StarbuzzCondiments starbuzzCondiments; //Starbuzz condiments menu

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu,
					StarbuzzMenu starbuzzMenu, StarbuzzCondiments starbuzzCondiments) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.starbuzzMenu = starbuzzMenu; //starbuzz coffee menu
		this.starbuzzCondiments = starbuzzCondiments; //starbuzz condiments menu
	}
 
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator starbuzzIterator = starbuzzMenu.createIterator(); //starbuzz coffee menu iterator
		Iterator starbuzzCondimentIterator = starbuzzCondiments.createIterator(); //starbuzz condiments menu iterator

		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);

		//printing starbuzz coffee menu
		System.out.println("\nSTARBUZZ MENU\nCOFFEES");
		printMenu(starbuzzIterator);

		//printing starbuzz condiments menu
		System.out.println("\nCONDIMENTS");
		printMenu(starbuzzCondimentIterator);
	}
 
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.printf("%.2f", menuItem.getPrice());

			if(menuItem.getDescription() != "") {
				System.out.print(" -- " + menuItem.getDescription());
			}

			System.out.println();
		}
	}
 
	public void printVegetarianMenu() {
		printVegetarianMenu(pancakeHouseMenu.createIterator());
		printVegetarianMenu(dinerMenu.createIterator());
	}
 
	public boolean isItemVegetarian(String name) {
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		if (isVegetarian(name, breakfastIterator)) {
			return true;
		}
		Iterator dinnerIterator = dinerMenu.createIterator();
		if (isVegetarian(name, dinnerIterator)) {
			return true;
		}
		return false;
	}


	private void printVegetarianMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			if (menuItem.isVegetarian()) {
				System.out.print(menuItem.getName());
				System.out.println("\t\t" + menuItem.getPrice());
				System.out.println("\t" + menuItem.getDescription());
			}
		}
	}

	private boolean isVegetarian(String name, Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}
}
