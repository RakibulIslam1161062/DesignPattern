class AdultsMeal implements MealCooker{

	private Meal meal;
	
	public AdultsMeal(){
	
		this.meal = new Meal();
	}
	
	public void cookMainDish(){
		
		meal.setMainDish("Pizza");
	}
	
	public void cookDesert(){
	
		meal.setDesert("Cheese Cake");
	}
	
	public void prepareSoftDrink(){
	
		meal.setSoftDrink("Fanta");
	}
	
	public void makeGift(){
	
		meal.setGift("No Gift.Be like  adult");
	}
	
	public Meal getMeal(){
		
		return this.meal;
	}
}
