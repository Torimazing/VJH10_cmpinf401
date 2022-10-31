import java.util.Arrays; //(used for testing from https://www.programiz.com/java-programming/examples/print-array)
import java.util.Random;

import javax.swing.JOptionPane;

public class ArrayEval {
	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("What size array would you like?");
		int arrLen = Integer.parseInt(userInput);
		double[] userArray = new double[arrLen];
		Random rand = new Random();
		for (int i=0; i<userArray.length; i++) {
			userArray[i] = rand.nextDouble();
		}
		// System.out.print(Arrays.toString(userArray));
		String outputAnalysis = "This Array's Stats are: \n" + "Minimum: " + min(userArray) + "\n"
				+ "Maximum: " + max(userArray)+ "\n" + "Total: " + sum(userArray) + "\n" + "Average: " + ave(userArray);
		JOptionPane.showMessageDialog(null, outputAnalysis);

	}
	public static double max(double [] data) {
		double a = data[0];
		for(int i=0; i<data.length;i++){
			double b = data[i];
			if(b>a) {
				a = b;
			}
		}
		return a;
	}
	
	public static double min(double [] data) {
		double a = data[0];
		for(int i=0; i<data.length;i++){
			double b = data[i];
			if (b<a) {
				a = b;
			}
		}
		return a;
	}
	
	public static double sum(double [] data) {
		double a = 0;
		for(int i=0; i<data.length;i++){
			double b = data[i];
			a += b;
		}
		return a;
	}
	
	public static double ave(double [] data) {
		double a = sum(data);
		double ave =  a/ data.length;
		return ave;
	}


}
