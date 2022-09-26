import javax.swing.JOptionPane;

public class Logarithm {

	public static void main(String[] args) {
		
		//Establish Variables
		String numberInput;
		String baseInput;
		float number;
		int base;
		
		//Validate Input
		boolean inputValid = false;
		do {
			numberInput = JOptionPane.showInputDialog("Please enter a number");
			baseInput = JOptionPane.showInputDialog("Please enter a base");
			number = Float.parseFloat(numberInput);
			base = Integer.parseInt(baseInput);
			if (number <= 0) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
				inputValid = false;
			}else if (base <= 1) {
				JOptionPane.showMessageDialog(null, "Please enter a valid base", "Error", JOptionPane.ERROR_MESSAGE);
				inputValid = false;
			}else {
				inputValid = true;
			}
		}
		while (inputValid == false);
		//Calculate Logarithms
		float remainder = number;
		int floorCount = 0;
		while (remainder >= base) {
			remainder = remainder/base;
			floorCount = floorCount + 1;
		}
		String message = "The floor of log " + number + " base " + base + " is " + floorCount;
		JOptionPane.showMessageDialog(null, message);

		
	}

}
