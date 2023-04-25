package projeto06.business;

public class Hora extends Tempo{

    private int unidade;
    @Override
    public void incrementar(int horas) {
        this.setUnidade(this.getUnidade() + horas);
    }

    @Override
    public void decrementar(int horas) {
        this.setUnidade(this.getUnidade() - horas);
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
}
