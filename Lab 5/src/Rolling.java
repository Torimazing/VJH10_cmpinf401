import java.util.Random;
import javax.swing.JOptionPane;

public class Rolling {
	public static void main() {
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
				num2 = num2++;
			}else if (rollValue == 3) {
				num3 = num3++;
			}else if (rollValue == 4) {
				num4 = num4++;
			}else if (rollValue == 5) {
				num5 = num5++;
			}else if (rollValue == 6) {
				num6 = num6++;
			}else if (rollValue == 7) {
				num7 = num7++;
			}else if (rollValue == 8) {
				num8 = num8++;
			}else if (rollValue == 9) {
				num9 = num9++;
			}else if (rollValue == 10) {
				num10 = num10++;
			}else if (rollValue == 11) {
				num11 = num11++;
			}else if (rollValue == 12) {
				num12 = num12++;
			}
		}
		//Recall Info
		
	}
}