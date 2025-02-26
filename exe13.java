import java.util.Scanner;
public class exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a distancia que o carro X se encontra do carro Y: ");
        int distance = scanner.nextInt();

        int calc = distance*2;

        System.out.printf("O tempo necessario para o carro X tomar essa distancia é: %d Minutos",calc);



        scanner.close();
    }
}
