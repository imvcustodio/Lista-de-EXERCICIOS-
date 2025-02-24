import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        double NumOne = scanner.nextDouble();
        System.out.println("digite o segundo numero");
        double Numtwo = scanner.nextDouble();
        System.out.println("digite o Terceiro numero");
        double Numtree = scanner.nextDouble();
        System.out.println("digite o Quarto numero");
        double Numfour = scanner.nextDouble();


        double Diferença = (NumOne*Numtwo - Numtree*Numfour);
        System.out.printf("A Diferença dos numeros %.2f, %.2f, %.2f e %.2f é: %.2f",NumOne,Numtwo,Numtree,Numfour,Diferença);
        
        scanner.close();

    }
    

}
