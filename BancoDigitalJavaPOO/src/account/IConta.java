package account;
public interface IConta {
    int agencia = 0;
    double saldo = 0;
    int numero = 0;

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();

}
