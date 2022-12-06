package vjh10_MenuManager;
/**
 * Class Menu
 * author : Tori (VJH10)
 * created: 10/13/2022
 */
	
public class Menu {

	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;
	

	public Menu(String name) {
		this.name = name;
	}
	public Menu(String title, Entree entree, Side side) {
		this.name = title;
		this.entree = entree;
		this.side = side;
	}
	public Menu(String title, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = title;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	public Menu(String title, Entree entree) {
		this.name = title;
		this.entree = entree;
	}
	
	public String description() {
		String menu = this.name + "\n";
		// Entree time
		menu = menu + "Entree: ";
		if (entree == null) {
			menu = menu + "N/A \n";
		}else {
			menu = menu + entree.getName() + "- " + entree.getDesc() + '\n';
		}
		//Side
		menu = menu + "Side: ";
		if (side == null) {
			menu = menu + "N/A \n";
		}else {
			menu = menu + side.getName() + "- " + side.getDesc() + '\n';
		}
		//Salad
		menu = menu + "Salad: ";
		if (salad == null) {
			menu = menu + "N/A \n";
		}else {
			menu = menu + salad.getName() + "- " + salad.getDesc() + '\n';
		}
		//Dessert
		menu = menu + "Dessert: ";
		if (dessert == null) {
			menu = menu + "N/A \n";
		}else {
			menu = menu + dessert.getName() + "- " + dessert.getDesc() + '\n';
		}
		return menu;
	}
	public String toString() {
		String name = "Menu: " + this.name;
		return name;
	}
	public int totalCalories() {
		int calories = 0;
		if (!(entree == null)) {
			calories = calories + entree.getCal();
		}if (!(side == null)) {
			calories = calories + side.getCal();
		}if(!(salad == null)) {
			calories = calories + salad.getCal();
		}if(!(dessert == null)) {
			calories = calories + dessert.getCal();
		}
		return calories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entree getEntree() {
		return entree;
	}
	public void setEntree(MenuItem item) {
		this.entree = (Entree) item;
	}
	public Salad getSalad() {
		return salad;
	}
	public void setSalad(MenuItem item) {
		this.salad = (Salad) item;
	}
	public Side getSide() {
		return side;
	}
	public void setSide(MenuItem item) {
		this.side = (Side) item;
	}
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(MenuItem item) {
		this.dessert = (Dessert) item;
	}
	public double totalPrice() {
		double price = entree.getPrice();
		price += side.getPrice();
		price += salad.getPrice();
		price += dessert.getPrice();
		return price;
		}


}
