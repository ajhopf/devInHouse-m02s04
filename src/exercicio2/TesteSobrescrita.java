package exercicio2;

public class TesteSobrescrita {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();

        System.out.println(funcionario.obterCargo());
        System.out.println(gerente.obterCargo());
    }
}
