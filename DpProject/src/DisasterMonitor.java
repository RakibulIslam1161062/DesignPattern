import java.util.ArrayList;

public class DisasterMonitor {
	
	private ArrayList<AbstractIslandFactory> islands= new ArrayList<AbstractIslandFactory>();
	   private String state;

	   public String getState() {
	      return state;
	   }

	   public void setState(String state) {
	      this.state = state;
	      notifyAllIslands();
	   }

	   public void attach(AbstractIslandFactory island){
	      islands.add(island);		
	   }

	   public void notifyAllIslands(){
	      for (AbstractIslandFactory island : islands) {
	         island.update();
	      }
	   } 	
}
