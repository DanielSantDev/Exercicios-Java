package projeto05.business;

public class Aluno extends Pessoa{

    int matricula;

    public Aluno(String nome) {
        super(nome);
        this.matricula = 0;
    }

    public int getMatricula() {
        return matricula;
    }
}
