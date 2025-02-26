import java.util.Scanner;

public class exe15 {
    /*
     * Leia um valor de ponto flutuante com duas casas decimais. Este valor
     * representa um valor monetário. A seguir, calcule o menor número de notas
     * e moedas possíveis no qual o valor pode ser decomposto.
     * As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são
     * de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
     * necessárias.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para passarmos a relação de nota(s): ");
        double valor = scanner.nextDouble();

        int Money = (int) valor; // Parte inteira (notas)
        int centavos = (int) Math.round((valor - Money) * 100); // Parte decimal convertida para centavos

        int N100 = Money / 100;
        Money %= 100;

        int N50 = Money / 50;
        Money %= 50;

        int N20 = Money / 20;
        Money %= 20;

        int N10 = Money / 10;
        Money %= 10;

        int N5 = Money / 5;
        Money %= 5;

        int N2 = Money / 2;
        Money %= 2;

        int M1 = Money;

        int M0_5 = centavos / 50;
        centavos = centavos % 50;

        int M0_25 = centavos / 25;
        centavos = centavos % 25;

        int M0_10 = centavos / 10;
        centavos = centavos % 10;

        int M0_05 = centavos / 5;
        centavos = centavos % 5;

        int M0_01 = centavos;

        System.out.printf("O numero exibido foi: %d\n", Money);
        System.out.printf("O numero de notas de 100 foi: %d\n", N100);
        System.out.printf("O numero de notas de 50 foi: %d\n", N50);
        System.out.printf("O numero de notas de 20 foi: %d\n", N20);
        System.out.printf("O numero de notas de 10 foi: %d\n", N10);
        System.out.printf("O numero de notas de 5 foi: %d\n", N5);
        System.out.printf("O numero de notas de 2 foi: %d\n", N2);
        System.out.println("Agora a relaçao das moedas!");
        System.out.printf("O numero de moedas de 1 foi: %d\n", M1);
        System.out.printf("O numero de moedas de 0,50 foi: %d\n", M0_5);
        System.out.printf("O numero de moedas de 0,25 foi: %d\n", M0_25);
        System.out.printf("O numero de moedas de 0,10 foi: %d\n", M0_10);
        System.out.printf("O numero de moedas de 0,5 foi: %d\n", M0_05);
        System.out.printf("O numero de moedas de 0,1 foi: %d\n", M0_01);

        scanner.close();
    }
}
