package projeto01.business;

public class Professor extends Pessoa{

    public Professor(String nome){
        super(nome);
    }

    public String saudar(){
        return super.saudar() + ", sou professor da disciplina de hoje.\n";
    }

    public String saudar(String tratamento){
        return String.format(" -> Olah, meu nome eh prof. %s %s.\n", tratamento, nome);
    }

}
