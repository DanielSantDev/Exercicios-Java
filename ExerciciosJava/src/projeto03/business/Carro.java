package projeto03.business;

public class Carro extends Veiculo{

    protected int qtdPortas;

    public Carro(String nome, String fabricante, int ano) {
        super(nome, fabricante, ano);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void acelerar() {
        velocidade += 10;
    }
}
