
public class Cylinder extends Circle {
	private double height = 1;

	public Cylinder() {
		super();
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		double volume = super.getArea()*height;
		return volume;
	}

}
