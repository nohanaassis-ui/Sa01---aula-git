
    import java.util.Scanner;
    import java.util.Scanner;

    public class EX06 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double meta, realizada, diferenca;

            meta = 40.0;

            IO.println("Digite a quantidade de horas que você estudou:");
            realizada = sc.nextDouble();

            if (realizada >= meta) {
                IO.println("Meta atingida!");
                diferenca = realizada - meta;
                IO.println("Diferença: " + diferenca);
            } else {
                IO.println("Meta não atingida.");
                diferenca = meta - realizada;
                IO.println("Faltaram: " + diferenca);
            }
        }
    }