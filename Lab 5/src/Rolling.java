import java.util.Random;
import javax.swing.JOptionPane;

public class Rolling {
	public static void main(String[] args) {
		Random newDice = new Random();
		String userInput = JOptionPane.showInputDialog("Please input a number of rolls");
		int roll = Integer.parseInt(userInput);
		RollDice(roll, newDice);
	}
	public static void RollDice(int numRoll, Random diceValue) {
		
		// Create Counts
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int num7 = 0;
		int num8 = 0;
		int num9 = 0;
		int num10 = 0;
		int num11 = 0;
		int num12 = 0;
		
		// Rolling 
		for (int count = 1; count <= numRoll; count++) {
			
			int rollValue = diceValue.nextInt(6) + 1 + diceValue.nextInt(6) + 1;
			
			if (rollValue == 2) {
				num2 = num2 + 1;
			}else if (rollValue == 3) {
				num3 = num3++;
			}else if (rollValue == 4) {
				num4 = num4++;
			}else if (rollValue == 5) {
				num5 = num5++;
			}else if (rollValue == 6) {
				num6 = num6 +1;
			}else if (rollValue == 7) {
				num7 = num7++;
			}else if (rollValue == 8) {
				num8 = num8++;
			}else if (rollValue == 9) {
				num9 = num9++;
			}else if (rollValue == 10) {
				num10 = num10 + 1;
			}else if (rollValue == 11) {
				num11 = num11++;
			}else if (rollValue == 12) {
				num12 = num12+1;
			}}
		
		float prob2 = num2/numRoll;
		float prob3 = num3/numRoll;
		float prob4 = num4/numRoll;
		float prob5 = num5/numRoll;
		float prob6 = num6/numRoll;
		float prob7 = num7/numRoll;
		float prob8 = num8/numRoll;
		float prob9 = num9/numRoll;
		float prob10 = num10/numRoll;
		float prob11 = num11/numRoll;
		float prob12 = num12/numRoll;
		
		String message = "2 = " + prob2 + "\n" + "3 = " + prob3 + "\n" + "4 = " + prob4 + "\n" + "5 = " + prob5
				+ "\n" + "6 = " + prob6 + "\n" + "7 = " + prob7 + "\n" + "8 = " + prob8 + "\n" + "9 = " + prob9 + "\n" 
				+ "10 = " + prob10 + "\n" + "11 = " + prob11 + "\n" + "12 = " + prob12;
		JOptionPane.showMessageDialog(null, message);
		
	}
}