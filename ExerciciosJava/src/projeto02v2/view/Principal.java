package projeto02v2.view;

import projeto02v2.business.*;
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
            System.out.println("1 - Adicao\n2 - Subtracao\n3 - Divisao\n4 - Multiplicacao\nEscolha uma opcao: ");
            opc = entrada.nextInt();
            if (opc < 1 || opc > 4) {
                System.err.println("Opção inválida.");
                return;
            }

            //declara objeto da superclasse para utilizar como upcasting
            Calculo objCalc = null;

            switch(opc) {
                case 1: objCalc = new Adicao(a, b); break;
                case 2: objCalc = new Subtracao(a, b); break;
                case 3: objCalc = new Divisao(a, b); break;
                case 4: objCalc = new Multiplicacao(a, b); break;
            }
            objCalc.calcular();
            System.out.println("Resultado: " + objCalc.getResultado());
            System.out.println("Deseja Continuar? True or False?");
            positivo = entrada.nextBoolean();
        } while(positivo);

    }

}
