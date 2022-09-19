import javax.swing.JOptionPane;

public class UnitConverter {
	public static void main(String[] args) {
		String measure = "";
		String unit = "";
		String userInput;
		String workUnit = "";
		Float newNumber = null;
		String newUnit = "";
		//ensure input
		do{
			userInput = JOptionPane.showInputDialog("Please enter a number");
			measure = userInput.substring(0, userInput.indexOf(" "));
			unit = userInput.substring(userInput.indexOf(" ")+1, userInput.length());
		}while (measure == "" || unit == "");
		
		//cleanup input mostly derived from class examples
		float numMeas = Float.parseFloat(measure);
		for(int i=0;i<unit.length();i++){
			char a = unit.charAt(i);
			if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')){
				workUnit = workUnit + a;} 
		}
		workUnit = workUnit.toUpperCase();
		
		//evaluate variables
		if (workUnit == "CM") {
			newNumber = (float) (numMeas / 2.54);
			newUnit = "IN";
			System.out.print("Bitch");
		}else if (workUnit == "IN") {
			newNumber = (float) (numMeas * 2.54);
			newUnit = "CM";
		}else if (workUnit == "YD") {
			newNumber = (float) (numMeas / 1.09361);
			newUnit = "M";
		}else if (workUnit == "M") {
			newNumber = (float) (numMeas * 0.9144);
			newUnit = "YD";
		}else if (workUnit == "G" || workUnit == "GM") {
			newNumber = (float) (numMeas / 28.35);
			newUnit = "OZ";
		}else if (workUnit == "OZ") {
			newNumber = (float) (numMeas *0.035274);
			newUnit = "G";
		}else if (workUnit == "LB") {
			newNumber = (float) (numMeas / 2.20462);
			newUnit = "KG";
		}else if (workUnit == "KG") {
			newNumber = (float) (numMeas / 0.453592);
			newUnit = "LB";
		}
		else {
			JOptionPane.showMessageDialog(null, "Please enter a valid Unit Type", "Error", JOptionPane.ERROR_MESSAGE);
		}
		String message = numMeas+ " "+ workUnit + " is equal to "+ newNumber + " " + newUnit;
		JOptionPane.showMessageDialog(null, message);
	}
}
