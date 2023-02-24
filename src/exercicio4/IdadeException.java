package exercicio4;

public class IdadeException extends Exception {
    private String mensagem;

    public IdadeException(String mensagem) {
        super(mensagem);
    }
}
