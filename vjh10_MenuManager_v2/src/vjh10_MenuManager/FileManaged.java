package vjh10_MenuManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManaged {
	private ArrayList<String> perks = new ArrayList<String>();
	private ArrayList<String> redFlag = new ArrayList<String>();
	
	FileManaged (String perks, String flag) {
		try { 
			FileReader fr = new FileReader(perks); 
	         BufferedReader br = new BufferedReader(fr); 
	         String line = null;
	         while ((line = br.readLine()) != null) {
	         	String thisLine = line;
	         	this.perks.add(thisLine);
         }
         br.close();
         fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			}
		try { 
			FileReader fr = new FileReader(flag); 
	         BufferedReader br = new BufferedReader(fr); 
	         String line = null;
	         while ((line = br.readLine()) != null) {
	         	String thisLine = line;
	         	this.redFlag.add(thisLine);
         }
         br.close();
         fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			}
	}
	


}
