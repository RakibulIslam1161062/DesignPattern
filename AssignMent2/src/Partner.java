import java.util.ArrayList;

public abstract class Partner {
	public abstract String makePartner();
	ArrayList<Department> depts = new ArrayList<Department>();
	   private String message;

	   public String getMessage() {
	      return message;
	   }

	   public void broadcast(String message) {
	      this.message = message;
	      notifyAllObservers();
	   }

	   public void attach(Department dept){
		   depts.add(dept);		
	   }

	   public void notifyAllObservers(){
	      for (Department observer : depts) {
	         observer.update();
	      }
	   } 	

}
