
import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("INFORME O VALOR DO PONTO A: ");
        double pointA = scanner.nextDouble();
        System.out.println("INFORME O VALOR DO PONTO B: ");
        double pointB = scanner.nextDouble();
        System.out.println("INFORME O VALOR DO PONTO C: ");
        double pointC = scanner.nextDouble();

        //A)area do triangulo que tem a por base e c por altura
        Double area = (pointA*pointC)/2;

        //b) a área do círculo de raio C. (pi = 3.14159).
        Double circle = (pointC*pointB)*3.14159;

        //c) a área do trapézio que tem A e B por bases e C por altura.
        Double areaTrapezio = ((pointA+pointB)* pointC)/2;
        
        //d) a área do quadrado que tem lado B.
        Double square = pointB*pointB;

        //e) a área do retângulo que tem lados A e B.
        Double retangulo = pointA*pointB;

        System.out.printf("area do triangulo que tem a por base e c por altura é: %.2f\n",area);

        System.out.printf("a área do círculo de raio C. (pi = 3.14159). é: %.2f\n",circle);

        System.out.printf("a área do trapézio que tem A e B por bases e C por altura é: %.2f\n",areaTrapezio);

        System.out.printf("a área do quadrado que tem lado B é: %.2f\n",square);

        System.out.printf("a área do retângulo que tem lados A e B é: %.2f\n",retangulo);
        scanner.close();
    }
}
