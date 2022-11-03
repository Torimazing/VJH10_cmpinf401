package vjh10_MenuManager;
/**
 * Class Side
	 * author : Tori (VJH10)
 * created: 10/13/2022
 */
public class Side {
	private String name;
	private String description;
	private int calories;
	public Side(String title, String desc, int cal) {
		name = title;
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
