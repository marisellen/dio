package account;

import java.util.Date;

public class Transacao {
    private String tipo;
    private double valor;
    private Date data;

    public Transacao(String tipo, double valor, Date data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Transacao[" +
                "tipo:'" + tipo + '\'' +
                ", valor:" + valor +
                ", data:" + data + ']';
    }
}
