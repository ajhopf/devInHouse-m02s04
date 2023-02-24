package exercicio6;

public class Teste {
    public static void main(String[] args) {
        Teste teste = new Teste();

        try {
            teste.validar("André", 5);
            System.out.println("Validação realizada com sucesso!");
        } catch (TamanhoInvalidoException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            teste.validar("André", 3);
            System.out.println("Validação realizada com sucesso!");
        } catch (TamanhoInvalidoException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            teste.validar("André", -10);
            System.out.println("Validação realizada com sucesso!");
        } catch (TamanhoInvalidoException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            teste.validar( null,3);
            System.out.println("Validação realizada com sucesso!");
        } catch (TamanhoInvalidoException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void validar(String valorCampo, Integer valorMaximoCampo) throws TamanhoInvalidoException {
        if ((valorCampo == null || valorMaximoCampo == null) || valorMaximoCampo < 0) {
            throw new IllegalArgumentException("Os valores informados não são válidos!");
        }

        if (valorCampo.length() > valorMaximoCampo) {
            throw new TamanhoInvalidoException("O tamanho da string é maior que o valor máximo de caracteres!");
        }
    }
}
