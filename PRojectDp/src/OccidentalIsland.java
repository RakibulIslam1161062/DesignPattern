
public class OccidentalIsland extends AbstractIslandFactory {
	
	public OccidentalIsland( DisasterMonitor disasterMonitor) {
		this.disasterMonitor = disasterMonitor;
		this.disasterMonitor.attach(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	Tree getTree(String type) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("Flora")) {
			System.out.println("Environment : "
					+ "Occidental");
			return new Flora();
		}
			
		else if(type.equalsIgnoreCase("Foana")){
			System.out.println("Environment : "
					+ "Occidental");
			return new Foana();
		}
		
		return null;
	}
	

	@Override
	void getHut(int hutNumber ) {
		// TODO Auto-generated method stub
		//System.out.println("this hut is for Occidental Environment");
		OccidentalHut  ocHut = new OccidentalHut();
		for(int i = 0;i <hutNumber ;i ++) {
			HutFactory.getHut(ocHut);
			System.out.println("Occidental Hut created by FlyWeight");
		}
		
		
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("I am from disaster alarming system:  The Occidental environment is "+disasterMonitor.getState());
		
	}
	
	public String getIslandName() {
		 return "Occidental";
	}

	@Override
	Cafe enterCafe() {
		// TODO Auto-generated method stub
		System.out.println("You Enter the cafe Occidental Cafe");
		return new OccidentalCafe();
	}

	@Override
	public Reservoir getReservoirInstance() {
		// TODO Auto-generated method stub
		return Reservoir.getInstance();
	}
	
}
