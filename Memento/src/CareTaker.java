import java.awt.List;
import java.util.ArrayList;

public class CareTaker {
	public static void main(String[] args) {
		ArrayList<Memento> list= new ArrayList<Memento>();
		
		Originator originator = new Originator();
		originator.set("100");
		
		list.add(originator.saveToMemento());
		
		originator.restoreMemento(list.get(0));
		
	}
}
