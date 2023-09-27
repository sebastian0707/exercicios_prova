package registro;

import java.util.Scanner;

// public class Endereço1 {
//     String rua;
//     int numero;
//     String cep;
//     String cidade;
//     String estado;
//     String pais;

//     public Endereço1(String rua, int numero, String cep, String cidade, String estado, String pais) {
//         this.rua = rua;
//         this.numero = numero;
//         this.cep = cep;
//         this.cidade = cidade;
//         this.estado = estado;
//         this.pais = pais;
//     }
// }

// public class Pessoa {
//     String nome;
//     String dataNascimento;
//     String email;
//     Endereço1 endereco;

//     public Pessoa(String nome, String dataNascimento, String email, Endereço1 endereco) {
//         this.nome = nome;
//         this.dataNascimento = dataNascimento;
//         this.email = email;
//         this.endereco = endereco;
//     }
// }

public class ListaTelefonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa[] listaTelefonica = new Pessoa[2]; // Criar um array para armazenar até 2 pessoas

        for (int i = 0; i < listaTelefonica.length; i++) {
            System.out.println("Cadastro da Pessoa " + (i + 1) + ":");
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a data de nascimento (formato dd/mm/aaaa): ");
            String dataNascimento = scanner.nextLine();

            System.out.print("Digite o e-mail: ");
            String email = scanner.nextLine();

            System.out.print("Digite a rua: ");
            String rua = scanner.nextLine();

            System.out.print("Digite o número: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            System.out.print("Digite o CEP: ");
            String cep = scanner.nextLine();

            System.out.print("Digite a cidade: ");
            String cidade = scanner.nextLine();

            System.out.print("Digite o estado: ");
            String estado = scanner.nextLine();

            System.out.print("Digite o país: ");
            String pais = scanner.nextLine();

            System.out.println("Pessoa cadastrada com sucesso!");
            System.out.println("-------------------------");
        }

        System.out.println("Lista Telefônica:");
        for (int i = 0; i < listaTelefonica.length; i++) {
            Pessoa pessoa = listaTelefonica[i];
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("Data de Nascimento: " + pessoa.dataNascimento);
            System.out.println("E-mail: " + pessoa.email);
            System.out.println("Endereço: ");
            System.out.println("-------------------------");
        }
    }
}
