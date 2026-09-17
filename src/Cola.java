public class Cola implements Drink {
    @Override
    public void pour() {
        System.out.println("pouring Cola...");
    }
    @Override
    public String toString() {
        return "Drink: Cola";
    }
}
