package projeto01.business;

public abstract class Pessoa {

    String nome, email;

    public Pessoa(String nome) {
        this.nome = nome;
        this.email = "nao informado";
    }

    public String saudar(){
        return String.format("Ola a todos, meu nome eh %s.\n", nome);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
