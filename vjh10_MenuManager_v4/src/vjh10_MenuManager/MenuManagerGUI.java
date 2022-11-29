/**
 * 
 */
package vjh10_MenuManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * @author victo
 *
 */
public class MenuManagerGUI {
	
	private JFrame frame;
	
	public static void main(String[] args) {
		
		MenuManagerGUI window = new MenuManagerGUI();
		window.frame.setVisible(true);
	}
	
	public MenuManagerGUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.getContentPane().setLayout();
		
		JTextArea txtTextArea = new JTextArea();
		txtTextArea.setColumns(10);
		txtTextArea.setRows(10);
		txtTextArea.setBounds(20, 20, 200, 200);
		frame.getContentPane().add(txtTextArea);
		
		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTextArea.append(new Date().toString() + "\n");
			}
		});
		btnClickMe.setBounds(20, 230, 200, 29);
		frame.getContentPane().add(btnClickMe);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}
