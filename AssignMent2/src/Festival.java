
public class Festival {
	public static void main(String [] args) {
		
		
		Fest itFest = new DeptFest(new Btv(), new IIT() );
		
		itFest.makeSuccessfulFest();
		
		Tsc tsc = Tsc.getInstance();
		tsc.getAvailableDates();
		tsc.bookTsc(22);
		tsc.getAvailableDates();
		Tsc tsc2 = Tsc.getInstance();
		tsc2.getAvailableDates();
	}
}
