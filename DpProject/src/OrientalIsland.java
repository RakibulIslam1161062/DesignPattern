
public class OrientalIsland extends AbstractIslandFactory{

	public OrientalIsland( DisasterMonitor disasterMonitor) {
		this.disasterMonitor = disasterMonitor;
		this.disasterMonitor.attach(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	Tree getTree(String type) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("Flora")) {
			System.out.println("Environment"
					+ "Oriental");
			return new Flora();
		}
			
		else if(type.equalsIgnoreCase("Foana")){
			System.out.println("Environment"
					+ "Oriental");
			return new Foana();
		}
			
		
		return null;
	}

	@Override
	void getHut() {
		// TODO Auto-generated method stub
//		System.out.println("This hut is for oriental Environment");
//	
		OrientalHut  ocHut = new OrientalHut();
		for(int i = 0;i <3 ;i ++) {
			HutFactory.getHut(ocHut);
			System.out.println("Oriental Hut created by FlyWeight");
		}	
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("I am from disaster alarming system: The oriental environment is "+disasterMonitor.getState());
		
	}
	
	
	public String getIslandName() {
		 return "Oriental";
	}

	@Override
	Cafe enterCafe() {
		// TODO Auto-generated method stub
		System.out.println("You Enter the Oriental cafe");
		return new  OrientalCafe();
	}

}
