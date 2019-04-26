
public class RealInternet implements OfficeInternet {
	
	public String name;
	
	public RealInternet(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		
	}

	@Override
	public void grantAccess() {
		// TODO Auto-generated method stub
		System.out.println("Yeah this is real Internet for "+name);
		
	}

}
