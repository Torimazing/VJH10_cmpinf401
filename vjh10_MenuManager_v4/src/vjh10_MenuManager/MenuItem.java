package vjh10_MenuManager;

/**
 * Class MenuItem
 * author : Tori (VJH10)
 * created: 11/23/2022
 */

public class MenuItem {
	private String name;
	private String description;
	private int calories;
	private double price;
	
	public MenuItem(String title, String desc, int cal, double price) {
		name = title;
		description = desc;
		calories = cal;
		this.price = price;
	}
	
	public String toString() {
		return name;
	}
	public int getCal() {
		return calories;
	}
	public String getDesc() {
		return description;
	}
	public String getName() {
		return name;
	}
	public void setCal(int cal) {
		calories = cal;
	}
	public void setDesc(String desc) {
		description = desc;
	}
	public void setName(String title) {
		name = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
