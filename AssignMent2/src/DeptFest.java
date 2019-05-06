
public class DeptFest extends Fest {

	public Department department;
	protected DeptFest(Partner partner, Department department) {
		super(partner);
		this.department = department;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSuccessfulFest() {
		// TODO Auto-generated method stub
		System.out.println(department.deptName()+" department is making Fest "+partner.makePartner());
		
	}
	
	

}
