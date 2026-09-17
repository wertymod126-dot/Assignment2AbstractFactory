public class Ayran implements Drink {
    @Override
    public void pour() {
        System.out.println("pouring Ayran....");
    }
    @Override
    public String toString() {
        return "Drink: Cold Ayran nam nam";
    }
}
