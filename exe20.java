import java.util.Scanner;

public class exe20 {
    /*Uni2Exe20 [2] Considere que você tenha um papel quadrado e o dobre varias vezes sempre em um número par de dobra
     no meio do quadrado. Ao abrir a folha de papel é possível verificar a marcação de novos quadrados. Baseado nisso 
     leia o número de dobras 
    (lembre que sempre é um número par) feitas no papel e escreva quantos quadrados podem ser vistos após desdobrá-lo.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("quantidade de Dobras no papel(um numero par): ");
            int dobras = scanner.nextInt();

            if(dobras%2==0){
                int square = (dobras*dobras);
                System.out.printf("O numero de quadrados formados aparatir de %d dobras, foram formados %d quadrados",dobras,square);
            } else{
                System.out.print("Digite uma quantidade de dobras novamente, pois o numero não é Par");
            }


        scanner.close();
    }
}

