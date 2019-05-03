import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int check;
		String message;
		boolean island,safe;
		Scanner input = new Scanner(System.in);
		
		DisasterMonitor disasterMonitor = new DisasterMonitor();
		IslandProducer islandProducer = new IslandProducer(disasterMonitor);
		
		System.out.println("Which Which Island do you want to check? ");
		System.out.println("Type 1 for Occidental and type 2 for Oriental");
		check = input.nextInt();
		if(check==1) island=true; else island=false;
		AbstractIslandFactory newIsland = islandProducer.getIsland(island) ;
		System.out.println("How many hut you want to produce by FlyWeight Pattern?");
		check = input.nextInt();
		newIsland.getHut(check);
		System.out.println();
		System.out.println("here is the tree and Environment of the Island");
		
		Tree flora = newIsland.getTree("flora");
		Tree foana = newIsland.getTree("foana");
		flora.draw();
		foana.draw();
		
		System.out.println();
		System.out.println("Here Is a Reservoir Which is created with SingleTon Class and Used Strategy Pattern for inhabitants work about water level");
		System.out.println("Water safe Level is 10. Can you please give Island's Reservoir water level? ");
		check = input.nextInt();
		Reservoir reservoir = newIsland.getReservoirInstance();
		
		safe=reservoir.levelCheck(check);
		ReservoirLevel reservoirLevel ;
		if(safe) reservoirLevel = new SafeReservoir();
		else  reservoirLevel = new UnsafeReservoir();
		
		reservoirLevel.showLevelMessage();
		
		System.out.println();
		System.out.println("Disaster Monitor system is created with Obsever Pattern");
		System.out.println("Give a situation lke alarming or safe! it will broadcast");
		message = input.nextLine();
		message = input.nextLine();
		
		disasterMonitor.setState(message);
		//newIsland.sendMessage("hey bro");
		
		System.out.println("Cafe using and messgae sending is created with Proxy pattern and Mediator Pattern");
		System.out.println("type ENTER key to  Enter the cafe: ");
		message = input.nextLine();
		Cafe islandCafe = newIsland.enterCafe();
		System.out.println("Are You a software Engineer? type 1 for Yes! 2 for No!");
		
		check = input.nextInt();
		boolean permission= islandCafe.grantCafeAccess(check);
		if(permission) {
			System.out.println("Write a message for city People");
			message = input.nextLine();
			message = input.nextLine();
			islandCafe.sendMessage(newIsland, message);
		}
		AbstractIslandFactory city = new City();
		Cafe cityCafe = city.enterCafe();
		cityCafe.sendMessage(city, "I am from the City using mediator Pattern");
		
		System.out.println();
		System.out.println(" Here i have used Command Pattern for undoing the work of Priest");
		System.out.println("Type two names for Marriage between them by priest");
		
		String name1,name2;
		name1 = input.nextLine();
		//message = input.nextLine();
		name2 = input.nextLine();
		PriestCommand priestCommand = new PriestCommand(name1, name2);
		Marriage marriage = new Marriage(priestCommand);
		BreakMarriage breakMarriage = new BreakMarriage(priestCommand);
		
		PoorOldPriest  poorOldPriest = new PoorOldPriest();
		 poorOldPriest.takeWork(marriage);
		 poorOldPriest.executeWorks();
		 System.out.println();
		 System.out.println("IS there any Complain? Want to undo the work? type 1 for Confirmation");
		 
		 check = input.nextInt();
		 if(check== 1){
			 poorOldPriest.takeWork(breakMarriage);
			 poorOldPriest.executeWorks();
		 }
	}
}
//public void sendMessage(String message){
//    Messenger.showMessage(this,message);
// }