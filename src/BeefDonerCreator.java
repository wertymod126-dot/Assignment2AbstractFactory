public class BeefDonerCreator implements DonerFactory {
    @Override
    public Doner createDoner() {
        return new BeefDoner();
    }
}
