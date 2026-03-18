import java.util.Scanner;

public class EX01{}
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite o nome do aluno");
        String nome = sc.next();

        IO.println("Qual é o curso que você está matriculado?");
        String curso = sc.next();

        IO.println("Qual é a sua idade ?");
        int  idade = sc.nextInt();

        IO.println("Cadastro finalizado com sucesso." );
        IO.println("Seu nome é " +nome );
        IO.println("Está matriculado no curso de " +curso);
        IO.println("A sua idade é "  +idade);

}