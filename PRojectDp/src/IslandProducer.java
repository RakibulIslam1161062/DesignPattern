
public class IslandProducer {
	
	static DisasterMonitor disasterMonitor;
	public IslandProducer(DisasterMonitor disasterMonitor) {
		// TODO Auto-generated constructor stub
		this.disasterMonitor = disasterMonitor;
	}
	
	public static AbstractIslandFactory getIsland(boolean lol) {
		if(lol) return new OccidentalIsland(disasterMonitor);
		else return new OrientalIsland(disasterMonitor);
	}
	

}
