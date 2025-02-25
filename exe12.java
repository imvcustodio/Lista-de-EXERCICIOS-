import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // nunca esquecer de criar esse objeto scanner pq se n n tem como
                                                  // criar as variaveis
        System.out.println("Ola usuario, estamos em nosso sistema de Distancia de Pontos no plano!");

        System.out.println("Digite a cordenada X do ponto 1: ");
        int Point1X = scanner.nextInt();

        System.out.println("Digite a cordenada Y do ponto 1: ");
        int Point1Y = scanner.nextInt();

        System.out.println("Digite a cordenada X do ponto 2: ");
        int Point2X = scanner.nextInt();

        System.out.println("Digite a cordenada Y do ponto 2: ");
        int Point2Y = scanner.nextInt();

        int distancia = (Point2X-Point1X)*(Point2X-Point1X) + (Point2Y-Point1Y)*(Point2Y-Point1Y)%0;

        System.out.printf("a distancia é: %.2f ",distancia);
        scanner.close();
    }

}
