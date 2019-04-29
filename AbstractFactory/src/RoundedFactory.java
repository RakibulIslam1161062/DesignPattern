
public class RoundedFactory extends AbstractFactory {


	@Override
	Shape getShape(String type) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("circle")) {
			System.out.println("Rounded Factory Created");
			return new Circle();
		}
			
		else if(type.equalsIgnoreCase("Triangle"))
			return new Triangle();
		
		return null;
	}

}
