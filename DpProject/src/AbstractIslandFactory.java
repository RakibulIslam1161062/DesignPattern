
abstract class AbstractIslandFactory {
	
	 
	abstract Tree getTree(String type);
	abstract void getHut();
	abstract String getIslandName();
	abstract Cafe enterCafe();
	//update method for observer pattern
	protected DisasterMonitor disasterMonitor;
	public abstract void update();
}
