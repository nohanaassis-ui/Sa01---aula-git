import java.util.Scanner;

public class EX04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int passos, passosrestantes, passosextras, passosmeta;

        passosmeta = 10000;

        IO.println("Digite quantos passoos vc deu hoje ao total");
        passos = sc.nextInt();

        if (passos == passosmeta) {
            IO.println("Você atingou sua meta ");

        } else if (passos < passosmeta) {
            IO.println("Você não atingiu sua meta faltam : ");
            passosrestantes = passosmeta - passos;
            IO.println("Faltam " + passosrestantes);

        } else {
            IO.println("Você ultrapassou sua meta : ");
            passosrestantes = passos - passosmeta;
            IO.println("Sobraram " + passosrestantes);


        }
    }
}