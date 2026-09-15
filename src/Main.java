public class Main {
    public static void main(String[] args) {
        DonerFactory chickenDonerFactory = new ChickenDonerCreator();
        Doner myOrderChickenDoner = chickenDonerFactory.createDoner();
        System.out.println(myOrderChickenDoner);

        DonerFactory beefDonerFactory = new BeefDonerCreator();
        Doner myOrderBeefDoner = beefDonerFactory.createDoner();
        System.out.println(myOrderBeefDoner);
    }
}