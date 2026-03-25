
       import java.util.Scanner;

    public class EX05 {
        void main() {
            Scanner leitor = new Scanner(System.in);

            double meta = 500.00;

            System.out.print("Quanto você conseguiu guardar este mês?  ");
            double guardado = leitor.nextDouble();

            // Lógica de verificação
            if (guardado >= meta) {
                System.out.println("Parabéns! Você conseguiu atingir o objetivo!");

                // Verificação extra: se ultrapassou a meta
                if (guardado > meta) {
                    double sobra = guardado - meta;
                    System.out.printf("Você superou a meta em R$ ", sobra);
                }
            } else {
                double falta = meta - guardado;
                System.out.printf("Ainda não foi desta vez. Faltaram R$ %.2f para alcançar a meta.%n", falta);
            }
        }

    }

