
public class HotelKeeper {
	
	public Menus getNonveg() {
		NonVegRestaurant non = new NonVegRestaurant();
		Menus nonV = non.getMenu();
		
		return nonV;
	}
	
	public Menus getVeg() {
		VegRestaurant non = new VegRestaurant();
		Menus nonV = non.getMenu();
		
		return nonV;
	}

}
