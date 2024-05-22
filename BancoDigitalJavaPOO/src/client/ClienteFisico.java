package client;

public class ClienteFisico extends Cliente{
    private String rg;

    public ClienteFisico(String nome, String cpf, String rg) {
        super(nome, cpf);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }
}
