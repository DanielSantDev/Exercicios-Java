package projeto06.business;

public class Minuto extends Tempo{
    private int unidade;

    @Override
    public void incrementar(int minutos) {
        this.setUnidade(this.getUnidade() + minutos);
    }

    @Override
    public void decrementar(int minutos) {
        this.setUnidade(this.getUnidade() - minutos);
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
}
