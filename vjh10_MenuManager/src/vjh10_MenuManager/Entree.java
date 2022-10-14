package vjh10_MenuManager;
/**
 * Class Entree
 * author : Tori (VJH10)
 * created: 10/13/2022
 */

public class Entree {

	private String name;
	private String description;
	private int calories;

	public Entree(String type, String desc, int cal) {
		name = type;
		description = desc;
		calories = cal;
	}
	public String GetName() {
		return name;
	}
	public void SetName(String title) {
		name = title;
	}
	public String GetDesc() {
		return description;
	}
	public void SetDesc(String desc) {
		description = desc;
	}
	public void SetCal(int cal) {
		calories = cal;
	}
	public int GetCal() {
		return calories;
	}

}
