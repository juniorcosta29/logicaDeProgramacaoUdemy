package aulapratica1;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1,"Heraldo");
        Pessoa pessoa2 = new Pessoa(2, "Priscila");



        System.out.println("o nome objeto é: "+pessoa1.getNome());
        pessoa1.setNome("Eraldo");
        System.out.println("o nome objeto é: "+pessoa1.getNome());
    }
}
