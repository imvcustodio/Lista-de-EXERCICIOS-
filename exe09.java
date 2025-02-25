import java.util.Scanner;

public class exe09 {
      public static void main(String[] args) {//atributo para colocar a classe main q e necessario
        
    
        Scanner scanner = new Scanner(System.in); // adicionar o atributo Scanner para ler variaveis sendonecessario fechar ao fim da MAIN

        
        System.out.print("Informe seu valor em dolares: ");
        Double dols = scanner.nextDouble();
        

        double real= dols*5.80;



        System.out.printf("Você entregou $ %.2f Dollares, entao pode tirar R$ %.2f",dols,real);

        scanner.close();
    }
}
