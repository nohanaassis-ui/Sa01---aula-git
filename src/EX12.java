void main() {

    Scanner sc = new Scanner(System.in);

    IO.println("Bem vindo ao ProRso");
    IO.println("");
    IO.println("Qual o total de aulas no seu curso? (Ex: 150");

    int totalaulas = sc.nextInt();
    IO.println("Quantas aulas você assitiu");
    int realizadas = sc.nextInt();

    double porcentagem = (realizadas * 100.0 / totalaulas);

    String resultado = String.format("%.1f", porcentagem);
    IO.println("Progresso do curso = " + resultado + " %concluído. ");

    if(porcentagem <50) {
        IO.println("Você  ainda está no começo do curso ");

    } else if (porcentagem <100) {
        IO.println("Você está bem avançado ");

    }else{
        IO.println("Parabéns ! Curso aplicado ");
    }
}