package projeto05.business;

public class Professor extends Pessoa{

    int registro;

    public Professor(String nome) {
        super(nome);
        this.registro += 1;
    }

    public int getRegistro() {
        return registro;
    }
}
