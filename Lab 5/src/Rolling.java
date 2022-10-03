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
		Counters num2 = new Counters();
		Counters num3 = new Counters();
		Counters num4 = new Counters();
		Counters num5 = new Counters();
		Counters num6 = new Counters();
		Counters num7 = new Counters();
		Counters num8 = new Counters();
		Counters num9 = new Counters();
		Counters num10 = new Counters();
		Counters num11 = new Counters();
		Counters num12 = new Counters();
		
		// Rolling 
		for (int count = 1; count <= numRoll; count++) {
			
			int rollValue = diceValue.nextInt(6) + 1 + diceValue.nextInt(6) + 1;
			
			if (rollValue == 2) {
				num2.addCount();
			}else if (rollValue == 3) {
				num3.addCount();
			}else if (rollValue == 4) {
				num4.addCount();
			}else if (rollValue == 5) {
				num5.addCount();
			}else if (rollValue == 6) {
				num6.addCount();
			}else if (rollValue == 7) {
				num7.addCount();
			}else if (rollValue == 8) {
				num8.addCount();
			}else if (rollValue == 9) {
				num9.addCount();
			}else if (rollValue == 10) {
				num10.addCount();
			}else if (rollValue == 11) {
				num11.addCount();
			}else if (rollValue == 12) {
				num12.addCount();
			}}
		
		float prob2 = num2.getCount()/numRoll;
		float prob3 = num3.getCount()/numRoll;
		float prob4 = num4.getCount()/numRoll;
		float prob5 = num5.getCount()/numRoll;
		float prob6 = num6.getCount()/numRoll;
		float prob7 = num7.getCount()/numRoll;
		float prob8 = num8.getCount()/numRoll;
		float prob9 = num9.getCount()/numRoll;
		float prob10 = num10.getCount()/numRoll;
		float prob11 = num11.getCount()/numRoll;
		float prob12 = num12.getCount()/numRoll;
		
		String message = "2 = " + prob2 + "\n" + "3 = " + prob3 + "\n" + "4 = " + prob4 + "\n" + "5 = " + prob5
				+ "\n" + "6 = " + prob6 + "\n" + "7 = " + prob7 + "\n" + "8 = " + prob8 + "\n" + "9 = " + prob9 + "\n" 
				+ "10 = " + prob10 + "\n" + "11 = " + prob11 + "\n" + "12 = " + prob12;
		JOptionPane.showMessageDialog(null, message);
		
	}
}