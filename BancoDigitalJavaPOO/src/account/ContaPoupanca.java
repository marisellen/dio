package account;

import account.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println(" --- Extreto conta poupança --- ");
        super.imprimirInfosComuns();
    }
}
