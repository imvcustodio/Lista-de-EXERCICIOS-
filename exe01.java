import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("digite o primeiro numero da soma");
        double NumOne = scanner.nextDouble();
        System.out.println("digite o primeiro segundo da soma");
        double Numtwo = scanner.nextDouble();

        double soma = NumOne+Numtwo;
        System.out.printf("A soma dos numeros %.2f e %.2f é: %.2f",NumOne,Numtwo,soma);
        
        scanner.close();

    }
    

}
