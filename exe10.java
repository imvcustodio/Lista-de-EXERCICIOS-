
import java.util.Scanner;
/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos*/
public class exe10 {
    public static void main(String[] args) {//atributo para colocar a classe main q e necessario
        
    
        Scanner scanner = new Scanner(System.in); // adicionar o atributo Scanner para ler variaveis sendonecessario fechar ao fim da MAIN

        
        System.out.print("Informe a sua carga horaria menasal em segundos");
        int seconds = scanner.nextInt();
        

        int hora=seconds/3600;

        int minutes = (seconds/60)%60;

        int segundos =seconds%60;

        System.out.printf("Hora: %d",hora);
        
        System.out.printf("minuto: %d",minutes);

        System.err.printf("Segundos: %d",segundos);
        

        scanner.close();
    }
}
       
