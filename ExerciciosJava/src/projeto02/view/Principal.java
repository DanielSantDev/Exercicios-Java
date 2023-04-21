package projeto02.view;

import projeto02.business.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        boolean positivo=true;
        int opc;
        float a, b, resultado;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite o primeiro valor: ");
            a = entrada.nextFloat();
            System.out.println("Digite o segundo valor: ");
            b = entrada.nextFloat();
            System.out.println("1 - Adicao\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\nEscolha uma opcao: ");
            opc = entrada.nextInt();
            if (opc < 1 || opc > 4) {
                System.err.println("Opção inválida.");
                return;
            }
            switch(opc) {
                case 1:
                    Adicao adicao = new Adicao(a, b);
                    adicao.calcular();
                    resultado = adicao.getResultado();
                    System.out.println("Resultado: " + adicao.getResultado());
                    break;
                case 2:
                    Subtracao subtracao = new Subtracao(a, b);
                    subtracao.calcular();
                    System.out.println("Resultado: " + subtracao.getResultado());
                    break;
                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao(a, b);
                    multiplicacao.calcular();
                    System.out.println("Resultado: " + multiplicacao.getResultado());
                    break;
                case 4:
                    Divisao divisao = new Divisao(a, b);
                    divisao.calcular();
                    System.out.println("Resultado: " + divisao.getResultado());
                    break;
                default:
                    System.out.println("ERRO");
                    break;
            }

            System.out.println("Deseja Continuar? True or False?");
            positivo = entrada.nextBoolean();
        } while(positivo);

    }

}
