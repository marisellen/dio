package client;

import account.Conta;
import account.Transacao;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente implements Icliente {
    private String nome, cpf, rg, cnpj;
    private List<Conta> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public static ClienteFisico criarClienteFisico(String nome, String cpf, String rg) {
        return new ClienteFisico(nome, cpf, rg);
    }

    public static ClientePJ criarClientePJ(String nome, String cpf, String cnpj) {
        return new ClientePJ(nome, cpf, cnpj);
    }

    public String getNome() {
        return nome;
    }
    public String getRg() {
        return null;
    }
    public String getCnpj() {
        return null;
    }
    public String getCpf() {
        return cpf;
    }


    public List<Conta> getContas() {
        return contas;
    }

    public void abrirConta(Conta conta) {
        contas.add(conta);
    }

    public void fecharConta(Conta conta) {
        contas.remove(conta);
    }

    public double consultarSaldo(Conta conta) {
        return conta.getSaldo();
    }

    public List<Transacao> verHistoricoTransacoes(Conta conta) {
        return conta.getHistoricoTransacoes();
    }

    public void depositar(Conta conta, double valor) {
        conta.depositar(valor);
    }

    public void sacar(Conta conta, double valor) {
        conta.sacar(valor);
    }

    public void transferir(Conta origem, Conta destino, double valor){
        origem.transferir(valor, destino);
    }
}