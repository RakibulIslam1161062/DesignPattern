import java.util.ArrayList;

public class Tsc {
	
	private static ArrayList<Integer> arl = new ArrayList<Integer>();
	private static  Tsc instance = new  Tsc(arl);
	
	
	private Tsc (ArrayList<Integer> arl) {
		Tsc.arl = arl;
		for(int i = 0 ;i<30 ;i++)
			Tsc.arl.add(i);
	}
	
	public static  Tsc getInstance() {
		return instance;
	}
	
	public void  getAvailableDates(){
		
		for(int i=0 ;i <arl.size();i++)
			System.out.println("Available Dates: "+arl.get(i));
	}
	public void bookTsc(int bookDate) {
		
		if(isAvailable(bookDate)) {
			arl.remove(bookDate);
			System.out.println("You booked Tsc for date: "+bookDate);
		}
			
		else System.out.println("Date Isn't available");
	}
	
	
	public boolean isAvailable(int date) {
		if(arl.contains(date)) return true;
		else return false;
	}
	 

}
