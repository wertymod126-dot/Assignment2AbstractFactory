public class Main {
    public static void main(String[] args) {

        System.out.println("=== Order 1: Authentic Kazakh Meal ===");

        MealFactory kazakhMealFactory = new DefaultComboMealFactory()    ;


        Doner myDoner = kazakhMealFactory.createDoner();
        Drink myDrink = kazakhMealFactory.createDrink();

        System.out.println(myDoner);
        System.out.println(myDrink);
        myDrink.pour();


        System.out.println("\n=== Order 2: Student Meal ===");
        MealFactory studentMealFactory = new StudentComboMealFactory();

        Doner anotherDoner = studentMealFactory.createDoner();
        Drink anotherDrink = studentMealFactory.createDrink();

        System.out.println(anotherDoner);
        System.out.println(anotherDrink);
        anotherDrink.pour();
    }
}