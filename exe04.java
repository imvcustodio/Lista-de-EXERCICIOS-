import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Ponto 1: ");
        double NumOne = scanner.nextDouble();
        System.out.print("Ponto 2: ");
        double Numtwo = scanner.nextDouble();

        double Media = (NumOne*3.5 + Numtwo*7.5)/11;
        
        System.out.printf("A Media dos numeros %.2f e %.2f é: %.2f",NumOne,Numtwo,Media);
        
        scanner.close();

    }
    

}
