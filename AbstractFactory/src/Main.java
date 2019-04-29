
public class Main {
	public static void main(String[] args) {
		AbstractFactory newFactory = FactoryProducer.getFactory(true) ;
		Shape circle = newFactory.getShape("circle");
		circle.draw();
	}
}
