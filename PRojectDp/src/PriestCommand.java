
public class PriestCommand {
	
	String name1, name2;
	public PriestCommand(String name1, String name2) {
		// TODO Auto-generated constructor stub
		this.name1 = name1;
		this.name2 = name2;
	}
	
	public void marriagebyPriest() {
		System.out.println("Congrats! You two "+name1+" "+name2+ "  are now Couple");
	}
	public void breakUpByPriest() {
		System.out.println("Undone Marriage between "+name1+" and "+ name2);
	}

}
