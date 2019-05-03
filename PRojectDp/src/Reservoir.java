
public class Reservoir {
	
	public static Reservoir instance = new Reservoir();
	public static int safeLevel = 10;
	private Reservoir() {
		// TODO Auto-generated constructor stub
	}
	
	public static Reservoir getInstance() {
		return instance;
	}
	
	public boolean levelCheck(int level) {
		if(level <= safeLevel ) return true;
		else {
			return false;
		}
	}
}
