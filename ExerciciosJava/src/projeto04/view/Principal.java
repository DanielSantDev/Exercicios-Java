package projeto04.view;

import projeto04.business.Avaliacao;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Digite a nota 2: ");
        float nota2 = entrada.nextFloat();
        System.out.println("Digite a nota 3: ");
        float nota3 = entrada.nextFloat();

        System.out.println("Digite o total de aulas do Semestre: ");
        int totalAulas = entrada.nextInt();
        System.out.println("Digite o total de presencas: ");
        int totalPresenca = entrada.nextInt();

        Avaliacao avalia = new Avaliacao();

        avalia.calcularPercentualPresenca(totalAulas, totalPresenca);
        avalia.calcularMedia(nota1, nota2, nota3);
        System.out.println("Media: " + avalia.getMediaFinal());
        System.out.println("Presenca: "+ avalia.getPercentualPresenca());
        if (avalia.isAlunoAprovado()){
            System.out.println("O aluno foi aprovado !!! ");
        } else {
            System.out.println("O aluno foi reprovado !!!");
        }

    }

}
