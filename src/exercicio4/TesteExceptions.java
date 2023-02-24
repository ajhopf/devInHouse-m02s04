package exercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExceptions {
    public static void main(String[] args) {
        boolean idadeValida = false;
        int idade;

        while (!idadeValida) {
            try {
                idade = getUserAge();
                idadeValida = true;
                System.out.printf("Olá! Você tem %d anos de idade!", idade);
            } catch (InputMismatchException | IdadeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int getUserAge() throws IdadeException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a sua idade: ");
            int idade = scanner.nextInt();
            if (idade <= 0) {
                throw new IdadeException("A idade informada deve ser maior que zero!");
            }
            if (idade > 100) {
                throw new IdadeException("A idade informada deve ser menor que 100 anos! Se você realmente possui mais de 100 anos, entre em contato conosco que lhe enviaremos um brinde :)");
            }
            return idade;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Valor digitado deve ser um número!");
        }
    }
}

