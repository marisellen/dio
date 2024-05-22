package account;

import client.Cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conta implements IConta {

    protected static int AGENCIA_PADRAO = 0;
    protected static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
    private Conta contas;
    private List<Transacao> historicoTransacoes;

    public Conta(int numero, Cliente cliente) {
        this.agencia = AGENCIA_PADRAO; // Define a agência padrão
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.historicoTransacoes = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            historicoTransacoes.add(new Transacao("Saque", valor, new Date()));
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historicoTransacoes.add(new Transacao("Depósito", valor, new Date()));
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
            historicoTransacoes.add(new Transacao("Transferência para " + contaDestino.getNumero(), valor, new Date()));
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void abrirConta(Conta conta) {
        contas.add(conta);
    }

    public void fecharConta(Conta conta) {
        contas.remove(conta);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Transacao> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}