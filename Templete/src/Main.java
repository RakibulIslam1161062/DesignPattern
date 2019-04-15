import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) {
			
			 System.out.println("Give Call time : Hour ");
			 
			 Scanner inp = new Scanner(System.in);
			 double time=0;
			 double time1 = inp.nextDouble();
			 System.out.println("minute: ");
			 double time2 = inp.nextDouble();
			 System.out.println("Second: ");
			 double time3 = inp.nextDouble();
			 time = time1*60+time2+time3/60;
			 
			 
			 Operator gp = new GrameenPhone(time);
			 gp.calculate();
			 Operator robi = new Robi(time);
			 robi.calculate();
			 Operator AmarPhone = new AmarPhone(time);
			 AmarPhone.calculate();
		}
}
