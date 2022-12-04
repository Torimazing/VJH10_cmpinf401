/**
 * 
 */
package vjh10_MenuManager;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 * @author victo
 *
 */
public class MenuManagerGUI {
	private MenuManager mm = new MenuManager("data/dishes.txt");

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
		frame.setSize(600, 400);
		frame.getContentPane().setLayout(new GridBagLayout());
		frame.setLocationRelativeTo(null);
		GridBagConstraints c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 0;
		dropBoxInit(frame, c);
		
		generateBoxInit(frame, c);
		
		c.gridx = 2;
		c.gridy = 0;
		c.gridheight = 2;
		
		textPanelInit(frame, c);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void dropBoxInit(JFrame frame, GridBagConstraints c) {
		JPanel panel = new JPanel();
		panel.setBounds(100, 100, 100, 200);
		panel.setLayout(new GridBagLayout());
		
		TitledBorder title;
		title = BorderFactory.createTitledBorder("Build your own menu");
		panel.setBorder(title);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
		JLabel entLab = new JLabel("Entree: ");
		JComboBox<Entree> entBox = new JComboBox<Entree>();
		for (Entree item : mm.getEntrees()) {
			entBox.addItem(item);
		}
		panel.add(entLab, c);
		c.gridx = 1;
		panel.add(entBox, c);
		c.gridy += 1;
		c.gridx = 0;
		
		JLabel sidLab = new JLabel("Side: ");
		JComboBox<Side> sidBox = new JComboBox<Side>();
		for (Side item : mm.getSides()) {
			sidBox.addItem(item);
		}
		panel.add(sidLab, c);
		c.gridx = 1;
		panel.add(sidBox, c);
		c.gridy += 1;
		c.gridx = 0;
		
		JLabel salLab = new JLabel("Salad: ");
		JComboBox<Salad> salBox = new JComboBox<Salad>();
		for (Salad item : mm.getSalads()) {
			salBox.addItem(item);
		}
		panel.add(salLab, c);
		c.gridx = 1;
		panel.add(salBox, c);
		c.gridy += 1;
		c.gridx = 0;
		
		JLabel desLab = new JLabel("Dessert: ");
		JComboBox<Dessert> desBox = new JComboBox<Dessert>();
		for (Dessert item : mm.getDesserts()) {
			desBox.addItem(item);
		}
		panel.add(desLab, c);
		c.gridx = 1;
		panel.add(desBox, c);
		c.gridy += 1;
		c.gridx = 0;
		c.gridwidth = 2;
		
		JButton btnBoxMenu = new JButton("Create menu with these dishes");
		panel.add(btnBoxMenu, c);
		
		c.gridx = 0;
		c.gridy = 0;
		frame.getContentPane().add(panel, c);		
	}
	
	private void generateBoxInit(JFrame frame, GridBagConstraints c) {
		JPanel panel = new JPanel();
		panel.setBounds(100, 100, 100, 200);
		panel.setLayout(new GridBagLayout());
		
		TitledBorder title;
		title = BorderFactory.createTitledBorder("Or generate a Menu");
		panel.setBorder(title);
		
		c.gridx = 0;
		c.gridy = 0;
		
		JButton btnRanMenu = new JButton("Generate a Random Menu");
		panel.add(btnRanMenu, c);
		c.gridy += 1;
		
		JButton btnMinMenu = new JButton("Generate a Minimun Calories Menu");
		panel.add(btnMinMenu, c);
		c.gridy += 1;
		
		JButton btnMaxMenu = new JButton("Generate a Maximum Calories Menu");
		panel.add(btnMaxMenu, c);
		
		c.gridx = 0;
		c.gridy = 1;
		frame.getContentPane().add(panel, c);
	}
	
	private void textPanelInit(JFrame frame, GridBagConstraints c) {
		GridBagConstraints b = new GridBagConstraints();
		
		b.gridx = 0;
		b.gridy = 0;
		b.gridwidth = 3;
		
		JPanel panel = new JPanel();
		panel.setBounds(100, 100, 100, 200);
		panel.setLayout(new GridBagLayout());
		
		TitledBorder title;
		title = BorderFactory.createTitledBorder("Created Menus:");
		panel.setBorder(title);
		
		JTextArea txtTextArea = new JTextArea();
		txtTextArea.setColumns(20);
		txtTextArea.setRows(15);
		
		txtTextArea.setEditable(false);
		
		panel.add(txtTextArea, b);
		
		b.gridwidth = 1;
		b.gridy += 1;
		JButton btnDetails = new JButton("Details");
		panel.add(btnDetails, b);
		
		b.gridx += 1;
		JButton btnDelAl = new JButton("Delete All");
		panel.add(btnDelAl, b);
		
		b.gridx += 1;
		JButton btnSav = new JButton("Save to File");
		panel.add(btnSav, b);
		
		
		frame.getContentPane().add(panel, c);
	}
	
	
}
