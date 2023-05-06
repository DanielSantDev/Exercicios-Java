package prova01.business;

public class Venda {
    String Cliente;
    int codigoVenda;
    float valorTotal;

    public Venda(String cliente, int codigoVenda, float valorTotal) {
        Cliente = cliente;
        this.codigoVenda = codigoVenda;
        this.valorTotal = valorTotal;
    }
}
