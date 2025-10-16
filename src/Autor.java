import java.time.LocalDate;


public class Autor {
    private String id;
    private String nome;
    private LocalDate dataNascimento;


    public Autor(String id, String nome, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
