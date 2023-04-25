package projeto05.business;

public class Materia {
    String topico, descricao;

    public Materia(String topico) {
        this.topico = topico;
        this.descricao = "Não informada!";
    }

    public String getTopico() {
        return topico;
    }

    public String getDescricao() {
        return descricao;
    }
}
