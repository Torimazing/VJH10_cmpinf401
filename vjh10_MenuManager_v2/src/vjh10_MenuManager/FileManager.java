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
	
	private static ArrayList<Entree> entreeList = new ArrayList<Entree>();
	private static ArrayList<Side> sideList = new ArrayList<Side>();
	private static ArrayList<Salad> saladList = new ArrayList<Salad>();
	private static ArrayList<Dessert> dessertList= new ArrayList<Dessert>();
	
	public static ArrayList<Dessert> readDesserts(String fileName) {
		try {
            FileReader fr = new FileReader(fileName); 
            BufferedReader br = new BufferedReader(fr); 
            String line = null;
            while ((line = br.readLine()) != null) {
            	int i = line.indexOf('@');
            	String name = line.substring(0, i);
            	int s = i+2;
            	i = line.indexOf('@', s);
            	String desc = line.substring(s, i);
            	s = i+2;
            	String calories = line.substring(s, line.length());
            	int cal = Integer.parseInt(calories);
            	Dessert dessert = new Dessert(name, desc, cal);
            	dessertList.add(dessert);
            }
            br.close();
            fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			}

		return dessertList;
	}

	public static ArrayList<Entree> readEntrees(String fileName) {
		try {
            FileReader fr = new FileReader(fileName); 
            BufferedReader br = new BufferedReader(fr); 
            String line = null;
            while ((line = br.readLine()) != null) {
            	int i = line.indexOf('@');
            	String name = line.substring(0, i);
            	int s = i+2;
            	i = line.indexOf('@', s);
            	String desc = line.substring(s, i);
            	s = i+2;
            	String calories = line.substring(s, line.length());
            	int cal = Integer.parseInt(calories);
            	Entree entree = new Entree(name, desc, cal);
            	entreeList.add(entree);
            }
            br.close();
            fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			}
		return entreeList;
	}
	
	public static ArrayList<Salad> readSalads(String fileName) {
		try {
            FileReader fr = new FileReader(fileName); 
            BufferedReader br = new BufferedReader(fr); 
            String line = null;
            while ((line = br.readLine()) != null) {
            	int i = line.indexOf('@');
            	String name = line.substring(0, i);
            	int s = i+2;
            	i = line.indexOf('@', s);
            	String desc = line.substring(s, i);
            	s = i+2;
            	String calories = line.substring(s, line.length());
            	int cal = Integer.parseInt(calories);
            	Salad salad = new Salad(name, desc, cal);
            	saladList.add(salad);
            }
            br.close();
            fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			}

		return saladList;
	}
	
	public static ArrayList<Side> readSides(String fileName) {
		try {
            FileReader fr = new FileReader(fileName); 
            BufferedReader br = new BufferedReader(fr); 
            String line = null;
            while ((line = br.readLine()) != null) {
            	int i = line.indexOf('@');
            	String name = line.substring(0, i);
            	int s = i+2;
            	i = line.indexOf('@', s);
            	String desc = line.substring(s, i);
            	s = i+2;
            	String calories = line.substring(s, line.length());
            	int cal = Integer.parseInt(calories);
            	Side side = new Side(name, desc, cal);
            	sideList.add(side);
            }
            br.close();
            fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			}

		return sideList;
	}
	

	public static ArrayList<Entree> getEntreeList() {
		return entreeList;
	}

	public static ArrayList<Side> getSideList() {
		return sideList;
	}

	public static ArrayList<Salad> getSaladList() {
		return saladList;
	}

	public static ArrayList<Dessert> getDessertList() {
		return dessertList;
	}

}
