package projeto05.business;

import java.util.ArrayList;

public class Aula {
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private Disciplina disciplina;
    private Materia materia;

    public Aula(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        alunos = new ArrayList<Aluno>();
    }

    public void inserirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String retornarInfo() {
        String info = "*** Infos da aula de hoje: ***\n";

        info += "Disciplina: " + disciplina.getCodigo();
        info += "\nProfessor: " + professor.getNome();
        info += "\nTópico da matéria: " + materia.getTopico();
        info += "\nAlunos presentes: ";

        // foreach ==> for (Object o: lst)
        for (Aluno nomeAlunos:
             alunos) {
            info += "\n- " + nomeAlunos.getNome();
        }
        return info;
    }
}
