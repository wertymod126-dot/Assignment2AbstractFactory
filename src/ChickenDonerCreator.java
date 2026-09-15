public class ChickenDonerCreator implements DonerFactory {
    @Override
    public Doner createDoner() {
        return new ChickenDoner();
    }
}
