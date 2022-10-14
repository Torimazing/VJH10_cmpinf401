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
		this.entree = entree;
		this.side = side;
	}
	public Menu(String title, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	public int totalCalories() {
		int calories = entree.GetCal() + side.GetCal() + salad.GetCal() + dessert.GetCal();
		return calories;
	}
	public String description() {
		String menu = this.name + "\n";
		// Entree time
		menu = menu + "Entree: ";
		if (entree == null) {
			menu = menu + "N/A \n";
		}else {
			menu = menu + entree.GetName() + "- " + entree.GetDesc() + '\n';
		}
		//Side
		menu = menu + "Side: ";
		if (side == null) {
			menu = menu + "N/A \n";
		}else {
			menu = menu + side.GetName() + "- " + side.GetDesc() + '\n';
		}
		//Salad
		menu = menu + "Salad: ";
		if (salad == null) {
			menu = menu + "N/A \n";
		}else {
			menu = menu + salad.GetName() + "- " + salad.GetDesc() + '\n';
		}
		//Dessert
		menu = menu + "Dessert: ";
		if (dessert == null) {
			menu = menu + "N/A \n";
		}else {
			menu = menu + dessert.GetName() + "- " + dessert.GetDesc() + '\n';
		}
		return menu;
	}


}
