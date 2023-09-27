package registro;

public class Endereço {
   
    String rua;
    int numero;
    int CEP;
    String cidade;
    String estado;
    String país;

    public Endereço(String rua, int numero, int CEP, String cidade, String estado, String país) {
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.cidade = cidade;
        this.estado = estado;
        this.país = país;
    }

    public void exibirDados() {
        System.out.println("Nome da Rua: " + rua);
        System.out.println("Digite seu número: " + numero);
        System.out.println("Digite seu CEP: " + CEP);
        System.out.println("Digite a sua cidade: " + cidade);
        System.out.println("Digite o seu Estado: " + estado);
        System.out.println("Digite seu País: " + país);
    }

}
