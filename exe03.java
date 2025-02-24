import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("digite o RAIO da circunferencia para calcular a area:");
        double Raio = scanner.nextDouble();
    

        double Area = (Raio*Raio)*3.14159;
        System.out.printf("A Ares da circunferencia para o raio %.2f é: %.2f",Raio,Area);
        
        scanner.close();

    }
    

}
