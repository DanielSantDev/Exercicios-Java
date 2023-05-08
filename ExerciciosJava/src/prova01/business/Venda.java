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

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
