
public class Main {
	public static void main(String[] args) {
		
		String message;
		
		DisasterMonitor disasterMonitor = new DisasterMonitor();
		IslandProducer islandProducer = new IslandProducer(disasterMonitor);
		AbstractIslandFactory newIsland = islandProducer.getIsland(true) ;
		newIsland.getHut();
		Tree flora = newIsland.getTree("flora");
		Tree foana = newIsland.getTree("foana");
		flora.draw();
		foana.draw();
		
		disasterMonitor.setState("Alarming");
		//newIsland.sendMessage("hey bro");
		Cafe islandCafe = newIsland.enterCafe();
		boolean permission= islandCafe.grantCafeAccess(1);
		if(permission) {
			System.out.println("Write a message for city People");
			islandCafe.sendMessage(newIsland, ": hey i am Rakib");
		}
		AbstractIslandFactory city = new City();
		Cafe cityCafe = city.enterCafe();
		cityCafe.sendMessage(city, "I am from City Class using mediator Pattern");
		
		
		
	}
}
//public void sendMessage(String message){
//    Messenger.showMessage(this,message);
// }