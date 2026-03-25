
    import java.util.Scanner;

    public class EX09 {
        public static void main() {
            Scanner sc = new Scanner(System.in);
            double valorCompra, falta;
            double metaFrete = 100.0;

            IO.println("Digite o valor total da sua compra:");
            valorCompra = sc.nextDouble();

            if (valorCompra >= metaFrete) {
                IO.println("Parabéns! Você tem direito ao frete grátis.");
            } else {
                falta = metaFrete - valorCompra;
                IO.println("Você ainda não atingiu o frete grátis.");
                IO.println("Adicione mais R$ " + falta + " em produtos para ganhar o benefício.");
            }
        }
    }
