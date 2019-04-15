
public class GrameenPhone extends Operator {
	
	double time;
	double onPickRate = .35;
	double onOffPickRate = .45;
	
	public GrameenPhone(double time ) {
		this.time=time;
		System.out.println("For GrameenPhone");
	}

	@Override
	void onOffPickHour() {
		System.out.println("On Off PickHour cost : "+ time*onOffPickRate + " BDT");
		System.out.println();
	}

	@Override
	void onPickHour() {
		System.out.println("On  PickHour cost : "+ time*onPickRate+ " BDT");
		
	}
	

}
