public class DefaultComboMealFactory implements MealFactory {
    @Override
    public Doner createDoner() {
        return new BeefDoner();
    }

    @Override
    public Drink createDrink() {
        return new Ayran();
    }
}
