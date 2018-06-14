
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Alunos
 */
public class FilmesJUnitTest {

    @Test
    public void testeDefinirEObterTitulo() {
        Filmes avatar = new Filmes();
        avatar.setTitulo("Avatar");
        assertEquals("Avatar", avatar.getTitulo());
    }

    @Test
    public void testeDefinirEObterTituloOriginal() {
        Filmes avatar0 = new Filmes();
        avatar0.setTituloOriginal("Avatar");
        assertEquals("Avatar", avatar0.getTituloOriginal());
    }

    @Test
    public void testeDefinirEObterGeneroMain(){
        Filmes avatar1 = new Filmes();
        avatar1.setGeneroMain("Ficção Científica");
        assertEquals("Ficção Científica", avatar1.getGeneroMain());
    }

    @Test
    public void testeDefinirEObterDiretorMain() {
        Filmes avatar2 = new Filmes();
        avatar2.setDiretorMain("James Cameron");
        assertEquals("James Cameron", avatar2.getDiretorMain());
    }
    
    @Test
    public void testeDefinirEObterClassificção() {
        Filmes avatar3 = new Filmes();
        avatar3.setClassificacao("12 Anos");
        assertEquals("12 Anos", avatar3.getClassificacao());
    }
    
    @Test
    public void testeDefinirEObterIdade() {
        Filmes avatar4 = new Filmes();
        avatar4.setIdioma("Inglês");
        assertEquals("Inglês", avatar4.getIdioma());
    }
    
    @Test
    public void testeDefinirEObterAnoLancamento() {
        Filmes avatar5 = new Filmes();
        avatar5.setAnoLancamento((short) 2009);
        assertEquals(2009, avatar5.getAnoLancamento());
    }
    
    @Test
    public void testeDefinirEObterMediaPreco(){
        Filmes avatar6 = new Filmes();
        avatar6.setMediaPreco(30.5);
        assertEquals(30.5, avatar6.getMediaPreco(), 0);
    }
    
    @Test
    public void testeDefinirEObterValorOrcamento() {
        Filmes avatar7 = new Filmes();
        avatar7.setValorOrcamento(273000000l);
        assertEquals(273000000l, avatar7.getValorOrcamento(), 0);
    }
    
    @Test
    public void testeDefinirEObterValorFaturamento() {
        Filmes avatar8 = new Filmes();
        avatar8.setValorFaturamento(2787965087l);
        assertEquals(2787965087l, avatar8.getValorFaturamento(), 0);
    }
    
    @Test
    public void testeDefinirEObterEspectadores() {
        Filmes avatar9 = new Filmes();
        avatar9.setEspecadores(10000000l);
        assertEquals(10000000l, avatar9.getEspectadores(), 0);
    }
}
