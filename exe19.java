import java.util.Scanner;

public class exe19 {
    /*Uni2Exe18 [2] Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Leia o comprimento
     e altura de uma parede (em metros)
     e escreva o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o valor de B: ");
        double equacaoB = scanner.nextDouble();

        System.out.print("Qual o valor de C: ");
        double equacaoC = scanner.nextDouble();

        System.out.print("Qual o valor de D: ");
        double equacaoD = scanner.nextDouble();

        double equacaoA = equacaoB;

        System.out.printf("o valo de a é: %.2f",equacaoA);

        scanner.close();
    }
}
