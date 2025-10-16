import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();


    private void gerarAutor() {
        Autor a1 = new Autor("1", "Fabricio Andrade", LocalDate.of(1990, 5, 12));
        Autor a2 = new Autor("2", "Manuela Ilhabela", LocalDate.of(2003, 5, 12));
        autores.add(a1);
        autores.add(a2);

    }

    private void gerarLivros() {
        Livro l1 = new Livro("1", "Mundo encantado", "Fabricio Andrade", true, LocalDate.now(), LocalDateTime.now());
        Livro l2 = new Livro("2", "Mundo desencantado", "Manuela Ilhabela", true, LocalDate.now(), LocalDateTime.now());
        Livro l3 = new Livro("2", "Bela e a Fera", "Manuela Ilhabela", false, LocalDate.now(), LocalDateTime.now());
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

    }

    public void inicializarSistema() {
        gerarAutor();
        gerarLivros();
    }

    public List<Livro> getLivros() {
        return livros;
    }


}
