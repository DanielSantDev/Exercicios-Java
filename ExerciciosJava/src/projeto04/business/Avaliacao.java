package projeto04.business;

public class Avaliacao implements IMedia, IPresenca{

    private float mediaFinal, percentualPresenca;

    public float getMediaFinal() {
        return mediaFinal;
    }

    public float getPercentualPresenca() {
        return percentualPresenca;
    }

    public boolean isAlunoAprovado() {
        return (mediaFinal >= 6 && percentualPresenca >= 75);
    }

    public void calcularMedia(float p1, float p2, float p3){
        mediaFinal = (p1 + p2 + p3) / 3;
    }

    public void calcularPercentualPresenca(int totalAulas, int qtdePresencas){
        percentualPresenca = (float) qtdePresencas / (float) totalAulas * 100;
    }
}