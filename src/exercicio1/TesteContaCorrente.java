package exercicio1;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000d);

        conta.depositar(100);
        System.out.println(conta.obterSaldoAtual());

        conta.sacar(200);
        System.out.println(conta.obterSaldoAtual());

        conta.sacar(2000);
        System.out.println(conta.obterSaldoAtual());
    }
}
