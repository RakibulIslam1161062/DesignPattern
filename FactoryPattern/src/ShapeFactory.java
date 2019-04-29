
public class ShapeFactory {
	
//	public String type;
//	public ShapeFactory(String type) {
//		// TODO Auto-generated constructor stub
//		this.type =type;
//	}
	
	public Shape getShape(String type) {
		if(type.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if (type.equalsIgnoreCase("triangle")) {
			return new Triangle();
		}
		
		else return null;
	}

}
