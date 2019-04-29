
public class FactoryProducer {
	
	public static AbstractFactory getFactory(boolean lol) {
		if(lol) return new RoundedFactory();
		else return new NormalFactory();
	}

}
