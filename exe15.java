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

        int money = (int) valor; // Pego somente parte inteira do valor digitado pelo usuario
        int centavos = (int) Math.round((valor - money) * 100); // aqui eu subtraio do valor total, somente a parte inteira para que 
        //fique mais facil de conseguir fazer os calculo com os centavos, apos isso eu multiplico por 100, para fica um num inteiro e poder fazer as 
        // divisoes sem numeros doubles somente com valores inteiros como, 50 para 50 centavos, 25 pra 25 centavos e etc.

        int N100 = money / 100; // divido o valor inteiro por 100 e armazeno o valor de quantidade de divisoes possiveis na var N100(qnt de nota 100)
        money %= 100;//caso a divisao fo 299/100 = 2 pois o resto n e divisivel por 100 ent o money recebe o resto da divisao por 100 no caso 99

        int N50 = money / 50;
        money %= 50;

        int N20 = money / 20;
        money %= 20;

        int N10 = money / 10;
        money %= 10;

        int N5 = money / 5;
        money %= 5;

        int N2 = money / 2;
        money %= 2;

        int M1 = money;

        int M0_5 = centavos / 50;
        centavos %= 50;

        int M0_25 = centavos / 25;
        centavos %= 25;

        int M0_10 = centavos / 10;
        centavos %= 10;

        int M0_05 = centavos / 5;
        centavos %= 5;

        int M0_01 = centavos;

        System.out.printf("O numero exibido foi: %d\n", money);
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