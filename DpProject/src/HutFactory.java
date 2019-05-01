import java.util.HashMap;

public class HutFactory {
	
	Hut hut;
	
	public HutFactory(Hut hut ) {
		// TODO Auto-generated constructor stub
		this.hut = hut;
		
	}

private static final HashMap hutMap = new HashMap();
	
	
	public static Hut getHut(Hut hut) {
		Hut returnHut = (Hut) hutMap.get(hut);
		
		
		if(returnHut==null) {
			
			if(hut.getClass() == OrientalHut.class) {
				returnHut = new OrientalHut();
				System.out.println("Oriental Hut Created newLy");
				
			}
			else {
				returnHut = new OccidentalHut();
				System.out.println("Occidental Hut Created newLy");
			}
			
			hutMap.put(hut,returnHut);
			
			
			
		}
		return returnHut;
	}
}
