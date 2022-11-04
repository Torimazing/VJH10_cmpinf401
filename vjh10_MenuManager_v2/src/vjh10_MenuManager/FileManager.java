package vjh10_MenuManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	public ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entreeList= new ArrayList<Entree>();
		try {
            FileReader fr = new FileReader(fileName); 
            BufferedReader br = new BufferedReader(fr); 
            String line = null;
            while ((line = br.readLine()) != null) {
            	int i = line.indexOf('@');
            	String name = line.substring(0, i);
            	int s = i+1;
            	i = line.indexOf('@', s);
            	String desc = line.substring(s, i);
            	s = i+1;
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
	
	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> sideList= new ArrayList<Side>();
		try {
            FileReader fr = new FileReader(fileName); 
            BufferedReader br = new BufferedReader(fr); 
            String line = null;
            while ((line = br.readLine()) != null) {
            	int i = line.indexOf('@');
            	String name = line.substring(0, i);
            	int s = i+1;
            	i = line.indexOf('@', s);
            	String desc = line.substring(s, i);
            	s = i+1;
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
	
	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> saladList= new ArrayList<Salad>();
		try {
            FileReader fr = new FileReader(fileName); 
            BufferedReader br = new BufferedReader(fr); 
            String line = null;
            while ((line = br.readLine()) != null) {
            	int i = line.indexOf('@');
            	String name = line.substring(0, i);
            	int s = i+1;
            	i = line.indexOf('@', s);
            	String desc = line.substring(s, i);
            	s = i+1;
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
	
	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> dessertList= new ArrayList<Dessert>();
		try {
            FileReader fr = new FileReader(fileName); 
            BufferedReader br = new BufferedReader(fr); 
            String line = null;
            while ((line = br.readLine()) != null) {
            	int i = line.indexOf('@');
            	String name = line.substring(0, i);
            	int s = i+1;
            	i = line.indexOf('@', s);
            	String desc = line.substring(s, i);
            	s = i+1;
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

}
