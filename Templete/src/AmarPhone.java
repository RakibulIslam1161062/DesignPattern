
public class AmarPhone extends Operator{
	double time;
	double onPickRate = .5;
	double onOffPickRate = .6;
	
	public AmarPhone (double time ) {
		this.time=time;
		System.out.println("For AmarPhone");
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
