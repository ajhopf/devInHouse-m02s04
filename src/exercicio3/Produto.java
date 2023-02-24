package exercicio3;

public class Produto implements Tributavel{
    private double valor;
    private double valorImposto;

    //Construtor para quando não especificar o imposto --> imposto default de 10.5;
    public Produto(double valor) {
        this.valor = valor;
        this.valorImposto = 10.5;
    }

    public Produto(double valor, double valorImposto) {
        this.valor = valor;
        this.valorImposto = valorImposto;
    }


    @Override
    public double calcularValorImposto() {
        return valor + valorImposto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }
}
