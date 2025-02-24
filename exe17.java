/*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas 
trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora 
(valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família)
 e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. 
Ao final informe o nome, o salário bruto e o salário líquido do funcionário. */
import java.util.Scanner;

public class exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe o seu nome: ");
        String Name = scanner.nextLine();
        
        System.out.print("Informe a sua carga horaria de trabalho mensais: ");
        int work = scanner.nextInt();
        
        System.out.print("Informe a sua quantidade de dependentes: ");
        int depend = scanner.nextInt();


        int salarioWork = work*10;

        int dependentsSalari = depend * 60;

        int Brutesalari = salarioWork + dependentsSalari;

        double liquidSalariWork = Brutesalari *(1- 0.135);

        System.out.printf("Ola, "+ Name+"%n");
        System.out.printf("Você trabalhou %d horas%n", work); // funciona assim a concatenação dentro do java ao inves de usarmos o mais citamos a var no dfim e utilizamos o %d para int e o %.2f para floe para infdicar a variavel dentro da string de result

        System.out.printf("Entao seu salario foi por horas trabalhadas foi: %d%n",+ salarioWork);
        System.out.printf("Voce possui: %d dependentes%n",depend);
        System.out.printf("Entao recebera: %d Para ajudar com seus dependentes%n",dependentsSalari);
        
        System.out.printf("Entao recebera Bruto: R$:%d%n", Brutesalari);
        System.out.printf("Porem com descontos de INSS e imposto de renda: R$:%.2f%n",+ liquidSalariWork);
        System.out.printf("E esse foi nosso calculo, Tchau!");


        scanner.close();
    }
}
       

