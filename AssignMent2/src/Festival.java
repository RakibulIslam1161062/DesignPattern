
public class Festival {
	public static void main(String [] args) {
		
		Partner tv = new Btv();
		Department iit = new IIT(tv);
		Fest itFest = new DeptFest(new Btv(), iit );
		
		itFest.makeSuccessfulFest();
		
		Tsc tsc = Tsc.getInstance();
		tsc.getAvailableDates();
		tsc.bookTsc(22);
		tsc.getAvailableDates();
		
		
		//Partner tv = new Btv();
		
		
		Department iit2 = new IIT(tv);
		Department cse = new Cse(tv);
		
		
		
		//iit.broadcast(iit, iit2);
		tv.broadcast("Register Now,From BTV");
		
	}
}
