package projeto03.view;

import projeto03.business.*;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int opc;
        Scanner entrada = new Scanner(System.in);

        System.out.println("GARAGEM COM OOP");
        System.out.println("Escolha a opcao:\n1 - Carro\n2 - Moto\nopc = ");
        opc = entrada.nextInt();

        System.out.print("Informe o modelo: ");
        String modelo = entrada.next();
        System.out.print("Informe o fabricante: ");
        String fabricante = entrada.next();
        System.out.print("Informe o ano de fabricação: ");
        int ano = entrada.nextInt();

        //upcasting
        Veiculo veiculo = null;

        switch (opc) {
            case 1:
                System.out.print("Informe a quantidade de portas: ");
                int qtdePortas = entrada.nextInt();
                //Carro carro = new Carro(modelo, fabricante, ano);
                //upcasting
                veiculo = new Carro(modelo, fabricante, ano);
                break;
            case 2:
                //Moto moto = new Moto(modelo, fabricante, ano);
                //upcasting
                veiculo = new Moto(modelo, fabricante, ano);
                break;
            default:
                throw new IllegalArgumentException("Veículo indisponível");
        }

        // utilizando upcasting, é possível utilizar o mesmo código,
        // independentemente de qual veículo foi instanciado

        veiculo.acelerar();
        System.out.println(veiculo.retornarInfo());
        veiculo.acelerar();
        System.out.println(veiculo.retornarInfo());
        veiculo.acelerar();
        System.out.println(veiculo.retornarInfo());
        veiculo.acelerar();
        System.out.println(veiculo.retornarInfo());
        veiculo.desacelerar();
        System.out.println(veiculo.retornarInfo());
        veiculo.desacelerar();
        System.out.println(veiculo.retornarInfo());
        veiculo.parar();
        System.out.println(veiculo.retornarInfo());
    }

}
