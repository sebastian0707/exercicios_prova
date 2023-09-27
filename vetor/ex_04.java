package vetor;

import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa variáveis para armazenar o maior e o menor número
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Lê os 6 números
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            // Verifica se o número é o maior ou o menor
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Reinicia o scanner para ler novamente
        scanner.nextLine();

        // Lê o primeiro número novamente para comparar
        System.out.print("Digite o primeiro número novamente: ");
        int primeiroNumero = scanner.nextInt();

        // Inicializa uma variável para contar quantos números são iguais ao primeiro
        int contagem = 0;

        // Verifica se os números são iguais ao primeiro
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero == primeiroNumero) {
                contagem++;
            }
        }

        // Exibe os resultados
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("Quantidade de números iguais ao primeiro: " + contagem);
    }
}
