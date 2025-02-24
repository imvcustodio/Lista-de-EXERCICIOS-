/*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas 
trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora 
(valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família)
 e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. 
Ao final informe o nome, o salário bruto e o salário líquido do funcionário. */
import java.util.Scanner;

public class exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe o numero de peças 1: ");
        int PecaOne = scanner.nextInt();
        
        System.out.print("Informe o numero de peças 2: ");
        int PecaTwo = scanner.nextInt();
        
        System.out.print("Informe preço da peça 1: R$ ");
        double PriceOne = scanner.nextDouble();

        System.out.print("Informe preço da peça 2: R$ ");
        double PriceTwo = scanner.nextDouble();


        double TotalPecaOne = PecaOne*PriceOne;
        double TotalPecaTwo = PecaTwo*PriceTwo;

        double totalToPay = TotalPecaOne+TotalPecaTwo;

        
        System.out.printf("quantidade de peças One %d, cada uma no valor de: R$ %.2f%n", PecaOne, PriceOne);
        System.out.printf("quantidade de peças Two %d,  cada uma no valor de: R$ %.2f%n", PecaTwo, PriceTwo); 

        System.out.printf("O valor total da compra foi:  %.2f",totalToPay);


        scanner.close();
    }
}
       
