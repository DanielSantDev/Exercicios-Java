package projeto06.view;

import projeto06.business.Horario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("** DEFINA O HORARIO **");

        System.out.println("Digite as horas(h 00 ate 23): ");
        int h = entrada.nextInt();
        System.out.println("Digite os minutos(min 0 ate 59): ");
        int m = entrada.nextInt();

        Horario horario = new Horario(h, m);
        horario.getInfo();

    }
}
