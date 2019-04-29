
public class MainFactory {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		//ShapeFactory triangle = new ShapeFactory();
		
		Shape cicrcle = shapeFactory.getShape("circle");
		cicrcle.draw();
		Shape triangle = shapeFactory.getShape("triangle");
		triangle.draw();
		
	}
}
