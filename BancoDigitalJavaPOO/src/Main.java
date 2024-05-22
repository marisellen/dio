import account.Conta;
import account.ContaCorrente;
import account.ContaPoupanca;
import client.ClienteFisico;
import client.ClientePJ;

public class Main {
    public static void Main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        
    }
}