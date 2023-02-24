package exercicio1;

public abstract class Conta {
    double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    protected double obterSaldoAtual() {
        return saldo;
    }
}
