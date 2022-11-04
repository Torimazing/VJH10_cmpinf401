package vjh10_MenuManager;
/**
 * Class Dessert
	 * author : Tori (VJH10)
 * created: 10/13/2022
 */
public class Dessert {
	private String name;
	private String description;
	private int calories;
	public Dessert(String title, String desc, int cal) {
		name = title;
		description = desc;
		calories = cal;
	}
	public int GetCal() {
		return calories;
	}
	public String GetDesc() {
		return description;
	}
	public String GetName() {
		return name;
	}
	public void SetCal(int cal) {
		calories = cal;
	}
	public void SetDesc(String desc) {
		description = desc;
	}
	public void SetName(String title) {
		name = title;
	}


}
