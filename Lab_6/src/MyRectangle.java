
public class MyRectangle {
	
	private int width;
	private int height;
	private int startX;
	private int startY;
	
	public MyRectangle() {
		width = 0;
		height = 0;
		startX = 0;
		startY = 0;
	}
	
	public MyRectangle(int X, int Y, int width, int height) {
		this.width = width;
		this.height = height;
		startX = X;
		startY = Y;
	}
	
	public int area() {
		int area = width * height;
		return area;
	}
	
	public String toString(){
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}
	
	public boolean isInside(int X, int Y) {
		if (startX > X && (startX + width) < X) {
			return false;
		}else if (startY > Y && (startY + height) < Y) {
			return false;
		}else {
			return true;
		}
	}
	
	public void setSize(int newWidth, int newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	public void setPosition(int x, int y) {
		startX = x;
		startY = y;
	}

}
