package projeto02.business;

public abstract class Calculo {

    protected float valor1, valor2, resultado;

    public Calculo(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float getResultado() {
        return resultado;
    }

}
