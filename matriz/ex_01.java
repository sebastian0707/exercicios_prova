// Elaborar um programa que leia 8 números inteiros e exiba quantos são maiores que a média desses valores.

package matriz;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        // Inicialização do Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar os 8 números
        int[] numeros = new int[8];

        // Variável para armazenar a soma dos números
        int soma = 0;

        // Leitura dos 8 números
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; // Adiciona o número à soma
        }

        // Calcula a média dos números
        double media = (double) soma / 8;

        // Variável para contar quantos números são maiores que a média
        int maioresQueMedia = 0;

        // Verifica quantos números são maiores que a média
        for (int i = 0; i < 8; i++) {
            if (numeros[i] > media) {
                maioresQueMedia++;
            }
        }

        // Exibe o resultado
        System.out.println("A média dos números é: " + media);
        System.out.println("Quantidade de números maiores que a média: " + maioresQueMedia);

        // Fecha o Scanner
        scanner.close();
    }
}
