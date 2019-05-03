
public class Main {
	public static void main(String[] args) {
		
		String message;
		boolean safe;
		DisasterMonitor disasterMonitor = new DisasterMonitor();
		IslandProducer islandProducer = new IslandProducer(disasterMonitor);
		AbstractIslandFactory newIsland = islandProducer.getIsland(true) ;
		newIsland.getHut();
		
		Reservoir reservoir = newIsland.getReservoirInstance();
		
		safe=reservoir.levelCheck(19);
		ReservoirLevel reservoirLevel ;
		if(safe) {
			 reservoirLevel = new SafeReservoir();
		}
		else {
			 reservoirLevel = new UnsafeReservoir();
		}
		reservoirLevel.showLevelMessage();
		
		
		
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
		
		PriestCommand priestCommand = new PriestCommand("Rakib", "Emma");
		Marriage marriage = new Marriage(priestCommand);
		BreakMarriage breakMarriage = new BreakMarriage(priestCommand);
		
		PoorOldPriest  poorOldPriest = new PoorOldPriest();
		 poorOldPriest.takeWork(marriage);
		 poorOldPriest.takeWork(breakMarriage);
		 
		 poorOldPriest.executeWorks();
		
	}
}
//public void sendMessage(String message){
//    Messenger.showMessage(this,message);
// }