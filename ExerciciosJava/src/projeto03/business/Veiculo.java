package projeto03.business;

public abstract class Veiculo {

    protected String nome, fabricante;
    protected int ano, velocidade;

    public Veiculo(String nome, String fabricante, int ano) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(){
        velocidade += 5;
    }

    public void desacelerar(){
        velocidade -= 5;
    }

    public void parar(){
        velocidade = 0;
    }

    public String retornarInfo() {
        return String.format("Veículo: %s; velocidade atual: %dkm/h.",
                nome, velocidade);
    }

}
