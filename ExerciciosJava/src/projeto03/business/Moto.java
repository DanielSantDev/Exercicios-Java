package projeto03.business;

public class Moto extends Veiculo {

    boolean descansoAcionado;

    public Moto(String nome, String fabricante, int ano) {
        super(nome, fabricante, ano);
    }

    public boolean isDescansoAcionado() {
        return descansoAcionado;
    }

    @Override
    public void acelerar(){
        super.acelerar();
        descansoAcionado = false;
    }

    @Override
    public void desacelerar() {
        super.desacelerar();
        descansoAcionado = (velocidade == 0);
    }

    @Override
    public void parar() {
        super.parar();
        descansoAcionado = true;
    }
}
