package exercicio1;

public class ContaCorrente extends Conta implements Operavel {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Você não tem saldo suficiente para realizar a operação.");
        }
    }
}
