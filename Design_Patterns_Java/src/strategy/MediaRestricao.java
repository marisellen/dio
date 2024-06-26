package strategy;

import strategy.Contador;

public class MediaRestricao implements Contador {
    @Override
    public void escolher() {
        System.out.println("Montando uma dieta de média restrição.");
    }
}
