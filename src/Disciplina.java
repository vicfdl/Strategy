public class Disciplina {
    ICalcMedia calcMedia;
    double media;
    double P1;
    double P2;
    String situacao;
    String nome;

    public ICalcMedia getCalcMedia() {
        return calcMedia;
    }
    public void setCalcMedia(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public double getP1() {
        return P1;
    }
    public void setP1(double p1) {
        P1 = p1;
    }
    public double getP2() {
        return P2;
    }
    public void setP2(double p2) {
        P2 = p2;
    }
    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina (){

    }

    public Disciplina(ICalcMedia calcMedia) {
        this.calcMedia = calcMedia;
    }
    
    public double CalcularMedia()
    {
        this.media = calcMedia.CalculaMedia(this.P1, this.P2);
        this.situacao = calcMedia.Situacao(this.media);
        return this.media;
    }
    
}
