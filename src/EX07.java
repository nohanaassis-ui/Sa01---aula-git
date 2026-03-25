
import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        IO.println("Digite a nota do aluno:");
        nota = sc.nextDouble();

        if (nota >= 7.0) {
            IO.println("Aprovado");
        } else {
            IO.println("Reprovado");
        }
    }
}