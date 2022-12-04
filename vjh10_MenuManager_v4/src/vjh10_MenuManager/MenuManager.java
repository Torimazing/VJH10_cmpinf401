package vjh10_MenuManager;

import java.util.ArrayList;
import java.util.Random;

public class MenuManager {

	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();
	
	public MenuManager(String fileName) {
		ArrayList<MenuItem> items = FileManager.readItems(fileName);
		
		for (MenuItem item : items) {
			if (item.getClass().getName() == "vjh10_MenuManager.Entree") {
				entrees.add((Entree) item);
			}else if (item.getClass().getName() == "vjh10_MenuManager.Side") {
				sides.add((Side) item);
			}else if (item.getClass().getName() == "vjh10_MenuManager.Salad") {
				salads.add((Salad) item);
			}else if (item.getClass().getName() == "vjh10_MenuManager.Dessert") {
				desserts.add((Dessert) item);
			}
		}

	}
	
	public Menu randomMenu(String name) {
		
		Random rand = new Random();
		int randNum = rand.nextInt(entrees.size());
		Entree menuEntree = entrees.get(randNum);
		randNum = rand.nextInt(sides.size());
		Side menuSide = sides.get(randNum);
		randNum = rand.nextInt(salads.size());
		Salad menuSalad = salads.get(randNum);
		randNum = rand.nextInt(desserts.size());
		Dessert menuDessert = desserts.get(randNum);
		Menu menu = new Menu(name, menuEntree, menuSide, menuSalad, menuDessert);
		
		return menu;
		
	}
	
	public Menu minCaloriesMenu(String name) {
		Entree minEnt =  entrees.get(0);
		for (Entree item : entrees) {
			if (item.getCal() < minEnt.getCal()) {
				minEnt = item;
			}
		}
		Side minSide = sides.get(0);
		for (Side item : sides) {
			if (item.getCal() < minSide.getCal()) {
				minSide = item;
			}
		}
		Salad minSal = salads.get(0);
		for (Salad item : salads) {
			if (item.getCal() < minSal.getCal()) {
				minSal = item;
			}
		}
		Dessert minDes = desserts.get(0);
		for (Dessert item : desserts) {
			if (item.getCal() < minDes.getCal()) {
				minDes = item;
			}
		}
		
		Menu menu = new Menu(name, minEnt, minSide, minSal, minDes);
		
		return menu;
	}

	public Menu maxCaloriesMenu(String name) {
		Entree minEnt =  entrees.get(0);
		for (Entree item : entrees) {
			if (item.getCal() > minEnt.getCal()) {
				minEnt = item;
			}
		}
		Side minSide = sides.get(0);
		for (Side item : sides) {
			if (item.getCal() > minSide.getCal()) {
				minSide = item;
			}
		}
		Salad minSal = salads.get(0);
		for (Salad item : salads) {
			if (item.getCal() > minSal.getCal()) {
				minSal = item;
			}
		}
		Dessert minDes = desserts.get(0);
		for (Dessert item : desserts) {
			if (item.getCal() > minDes.getCal()) {
				minDes = item;
			}
		}
		
		Menu menu = new Menu(name, minEnt, minSide, minSal, minDes);
		
		return menu;
	}
	
	public static void main(String[] args) {
		
		MenuManager mm = new MenuManager("data/dishes.txt");
		Menu min =  mm.minCaloriesMenu("Min");
		Menu max =  mm.maxCaloriesMenu("Max");
		
		System.out.println(min.description());
		System.out.println(max.description());
		}

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}

	}
	

