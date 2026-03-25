void main() {

    int idadepermitida = 18;

    Scanner sc = new Scanner(System.in);
    IO.println("Bem vindo ao ínicio do LOWBAPALOOZA");
    IO.println("");

    IO.println("Qual é a sua idade ?");

    int idade = sc.nextInt();

    if (idade >= idadepermitida) {
        IO.println("Seu acesso foi permitido! Você pode participar do evento.");

    }else{
        IO.println("Infelizmente seu acesso foi negado. (Menor de idade )");

    }
}