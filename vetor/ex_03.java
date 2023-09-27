package vetor;

//Elaborar um programa que leia um vetor C de 10 elementos inteiros. Após o término da leitura, trocar todos os valores negativos do vetor C por 0.
//Após todas as trocas terem sido efetuadas, escrever o novo vetor C.

import java.util.Scanner;

public class ex_03 {

    public static void main(String[] args) {
        // Inicializa o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Cria um vetor de 10 elementos
        int[] C = new int[10];

        // Loop para preencher o vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            C[i] = scanner.nextInt();
        }

        // Loop para trocar os valores negativos por 0
        for (int i = 0; i < 10; i++) {
            if (C[i] < 0) {
                C[i] = 0;
            }
        }

        // Imprime o novo vetor
        System.out.println("Novo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print(C[i] + " ");
        }

        // Fecha o scanner
        scanner.close();
    }
}
