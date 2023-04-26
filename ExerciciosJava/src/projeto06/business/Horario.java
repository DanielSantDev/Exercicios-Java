package projeto06.business;

public class Horario {
    public Hora hora;
    public Minuto minuto;

    public Horario(int h, int m) {
        this.hora = new Hora();
        this.hora.setUnidade(h);
        this.minuto = new Minuto();
        this.minuto.setUnidade(m);
    }

    public void getInfo(){
        System.out.println("HORARIO: " + this.hora.getUnidade() +"h"+ this.minuto.getUnidade()+"min");
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public Minuto getMinuto() {
        return minuto;
    }

    public void setMinuto(Minuto minuto) {
        this.minuto = minuto;
    }
}
