import java.util.Scanner;

public class Main{	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		MealCooker mealCooker;
		Chef mainChef;
		
		
			System.out.println("You can Order Meal here   \n1.Kids Meal\n2.Adults Meal");
			int value = input.nextInt();
		
			if(value == 1){
				mealCooker = new KidsMeal();				
			}
			else{
				mealCooker = new AdultsMeal();
			}
			mainChef = new Chef(mealCooker);
			mainChef.makeMeal();
			Meal meal = mainChef.getMeal();
			System.out.println();
			System.out.println(" The heavenly food is here for you only");
			System.out.println(" Main Dish: " + meal.getMainDish());
			System.out.println(" Desert: " + meal.getDesert());
			System.out.println(" Soft Drink: " + meal.getSoftDrink());
			System.out.println(" Gift: " + meal.getGift());
						
		
	}
}