
public abstract class Operator {
	
	public final void calculate() {
		onPickHour();
		onOffPickHour();
	}

	abstract void onOffPickHour();
	abstract void onPickHour();

	
}
