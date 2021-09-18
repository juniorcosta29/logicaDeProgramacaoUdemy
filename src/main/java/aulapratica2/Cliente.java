package aulapratica2;

public class Cliente {
    private String nome;
    private String endereco;


    public Cliente(String nome, String endereco) {
        this.endereco = endereco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
