
public class BreakMarriage implements PriestWork{

	private PriestCommand priestCommand;
	
	@Override
	public void executeWork() {
		// TODO Auto-generated method stub
		priestCommand.breakUpByPriest();
	}
	
	
	public BreakMarriage(PriestCommand priestCommand) {
		// TODO Auto-generated constructor stub
		this.priestCommand = priestCommand;
	}  
		
	

}
