import java.util.ArrayList;

public class PoorOldPriest {

	private ArrayList<PriestWork> priestWorkList = new ArrayList<PriestWork>();
	
	public void takeWork(PriestWork priestWork) {
		priestWorkList.add(priestWork);
	}
	public void executeWorks() {
		for( PriestWork priestWork : priestWorkList)
			priestWork.executeWork();
		
		priestWorkList.clear();
	}
	
	
}
