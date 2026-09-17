public class StudentComboMealFactory implements MealFactory {
    @Override
    public Doner createDoner() {
        return new ChickenDoner();
    }

    @Override
    public Drink createDrink() {
        return new Cola();
    }


}
