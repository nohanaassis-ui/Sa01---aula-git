import java.util.Scanner;

public class EX02 {
    void main (){

        Scanner sc = new Scanner(System.in);
        IO.println("Digite seu nome");
        String nome = sc.next();

        IO.println("Prato escolhido");
        String menu = sc.next();

        IO.println("Valor do prato");
        double valor = sc.nextDouble();


        IO.println("Confirmação do pedido");
        IO.println("Cliente " +nome);
        IO.println("Prato desejado " +menu);
        IO.println("Valor final "+valor);
        IO.println("Compra finaizada com sucesso !");
    }
}