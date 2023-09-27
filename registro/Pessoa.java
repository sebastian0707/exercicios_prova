package registro;
import java.util.Scanner;

public class Pessoa {
    // Definir os campos do registro
    String nome;
    String dataNascimento;
    String email;

    // Construtor para inicializar os campos
    public Pessoa(String nome, String dataNascimento, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    // Método para exibir os dados da pessoa
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("E-mail: " + email);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações ao usuário
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite o e-mail: ");
        String email = scanner.nextLine();

        // Criar um objeto Pessoa com os dados fornecidos
        Pessoa pessoa = new Pessoa(nome, dataNascimento, email);

        // Exibir os dados da pessoa
        System.out.println("\nDados da Pessoa:");
        pessoa.exibirDados();
    }
}
