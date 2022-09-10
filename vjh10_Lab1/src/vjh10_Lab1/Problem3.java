package vjh10_Lab1;

import javax.swing.JOptionPane;

public class Problem3 {
	public static void main(String[] args) {
		String money = JOptionPane.showInputDialog("Please input a dollar amount between 1 and 9999");
		int nummun = Integer.parseInt(money);
		int grands = nummun / 1000;
		nummun = nummun - (grands * 1000);
		int ben = nummun / 100;
		nummun = nummun - (ben*100);
		int saw = nummun / 10;
		int bucks = nummun - (saw*10);
		JOptionPane.showMessageDialog(null, money + " is equivelant to: \n" + grands + " Grands\n" + 
		ben + " Benjamins \n" + saw + " Sawbucks \n" + bucks + " Bucks");
	}
}
