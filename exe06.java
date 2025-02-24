
import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe o seu Nome: ");
        String Name = scanner.nextLine();
        
        System.out.print("Informe a sua carga horaria de trabalho mensais: ");
        int work = scanner.nextInt();
        
        System.out.print("Informe a sua bonificação por hora trabalhada: ");
        double Money = scanner.nextDouble();
        
        double salarioWork = work*Money;

        System.out.printf("Ola, "+ Name+"%n");
        System.out.printf("Você trabalhou %d horas%n", work); // funciona assim a concatenação dentro do java ao inves de usarmos o mais citamos a var no dfim e utilizamos o %d para int e o %.2f para floe para infdicar a variavel dentro da string de result

        System.out.printf("Entao seu salario foi por horas trabalhadas foi: R$ %.2f%n",+ salarioWork);


        scanner.close();
    }
}
       
