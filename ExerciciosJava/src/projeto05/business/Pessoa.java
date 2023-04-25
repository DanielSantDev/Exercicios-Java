package projeto05.business;

public abstract class Pessoa {
    protected String nome, email;

    public Pessoa(String nome) {
        this.nome = nome;
        this.email = "Nao informado !";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
}
