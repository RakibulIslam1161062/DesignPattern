
public class ProxyInternet implements OfficeInternet {

	public String name;
	public int rank;
	 public ProxyInternet(String name, int rank) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rank = rank;
		
	}
	
	@Override
	public void grantAccess() {
		

		// TODO Auto-generated method stub
		if(getRank()>2) {
			RealInternet access = new RealInternet(name);
			access.grantAccess();
		}
		else
			System.out.println("you have no access bro");
		
	}
	
	public int getRank() {
		
		
		return rank;
	}

}
