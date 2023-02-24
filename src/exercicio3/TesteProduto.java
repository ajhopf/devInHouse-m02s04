package exercicio3;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(1000);
        Produto produtoComImposto = new Produto(2000, 20.3);

        System.out.println(produto.calcularValorImposto());
        System.out.println(produtoComImposto.calcularValorImposto());
    }
}
