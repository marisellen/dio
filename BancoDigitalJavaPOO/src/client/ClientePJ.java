package client;

public class ClientePJ extends Cliente{
    private String cnpj;

    public ClientePJ(String nome, String cpf, String cnpj) {
        super(nome, cpf);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
