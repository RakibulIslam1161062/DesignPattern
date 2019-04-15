
class KidsMeal implements MealCooker{

	private Meal meal;
	
	public KidsMeal(){
	
		this.meal = new Meal();
	}
	
	public void cookMainDish(){
		
		meal.setMainDish("Burger");
	}
	
	public void cookDesert(){
	
		meal.setDesert("Donut");
	}
	
	public void prepareSoftDrink(){
	
		meal.setSoftDrink("Pepsi");
	}
	
	public void makeGift(){
	
		meal.setGift("sorry, We don't provide any gift here");
	}
	
	public Meal getMeal(){
		
		return this.meal;
	}
}
