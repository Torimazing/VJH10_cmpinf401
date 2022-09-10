package vjh10_Lab2;

import javax.swing.JOptionPane;

public class Problem2 {
	public static void main(String[] args) {
		String radius = JOptionPane.showInputDialog("Please input a radius");
		int numR = Integer.parseInt(radius);
		double area = (Math.PI * Math.pow(numR, 2));
		double perim = (Math.PI * 2 * numR);
		JOptionPane.showMessageDialog(null, "The circle with radius " + radius + 
				" has an area of " + area + " and a perimeter of " + perim);
	}

}
