import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("digite o primeiro numero da Multiplicação");
        double NumOne = scanner.nextDouble();
        System.out.println("digite o primeiro segundo da Multiplicação");
        double Numtwo = scanner.nextDouble();

        double Multiplicação = NumOne*Numtwo;
        System.out.printf("A Multiplicação dos numeros %.2f e %.2f é: %.2f",NumOne,Numtwo,Multiplicação);
        
        scanner.close();

    }
    

}
