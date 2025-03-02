package desafio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Digite o primeiro número (menor): ");
            int primeiroNumero = scanner.nextInt();

            System.out.println("Digite o segundo número (maior): ");
            int segundoNumero = scanner.nextInt();


            contar(primeiroNumero, segundoNumero);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }

        scanner.close();
    }

    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {

        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

      
        System.out.println("\nImprimindo os números incrementados:");
        for (int i = 1; i <= (segundoNumero - primeiroNumero); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
