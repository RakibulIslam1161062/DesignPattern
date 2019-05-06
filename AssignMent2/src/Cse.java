
public class Cse extends Department {
	
	public Cse(Partner partner) {
		// TODO Auto-generated constructor stub
	      this.partner= partner ;
	      this.partner.attach(this);
	}

	@Override
	public String deptName() {
		// TODO Auto-generated method stub
		return "CSE";
	}

	@Override
	public void sendMessage(Department dept1, Department dept2) {
		// TODO Auto-generated method stub
		Messenger.showMessage(dept1, dept2);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "To: "+deptName()+ ": IIT Fest 2019, "+partner.getMessage()); 
	}

}
