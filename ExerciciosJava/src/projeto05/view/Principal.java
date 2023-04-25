package projeto05.view;

import projeto05.business.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("*** REGISTRO DE AULA ***");

        System.out.println("Digite o nome da Disciplina: ");
        String nomeDisciplina = entrada.next();
        Disciplina disciplina = new Disciplina(nomeDisciplina);

        System.out.println("Digite o nome do Professor: ");
        String nomeProfessor = entrada.next();
        Professor professor = new Professor(nomeProfessor);

        Aula aula1 = new Aula(professor, disciplina);

        System.out.println("Informe a materia de hoje: ");
        String topico = entrada.next();
        Materia materia = new Materia(topico);
        aula1.setMateria(materia);

        System.out.println("Quantos alunos tem na sala? ");
        int qtdAlunos = entrada.nextInt();

        for(int i=0; i == qtdAlunos; i++){
            System.out.println("Nome do aluno: ");
            String nomeAluno = entrada.next();
            Aluno aluno = new Aluno(nomeAluno);
            aula1.inserirAluno(aluno);
        }
        System.out.println(aula1.retornarInfo());
    }

}
