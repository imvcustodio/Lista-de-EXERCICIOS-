import java.util.Scanner;
public class exe14 {
    //Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o 
    //valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre
    // o valor lido e a relação de notas necessárias.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor para convertemos em notas: ");
        int Num = scanner.nextInt();
        int Rest = Num;
        
        int N100 = Num/100;
        Rest = Rest%100;

        int N50 = Rest/50;
        Rest = Rest%50;

        int N20 = Rest/20;
        Rest = Rest%20;

        int N10 = Rest/10;
        Rest = Rest%10;
    
        int N5 = Rest/5;
        Rest = Rest%5;

        int N2 = Rest/2;
        Rest = Rest%2;

        int N1 = Rest/1;
        
        
        System.out.printf("O numero exibido foi: %d\n",Num);
        System.out.printf("O numero de notas de 100 foi: %d\n",N100);
        System.out.printf("O numero de notas de 50 foi: %d\n",N50);
        System.out.printf("O numero de notas de 20 foi: %d\n",N20);
        System.out.printf("O numero de notas de 10 foi: %d\n",N10);
        System.out.printf("O numero de notas de 5 foi: %d\n",N5);
        System.out.printf("O numero de notas de 2 foi: %d\n",N2);
        System.out.printf("O numero de notas de 1 foi: %d\n",N1);
        scanner.close();
    }
}
