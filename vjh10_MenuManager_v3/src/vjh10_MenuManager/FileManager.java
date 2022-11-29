package vjh10_MenuManager;

/**
 * Class FileManager
 * author : Tori (VJH10)
 * created: 12/3/2022
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
		
	public static ArrayList<Menu> writeMenus(String fileName, ArrayList<Menu> menus) {
		
		ArrayList<MenuItem> items = readItems(fileName);
		
		int entrees = 0;
		int sides = 0;
		int salads = 0;
		int desserts = 0;
		
		for (MenuItem item : items) {
			if (item.getClass().getName() == "vjh10_MenuManager.Entree") {
				menus.get(entrees).setEntree(item);
				entrees += 1;
			}
			if (item.getClass().getName() == "vjh10_MenuManager.Side") {
				menus.get(sides).setSide(item);
				sides += 1;
			}
			if (item.getClass().getName() == "vjh10_MenuManager.Salad") {
				menus.get(salads).setSalad(item);
				salads += 1;
			}
			if (item.getClass().getName() == "vjh10_MenuManager.Dessert") {
				menus.get(desserts).setDessert(item);
				desserts += 1;
			}
		}

		
		return menus;
	}
	
	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> menuItem = new ArrayList<MenuItem>();
		try {
            FileReader fr = new FileReader(fileName); 
            BufferedReader br = new BufferedReader(fr); 
            String line = null;
            while ((line = br.readLine()) != null) {
            	int i = line.indexOf('@');
            	String name = line.substring(0, i);
            	int s = i+2;
            	i = line.indexOf('@', s);
            	String type = line.substring(s, i);
            	s = i+2;
            	i = line.indexOf('@', s);
            	String desc = line.substring(s, i);
            	s = i+2;
            	i = line.indexOf('@', s);
            	String calories = line.substring(s, i);
            	int cal = Integer.parseInt(calories);
            	s = i+2;
            	i = line.indexOf('@', s);
            	String pri = line.substring(s, line.length());
            	double price = Double.parseDouble(pri);
            	if (type.equals("entree")) {
            		Entree entree = new Entree(name, desc, cal, price);
            		menuItem.add(entree);
            	}
            	if (type.equals("side")) {
            		Side side = new Side(name, desc, cal, price);
            		menuItem.add(side);
            	}
            	if (type.equals("salad")) {
            		Salad salad = new Salad(name, desc, cal, price);
            		menuItem.add(salad);
            	}
            	if (type.equals("dessert")) {
            		Dessert dessert = new Dessert(name, desc, cal, price);
            		menuItem.add(dessert);
            	}
            }
            br.close();
            fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			}

		return menuItem;
	}

	
}
