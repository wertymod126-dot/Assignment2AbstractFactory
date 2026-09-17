public class BeefDoner implements Doner {

    @Override
    public void prepare() {
        System.out.println("\nPreparing Beef Doner: adding--- \n -Standard Lavash \n -Beef Meat \n -Garlic Sauce\n -Pickled Cucumbers \n -Fries \n -Tomatoes");
    }

    @Override
    public String toString() {
        return "Beef Doner";
    }

}
