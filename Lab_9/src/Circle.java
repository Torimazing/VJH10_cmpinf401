
public class Circle {
	
	private double radius = 5;
	private String color = "Green";
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	 public double getArea() {
		 double area = Math.PI * Math.pow(this.radius, 2);
		 return area;
		 
	 }
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
