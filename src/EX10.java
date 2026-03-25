
    import java.util.Scanner;

    public class EX10 {
        public static void main() {
            Scanner sc = new Scanner(System.in);
            int totalPaginas = 300;
            int paginasLidas;
            double percentual;

            IO.println("Quantas páginas você já leu?");
            paginasLidas = sc.nextInt();

            percentual = ((double) paginasLidas / totalPaginas) * 100;

            IO.println("Você já concluiu " + percentual + "% do livro.");

            if (percentual >= 100) {
                IO.println("Parabéns! Você terminou a leitura.");
            } else {
                int faltam = totalPaginas - paginasLidas;
                IO.println("Ainda faltam " + faltam + " páginas para o fim.");
            }
        }
    }
