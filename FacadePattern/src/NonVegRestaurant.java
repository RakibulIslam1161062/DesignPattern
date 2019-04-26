
public class NonVegRestaurant implements Hotel {

	@Override
	public Menus getMenu() {
		// TODO Auto-generated method stub
		VegMenu veg = new VegMenu();
		return veg;
	}

}
