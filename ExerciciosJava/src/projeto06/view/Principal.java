package projeto06.view;

import projeto06.business.Horario;

import java.util.Objects;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continua;
        System.out.println("** DEFINA O HORARIO **");

        System.out.println("Digite as horas(00h ate 23h): ");
        int h = entrada.nextInt();
        System.out.println("Digite os minutos(0min ate 59min): ");
        int m = entrada.nextInt();

        Horario horario = new Horario(h, m);
        horario.getInfo();

        do {
            System.out.println("\n1 - Para adicionar 1h\n2 - Para subtrair 1h\n3 - Para adicionar 1min\n" +
                    "4 - Para subtrair 1min");
            int opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    if (horario.hora.getUnidade() >= 23) {
                        horario.hora.setUnidade(00);
                    } else {
                        horario.hora.incrementar(1);
                    }
                    break;
                case 2:
                    horario.hora.decrementar(1);
                    break;
                case 3:
                    if (horario.minuto.getUnidade() >= 59) {
                        horario.minuto.setUnidade(0);
                        horario.hora.setUnidade(horario.hora.getUnidade() + 1);
                    } else {
                        horario.minuto.incrementar(1);
                    }
                    break;
                case 4:
                    horario.minuto.decrementar(1);
                default:
                    System.out.println("Erro!");
                    break;
            }
            horario.getInfo();
            System.out.println("Deseja continuar? (sim/nao)");
            continua = entrada.next();
        } while (Objects.equals(continua, "sim"));
    }
}