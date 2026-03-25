
    import java.util.Scanner;

    public class EX11 {
        public static void main() {
            Scanner sc = new Scanner(System.in);
            double totalGB = 2.0;
            double baixado;
            double percentual;

            IO.println("Digite quantos GB já foram baixados:");
            baixado = sc.nextDouble();

            percentual = (baixado / totalGB) * 100;

            IO.println("Progresso do download: " + percentual + "%");

            if (percentual >= 100) {
                IO.println("Download concluído com sucesso!");
            } else {
                double falta = totalGB - baixado;
                IO.println("Ainda faltam " + falta + " GB para terminar.");
            }
        }
    }
