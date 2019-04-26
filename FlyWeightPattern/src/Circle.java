
public class Circle implements Shape {
	
	
	private String color;
	private int x;
	private int y;
	private int rad;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Color "+color+ " x- "+x+" y- "+y);
		
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public Circle (String color) {
		this.color=color;
	}
	

}
