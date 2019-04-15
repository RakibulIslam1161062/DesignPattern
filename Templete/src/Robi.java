
public class Robi  extends Operator{
	double time;
	double onPickRate = .3;
	double onOffPickRate = .4;
	
	public Robi (double time ) {
		this.time=time;
		System.out.println("For Robi");
	}

	@Override
	void onOffPickHour() {
		System.out.println("On Off PickHour cost : "+ time*onOffPickRate+ " BDT");
		System.out.println();
	}

	@Override
	void onPickHour() {
		System.out.println("On  PickHour cost : "+ time*onPickRate+ " BDT");
		
	}

}
