package matriz;

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        // Inicialização do Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração dos vetores VA, VB e VC
        int[] VA = new int[10];
        int[] VB = new int[10];
        int[] VC = new int[20];

        // Leitura dos valores para VA
        System.out.println("Digite os 10 valores para o vetor VA:");
        for (int i = 0; i < 10; i++) {
            System.out.print("VA[" + i + "]: ");
            VA[i] = scanner.nextInt();
        }

        // Leitura dos valores para VB
        System.out.println("Digite os 10 valores para o vetor VB:");
        for (int i = 0; i < 10; i++) {
            System.out.print("VB[" + i + "]: ");
            VB[i] = scanner.nextInt();
        }

        // Geração do vetor VC
        for (int i = 0; i < 10; i++) {
            VC[2 * i] = VA[i]; // Preenche as posições pares com os valores de VA
            VC[2 * i + 1] = VB[i]; // Preenche as posições ímpares com os valores de VB
        }

        // Exibição do vetor VC
        System.out.println("Vetor VC:");
        for (int i = 0; i < 20; i++) {
            System.out.println("VC[" + i + "]: " + VC[i]);
        }

        // Fecha o Scanner
        scanner.close();
    }
}
