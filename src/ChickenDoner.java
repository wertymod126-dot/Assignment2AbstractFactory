public class ChickenDoner implements Doner {


    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Doner: adding ---\n -Standard Lavash \n -Chicken Meat \n -Garlic Sauce \n -Fries \n -Pickled Cucumbers");
    }

    @Override
    public String toString() {
        return "Chicken Doner consists of:\n- Standard Lavash\n- Chicken Meat\n- Garlic Sauce\n- Fries\n- Pickled Cucumbers";
    }

}
