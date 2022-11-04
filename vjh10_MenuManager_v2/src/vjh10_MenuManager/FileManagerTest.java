package vjh10_MenuManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManagerTest {

	public static void main(String[] args) {
		ArrayList<Entree> entree = new ArrayList<Entree>();
		entree = readEntrees("data/entree.txt");
		System.out.println(entree.toString());

	}
	
	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entreeList= new ArrayList<Entree>();
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


}
