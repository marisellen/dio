package strategy;

public class Dieta {
    private Contador escolha;

    public void setContador(Contador escolha) {
        this.escolha = escolha;
    }

    public void escolher() {
        System.out.println("Dieta selecionada!");
        escolha.escolher();
    }
}
