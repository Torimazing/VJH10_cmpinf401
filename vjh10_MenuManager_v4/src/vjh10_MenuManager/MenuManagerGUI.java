/**
 *
 */
package vjh10_MenuManager;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * @author victo
 *
 */
public class MenuManagerGUI {
	private MenuManager mm = new MenuManager("data/dishes.txt");
	private ArrayList<Menu> menus = new ArrayList<>();

	private JFrame frame;

	public static void main(String[] args) {

		MenuManagerGUI window = new MenuManagerGUI();
		window.frame.setVisible(true);
	}

	public MenuManagerGUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Menu Manager");
		frame.setSize(600, 400);
		frame.getContentPane().setLayout(new GridBagLayout());
		frame.setLocationRelativeTo(null);
		GridBagConstraints c = new GridBagConstraints();

		c.gridx = 2;
		c.gridy = 0;
		c.gridheight = 2;

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

		JList<Object> lstItems = new JList<>();
		lstItems.setSize(20, 15);
		lstItems.setFixedCellHeight(15);
		lstItems.setFixedCellWidth(250);
		lstItems.setVisibleRowCount(15);
		lstItems.setVisible(true);
		lstItems.setVisibleRowCount(15);
		lstItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollList = new JScrollPane(lstItems);

		panel.add(scrollList, b);

