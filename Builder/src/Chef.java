class Chef{

	private MealCooker mealCooker;
	
	public Chef(MealCooker cooker){
	
		mealCooker = cooker;
	}
	
	public Meal getMeal(){
		
		return this.mealCooker.getMeal();
	}
	
	public void makeMeal(){
		
		this.mealCooker.cookMainDish();
		this.mealCooker.cookDesert();
		this.mealCooker.prepareSoftDrink();
		this.mealCooker.makeGift();
	}
}