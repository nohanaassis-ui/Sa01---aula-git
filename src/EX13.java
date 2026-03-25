
    import java.util.Scanner;

    public class EX13 {
        public static void main() {
            Scanner sc = new Scanner(System.in);
            double limiteTotal, utilizado, percentual;

            IO.println("Digite o total de dados disponíveis no seu plano (GB):");
            limiteTotal = sc.nextDouble();

            IO.println("Digite quanto você já utilizou (GB):");
            utilizado = sc.nextDouble();

            percentual = (utilizado / limiteTotal) * 100;

            IO.println("Você já utilizou " + percentual + "% da sua franquia.");

            if (percentual < 80) {
                IO.println("Uso dentro do limite");
            }
            else if (percentual >= 80 && percentual <= 100) {
                IO.println("Atenção: você está próximo do limite");
            }
            else {
                IO.println("Limite excedido");
            }
        }
    }
