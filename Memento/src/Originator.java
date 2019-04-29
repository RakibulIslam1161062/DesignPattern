
public class Originator {
	public String time;
	public void set(String time) {
		System.out.println("Setting time "+time );
		this.time =time;
	}
	
	public Memento saveToMemento() {
		System.out.println("Saving to Memento ");
		return new Memento(time);
	}
	
	public void restoreMemento(Memento originator) {
		time=originator.getSavedTime();
		System.out.println("time is "+time);
	}
	
	
	
}
