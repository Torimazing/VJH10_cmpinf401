package vjh10_MenuManager;

/**
 * Class MenuRandomize
 * author : Tori (VJH10)
 * created: 11/4/2022
 */

import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	
	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();
	
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
		
	}
	
	public Menu randomMenu() {
		Entree menuEntree;
		Side menuSide;
		Salad menuSalad;
		Dessert menuDessert;
		Random rand = new Random();
		
		int randEntree = rand.nextInt(entrees.size());
		menuEntree = entrees.get(randEntree);
		int randSide = rand.nextInt(sides.size());
		menuSide = sides.get(randSide);
		int randSalad = rand.nextInt(salads.size());
		menuSalad = salads.get(randSalad);
		int randDessert = rand.nextInt(desserts.size());
		menuDessert = desserts.get(randDessert);
		
		Menu menu = new Menu("Randomized Menu", menuEntree, menuSide, menuSalad, menuDessert);
		
		return menu;
		
	}
	

}
