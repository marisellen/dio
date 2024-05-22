package account;

import account.Conta;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println(" --- Extreto conta corrente --- ");
        super.imprimirInfosComuns();
    }
}
