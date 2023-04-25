package projeto05.business;

public class Disciplina {
    String codigo, ementa, nome;

    public Disciplina(String nome) {
        this.nome = nome;
        this.codigo += 1;
        this.ementa = "Ementa não informada !";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
}
