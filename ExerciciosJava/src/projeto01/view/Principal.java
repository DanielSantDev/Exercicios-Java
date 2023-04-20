package projeto01.view;

import projeto01.business.*;

public class Principal {

    public static void main(String[] args) {

        System.out.printf("REVISAO POO");

        Aluno aluno1 = new Aluno("Daniel");
        System.out.printf(aluno1.saudar());

        Professor prof1 = new Professor("Rubens Lara");
        System.out.printf(prof1.saudar());

        Professor prof2 = new Professor("Davi Lara");
        System.out.println(prof2.saudar("Dr. "));

    }

}
