
public class Marriage  implements PriestWork{

	private PriestCommand priestCommand;
	@Override
	public void executeWork() {
		// TODO Auto-generated method stub
		priestCommand.marriagebyPriest();
		
	}
	public  Marriage(PriestCommand priestCommand) {
		this.priestCommand = priestCommand;
	}
	

}
