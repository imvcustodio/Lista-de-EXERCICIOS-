import java.util.Scanner;

public class exe18 {
    /*Uni2Exe18 [2] Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Leia o comprimento
     e altura de uma parede (em metros)
     e escreva o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos metros tem de comprimento a sua parede: ");
        double comprimento= scanner.nextDouble();

        System.out.print("Quantos metros tem de altura a sua parede: ");
        double altura= scanner.nextDouble();

        double metroQuadradoParede = (comprimento*altura);

        double metroQuadradoAzulejo = (9*12.5);

        double Price = (metroQuadradoAzulejo*metroQuadradoParede);

        System.out.printf("O preço de azuleijos para a quantidade necessaria para sua parece é: R$ %.2f",Price);

        

        scanner.close();
    }
}
