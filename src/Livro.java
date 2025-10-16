import java.time.LocalDate;
import java.time.LocalDateTime;

public class Livro {
    String id;
    String titulo;
    String autor;
    boolean disponivel;
    LocalDate dataCadastro;
    LocalDateTime dataAtualizacao;


    public Livro(String id, String titulo, String autor, boolean disponivel, LocalDate dataCadastro, LocalDateTime dataAtualizacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;

    }
}
