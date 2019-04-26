
public class VegRestaurant implements Hotel {

	@Override
	public Menus getMenu() {
		// TODO Auto-generated method stub
		
		NonvegMenu non = new NonvegMenu();
		return non;
	}

}
