package projeto07.business;

public class Biblioteca {
    String nome, endereco;
    int livrosDisponiveis;

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

    public int getLivrosDisponiveis() {
        return livrosDisponiveis;
    }

    public void setLivrosDisponiveis(int livrosDisponiveis) {
        this.livrosDisponiveis = livrosDisponiveis;
    }
}
