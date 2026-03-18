import java.util.Scanner;
import java.util.StringTokenizer;

public class EX03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println( " Nome do jogador");
        String nome = sc.nextLine();

        IO.println("Seu jogo favorito");
        String jogo = sc.nextLine();

        IO.println("Pontuação atual");
        double pontuacao = sc.nextDouble();

        IO.println("Informações do perfil gamer");
        IO.println( "O nome do jogador(a) é " +nome);
        IO.println( "O jogo favorito será " +jogo);
        IO.println("A pontuação atual do jogo é " +pontuacao);
    }
}