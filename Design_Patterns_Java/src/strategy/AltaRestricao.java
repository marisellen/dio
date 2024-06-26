package strategy;

public class AltaRestricao implements Contador {
    @Override
    public void escolher() {
        System.out.println("Montando uma dieta de Alta restrição.");
    }
}
