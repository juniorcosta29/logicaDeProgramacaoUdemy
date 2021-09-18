package aulapratica2;

import aulapratica1.Pessoa;

public class ClienteAPP {

    public static void main(String[] args) {
        ClientePF clientepf1 = new ClientePF("Eraldo Junior","Bairro: Lobato", "855304334455");
        ClientePJ clientepj1 = new ClientePJ("Priscila Passos","Bairro: Vilas", "2554544544445574");

        System.out.println("Cliente PF dados é: "+clientepf1.getNome()+" | " +clientepf1.getEndereco()+ " | "+clientepf1.getCpf());
        System.out.println("Cliente PJ dados é: "+clientepj1.getNome()+" | " +clientepj1.getEndereco()+ " | "+clientepj1.getCnpj());

    }
}

