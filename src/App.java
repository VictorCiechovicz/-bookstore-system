import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.inicializarSistema();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean escolhaDeLivros = true;

        while (escolhaDeLivros) {
            System.out.println("Deseja ver a lista de livros? (Y/N)");
            String escolha = scanner.next();

            if (escolha.equalsIgnoreCase("Y")) {
                List<Livro> l = biblioteca.getLivros();

                System.out.println("=== Lista de Livros Disponíveis ===");
                boolean temLivroDisponivel = false;
                for (Livro livro : l) {
                    if (livro.disponivel) {
                        System.out.printf("ID.: %s | TÍTULO.: %s | AUTOR.: %s%n", livro.id, livro.titulo, livro.autor);
                        temLivroDisponivel = true;
                    }
                }

                if (!temLivroDisponivel) {
                    System.out.println("Nenhum livro disponível.");
                    break;
                }

                System.out.println("===================");
                System.out.println("Qual livro deseja retirar? (Informe o ID)");
                String idLivroRetirado = scanner.next();
                System.out.println("Informe seu nome:");
                String nomeUsuario = scanner.next();

                boolean emprestimoFeito = false;
                for (Livro livro : l) {
                    if (livro.id.equals(idLivroRetirado) && livro.disponivel) {
                        livro.disponivel = false;
                        emprestimoFeito = true;
                        break;
                    }
                }

                if (emprestimoFeito) {
                    System.out.println("Empréstimo realizado com sucesso! " + nomeUsuario);
                } else {
                    System.out.println("Livro não encontrado ou indisponível.");
                }

                System.out.println("Deseja reservar outro livro? (Y/N)");
                String againReserv = scanner.next();
                escolhaDeLivros = againReserv.equalsIgnoreCase("Y");

            } else {
                escolhaDeLivros = false;
                System.out.println("Sistema encerrado.");
            }
        }

        scanner.close();
    }
}
