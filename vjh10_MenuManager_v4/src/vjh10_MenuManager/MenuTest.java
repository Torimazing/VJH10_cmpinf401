package vjh10_MenuManager;
/**
 * Class MenuTest
 * author : Tori (VJH10)
 * created: 10/13/2022
 */
public class MenuTest {
		public static void main(String[] args) {
		//every cal value is divisible by 9 for the purpose of simple debugging
		Entree burger = new Entree("Hamburger", "A delicious 78% lean beef "
				+ "patty topped with your choice of toppings on a soft brioche bun", 720, 0);
		Side fries = new Side("Fresh Cut Fries", "Freshly cut potatoes lightly fried, "
				+ "covered with a special blend of herbs.", 150, 0);
		Entree pancake = new Entree("Pumpkin Spice Pancakes", "A tower of spiced "
				+ "pancakes with layers of pumpkin pie puree in between.", 450, 0);
		Side sausage = new Side("Sausage", "Sage pork sausage.", 90, 0);
		Salad fruit = new Salad("Fresh Fruit Salad", "Mixture of fresh seasonal fruits "
				+ "selected by our chef.", 27, 0);
		Dessert brulee = new Dessert("PumpCreme Brulee", "Pumpkin pudding topped "
				+ "with a sprinkling of bruleed maple sugar", 450, 0);
		Menu burgerJoint = new Menu("Burger Joint", burger, fries);
		Menu breakfast = new Menu("Fall Breakfast", pancake, sausage, fruit, brulee);
		
		System.out.println(breakfast.description());
		System.out.println(burgerJoint.totalCalories());
		
		}
}
