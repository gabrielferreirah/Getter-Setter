
import java.time.LocalDate;

/**
 * @author Alunos
 */
public class Filmes {

    private String titulo, tituloOriginal, generoMain, diretorMain, classificacao, idioma;
    private short anoLancamento;
    private double valorOrcamento, mediaPreco;
    private long valorFaturamento, espectadores;
    private LocalDate dataLancamentoBrasil;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setGeneroMain(String generoMain) {
        this.generoMain = generoMain;
    }

    public String getGeneroMain() {
        return generoMain;
    }

    public void setDiretorMain(String diretorMain) {
        this.diretorMain = diretorMain;
    }

    public String getDiretorMain() {
        return diretorMain;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setAnoLancamento(short anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public short getAnoLancamento() {
        return anoLancamento;
    }
    
    public void setValorFaturamento(long valorFaturamento){
        this.valorFaturamento = valorFaturamento;
    }
    
    public double getValorFaturamento(){
        return valorFaturamento;
    }
    
    public void setValorOrcamento(double valorOrcamento){
        this.valorOrcamento = valorOrcamento;
    }
    
    public double getValorOrcamento(){
        return valorOrcamento;
    }
    
    public void setMediaPreco(double mediaPreco){
        this.mediaPreco = mediaPreco;
    }
    
    public double getMediaPreco(){
        return mediaPreco;
    }
    
    public void setEspecadores (long espectadores){
        this.espectadores = espectadores;
    }
    
    public long getEspectadores(){
        return espectadores;
    }
    
    public void setDataLancamentoNoBrasil(LocalDate dataLancamentoBrasil){
        this.dataLancamentoBrasil = dataLancamentoBrasil;
    }
    
    public LocalDate getDataLancamentoBrasil(){
        return dataLancamentoBrasil;
    }

    void setMediaPreco(double d, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMediaPreco(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
