import java.util.Scanner;

public class exe16 {
    /*Uni2Exe16 [2] Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml,
     garrafa de 600 ml e garrafa de 2 litros. Se um comerciante 
    compra uma determinada quantidade de cada formato, informe quantos litros de refrigerante ele comprou. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("quantidade de Latas de 350ml: ");
            double lata350 = scanner.nextDouble();

            System.out.print("quantidade de Latas de 600ml: ");
            double lata600 = scanner.nextDouble();

            System.out.print("quantidade de Garrafas de um litro: ");
            double lataLitro = scanner.nextDouble();

            double litragem = (lata350*0.350)+(lata600*0.600)+(lataLitro*1);

            System.out.printf("O usuario comprou: %.2f Litros de Refrigerante",litragem);

            


        scanner.close();
    }
}
