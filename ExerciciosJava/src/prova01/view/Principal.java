package prova01.view;

import business.Cliente;
import business.Produto;
import business.Venda;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int saida = 1, opcao;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Produto> produto = new ArrayList<>();
        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<Venda> venda = new ArrayList<>();

        do{
            System.out.println("\nSISTEMA DE VENDAS DE PRODUTOS\n");
            System.out.println("""
                    1 - CADASTRAR PRODUTO
                    2 - CADASTRAR CLIENTE
                    3 - REALIZAR UMA VENDA
                    4 - MOSTRAR VENDAS REALIZADAS""");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    produto.add(new Produto("Celular", "Samsung S10", 1, 1500.98f));
                    produto.add(new Produto("Monitor", "AOC", 2, 1889.98f));
                    produto.add(new Produto("Mouse", "Corsair", 3, 150));
                    produto.add(new Produto("Teclado", "Teclado mecanico Razer", 4, 198));
                    break;
                case 2:
                    cliente.add(new Cliente("Samuel", "47858712374", "Rua Mendeiros"));
                    cliente.add(new Cliente("Maria", "12348712374", "Rua Brasilia"));
                    cliente.add(new Cliente("Fernanda", "87859812374", "Rua Cruzeiro do Sul"));
                    cliente.add(new Cliente("Roberto", "48578912374", "Rua Campina Verde"));
                    break;
                case 3:
                    venda.add(new Venda("Maria", 1, 2051));
                    venda.add(new Venda("Fernanda",2, 3000));
                    venda.add(new Venda("Samuel",3, 5000));
                    venda.add(new Venda("Roberto",4, 1500));
                    break;
                case 4:
                    for(Venda u: venda ){
                        System.out.println(u.toString());
                    }
                    break;
                default:
                    System.out.println("ERRO! Tente novamente");
                    break;

            }
            System.out.println("Deseja continuar?\nDigite 0 para NAO\nDigite 1 para SIM\n");
            saida = teclado.nextInt();
        }while(saida == 1);

    }

}