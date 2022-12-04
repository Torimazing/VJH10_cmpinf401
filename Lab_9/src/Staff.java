
public class Staff extends Person{
	private String school;
	private double pay;
	
	Staff(String name, String address, double pay){
		super.setName(name);
		super.setAddress(address);
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [school=" + school + ", pay=" + pay + "]";
	}
	

}