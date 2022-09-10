package vjh10_Lab1;

import javax.swing.JOptionPane;

public class Problem1 {
	public static void main(String[] args) {
		String sideA = JOptionPane.showInputDialog("Please enter a number for Side A");
		String sideB = JOptionPane.showInputDialog("Please enter a number for Side B");
		
		int numA = Integer.parseInt(sideA);	
		int numB = Integer.parseInt(sideB);
		double sideC = Math.sqrt(Math.pow(numA, 2) + Math.pow(numB, 2));
		JOptionPane.showMessageDialog(null, "The Hypotenuse is " + sideC);	
	

	}
}
