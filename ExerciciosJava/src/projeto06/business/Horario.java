package projeto06.business;

public class Horario {
    private Hora hora;
    private Minuto minuto;

    public Horario(int h, int m) {
        this.hora = new Hora();
        this.hora.setUnidade(h);
        this.minuto = new Minuto();
        this.minuto.setUnidade(m);
    }

    public void getInfo(){
        System.out.println("HORARIO: " + this.hora.getUnidade() +"h"+ this.minuto.getUnidade()+"min");
    }


}