		b.gridwidth = 1;
		b.gridy += 1;
		JButton btnDetails = new JButton("Details");
		btnDetails.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int sel = lstItems.getSelectedIndex();
				if (!(sel < 0)) {
					Menu selMenu = menus.get(sel);
					detailBox(selMenu);
				}

			}

		});
		panel.add(btnDetails, b);

		b.gridx += 1;
		JButton btnDelAl = new JButton("Delete All");
		btnDelAl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				menus.clear();
				Object[] arrmenu = menus.toArray();
				lstItems.setListData(arrmenu);
			}

		});
		panel.add(btnDelAl, b);

		b.gridx += 1;
		JButton btnSav = new JButton("Save to File");
		btnSav.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File myObj = new File("data/menus.txt");
					if (myObj.createNewFile()) {
					} else {
					}
				} catch (IOException e1) {
					System.out.println("An error occurred.");
					e1.printStackTrace();
				}
				try {
					FileWriter myWriter = new FileWriter("data/menus.txt");
					for (Menu menu : menus) {
						myWriter.write(menu.getName() + "@@" + menu.getEntree().getName() + "@@"
								+ menu.getSide().getName() + "@@" + menu.getSalad().getName() + "@@"
								+ menu.getDessert().getName() + "@@" + menu.totalCalories() + "\n");
					}
					myWriter.close();
					System.out.println("Successfully wrote to the file.");
				} catch (IOException e1) {
					System.out.println("An error occurred.");
					e1.printStackTrace();
				}

			}

		});
		panel.add(btnSav, b);

		frame.getContentPane().add(panel, c);

		c.gridx = 0;
		c.gridy = 0;
		c.gridheight = 1;

		JPanel panel1 = new JPanel();
		panel1.setBounds(100, 100, 100, 200);
		panel1.setLayout(new GridBagLayout());

		TitledBorder title1;
		title1 = BorderFactory.createTitledBorder("Build your own menu");
		panel1.setBorder(title1);

		c.fill = GridBagConstraints.HORIZONTAL;

		JLabel entLab = new JLabel("Entree: ");
		JComboBox<Entree> entBox = new JComboBox<>();
		for (Entree item : mm.getEntrees()) {
			entBox.addItem(item);
		}
		panel1.add(entLab, c);
		c.gridx = 1;
		panel1.add(entBox, c);
		c.gridy += 1;
		c.gridx = 0;

		JLabel sidLab = new JLabel("Side: ");
		JComboBox<Side> sidBox = new JComboBox<>();
		for (Side item : mm.getSides()) {
			sidBox.addItem(item);
		}
		panel1.add(sidLab, c);
		c.gridx = 1;
		panel1.add(sidBox, c);
		c.gridy += 1;
		c.gridx = 0;

		JLabel salLab = new JLabel("Salad: ");
		JComboBox<Salad> salBox = new JComboBox<>();
		for (Salad item : mm.getSalads()) {
			salBox.addItem(item);
		}
		panel1.add(salLab, c);
		c.gridx = 1;
		panel1.add(salBox, c);
		c.gridy += 1;
		c.gridx = 0;

		JLabel desLab = new JLabel("Dessert: ");
		JComboBox<Dessert> desBox = new JComboBox<>();
		for (Dessert item : mm.getDesserts()) {
			desBox.addItem(item);
		}
		panel1.add(desLab, c);
		c.gridx = 1;
		panel1.add(desBox, c);
		c.gridy += 1;
		c.gridx = 0;
		c.gridwidth = 2;

		JButton btnBoxMenu = new JButton("Create menu with these dishes");
		btnBoxMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String string = javax.swing.JOptionPane.showInputDialog("Please name the Menu: ");
				Menu creaMenu = new Menu(string, (Entree) entBox.getSelectedItem(), (Side) sidBox.getSelectedItem(),
						(Salad) salBox.getSelectedItem(), (Dessert) desBox.getSelectedItem());
				menus.add(creaMenu);
				Object[] arrmenu = menus.toArray();
				lstItems.setListData(arrmenu);

			}

		});
		panel1.add(btnBoxMenu, c);

		c.gridx = 0;
		c.gridy = 0;
		frame.getContentPane().add(panel1, c);

		JPanel panel2 = new JPanel();
		panel2.setBounds(100, 100, 100, 200);
		panel2.setLayout(new GridBagLayout());

		TitledBorder title2;
		title2 = BorderFactory.createTitledBorder("Or generate a Menu");
		panel2.setBorder(title2);

		c.gridx = 0;
		c.gridy = 0;

		JButton btnRanMenu = new JButton("Generate a Random Menu");
		btnRanMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String string = javax.swing.JOptionPane.showInputDialog("Please name the Menu: ");
				Menu ranMenu = mm.randomMenu(string);
				menus.add(ranMenu);
				Object[] arrmenu = menus.toArray();
				lstItems.setListData(arrmenu);
			}
		});
		panel2.add(btnRanMenu, c);
		c.gridy += 1;

		JButton btnMinMenu = new JButton("Generate a Minimun Calories Menu");
		btnMinMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Menu ranMenu = mm.minCaloriesMenu("Minimum Calories Menu");
				menus.add(ranMenu);
				Object[] arrmenu = menus.toArray();
				lstItems.setListData(arrmenu);

			}
		});
		panel2.add(btnMinMenu, c);
		c.gridy += 1;

		JButton btnMaxMenu = new JButton("Generate a Maximum Calories Menu");
		btnMaxMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Menu maxMenu = mm.maxCaloriesMenu("Maximum Calories Menu");
				menus.add(maxMenu);
				Object[] arrmenu = menus.toArray();
				lstItems.setListData(arrmenu);

			}
		});
		panel2.add(btnMaxMenu, c);

		c.gridx = 0;
		c.gridy = 1;
		frame.getContentPane().add(panel2, c);

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	private void detailBox(Menu menu) {
		frame = new JFrame(menu.getName());
		frame.setSize(600, 400);
		frame.getContentPane().setLayout(new GridBagLayout());
		frame.setLocationRelativeTo(null);
		GridBagConstraints c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 0;

		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());

		JLabel entLab = new JLabel("Entree: ");
		JLabel sidLab = new JLabel("Side: ");
		JLabel salLab = new JLabel("Salad: ");
		JLabel desLab = new JLabel("Dessert: ");
		JLabel calLab = new JLabel("Total Calories: ");
		JLabel priLab = new JLabel("Total Price:   $");
		JLabel[] labs = { entLab, sidLab, salLab, desLab, calLab, priLab };
		for (JLabel lab : labs) {
			panel.add(lab, c);
			c.gridy += 1;
		}
		c.gridx = 1;
		c.gridy = 0;
		JTextArea entTxt = new JTextArea(3, 40);
		entTxt.setText(menu.getEntree().getName() + "\n" + menu.getEntree().getDesc());
		JTextArea sidTxt = new JTextArea(3, 40);
		sidTxt.setText(menu.getSide().getName() + "\n" + menu.getSide().getDesc());
		JTextArea salTxt = new JTextArea(3, 40);
		salTxt.setText(menu.getSalad().getName() + "\n" + menu.getSalad().getDesc());
		JTextArea desTxt = new JTextArea(3, 40);
		desTxt.setText(menu.getDessert().getName() + "\n" + menu.getDessert().getDesc());
		JTextArea calTxt = new JTextArea(1, 8);
		String totCal = String.valueOf(menu.totalCalories());
		calTxt.setText(totCal);
		JTextArea priTxt = new JTextArea(1, 8);
		String totPri = Double.toString(menu.totalPrice());
		priTxt.setText(totPri);
		JTextArea[] texts = { entTxt, sidTxt, salTxt, desTxt, calTxt, priTxt };
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		for (JTextArea text : texts) {
			text.setEditable(false);
			text.setBorder(border);
			text.setLineWrap(true);
			panel.add(text, c);
			c.gridy += 1;
		}

		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	}

	@SuppressWarnings("unused")
	private void dropBoxInit(JFrame frame, GridBagConstraints c) {
		JPanel panel = new JPanel();
		panel.setBounds(100, 100, 100, 200);
		panel.setLayout(new GridBagLayout());

		TitledBorder title;
		title = BorderFactory.createTitledBorder("Build your own menu");
		panel.setBorder(title);

		c.fill = GridBagConstraints.HORIZONTAL;

		JLabel entLab = new JLabel("Entree: ");
		JComboBox<Entree> entBox = new JComboBox<>();
		for (Entree item : mm.getEntrees()) {
			entBox.addItem(item);
		}
		panel.add(entLab, c);
		c.gridx = 1;
		panel.add(entBox, c);
		c.gridy += 1;
		c.gridx = 0;

		JLabel sidLab = new JLabel("Side: ");
		JComboBox<Side> sidBox = new JComboBox<>();
		for (Side item : mm.getSides()) {
			sidBox.addItem(item);
		}
		panel.add(sidLab, c);
		c.gridx = 1;
		panel.add(sidBox, c);
		c.gridy += 1;
		c.gridx = 0;

		JLabel salLab = new JLabel("Salad: ");
		JComboBox<Salad> salBox = new JComboBox<>();
		for (Salad item : mm.getSalads()) {
			salBox.addItem(item);
		}
		panel.add(salLab, c);
		c.gridx = 1;
		panel.add(salBox, c);
		c.gridy += 1;
		c.gridx = 0;

		JLabel desLab = new JLabel("Dessert: ");
		JComboBox<Dessert> desBox = new JComboBox<>();
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
		btnBoxMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String string = javax.swing.JOptionPane.showInputDialog("Please name the Menu: ");
				Menu creaMenu = new Menu(string, (Entree) entBox.getSelectedItem(), (Side) sidBox.getSelectedItem(),
						(Salad) salBox.getSelectedItem(), (Dessert) desBox.getSelectedItem());
				menus.add(creaMenu);

			}

		});
		panel.add(btnBoxMenu, c);

		c.gridx = 0;
		c.gridy = 0;
		frame.getContentPane().add(panel, c);
	}

	@SuppressWarnings("unused")
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

	@SuppressWarnings("unused")
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

		JTextArea lstItems = new JTextArea();
		lstItems.setColumns(20);
		lstItems.setRows(15);

		lstItems.setEditable(false);

		panel.add(lstItems, b);

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
