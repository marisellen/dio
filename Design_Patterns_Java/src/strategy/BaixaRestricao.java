package strategy;

public class BaixaRestricao implements Contador {
    @Override
    public void escolher() {
        System.out.println("Montando uma dieta de baixa restrição.");
    }
}
