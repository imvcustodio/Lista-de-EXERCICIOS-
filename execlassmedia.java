import java.util.Scanner;

public class execlassmedia {
    //analise do problema: o nome  n foi utilizado
    //entradas: n,n2,n3,nome
    //saida: media
    //processo:media = (Nota1+Nota2+Nota3)/3
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in); // nunca esquecer de criar esse objeto scanner pq se n n tem como criar as variaveis
        System.out.println("Ola usuario, estamos em nosso sistema de medias!");

        System.out.println("Digite a sua Primeira Nota:");
        int Nota1 = scanner.nextInt();

        System.out.println("Digite a sua segunda nota:");
        int Nota2 = scanner.nextInt();

        System.out.println("digite a sua terceira nota:");
        int Nota3 = scanner.nextInt();

        System.out.println("Qual o seu nome: ");
        String Name = scanner.next();

        double media = (Nota1+Nota2+Nota3)/3;

        
        if(media>=6){
            System.out.printf("Ola: "+Name);
            System.out.printf("O media das notas informadas é: %.2f, entao voce esta APROVADO!",media);
        }else{
            System.out.printf("A media das notas informadas é: %.2f, entao voce esta REPROVADO\n",media);
        }

        System.out.println("Deseja rodar o programa novamente? (sim/não): ");
        String resp = scanner.next();
    

        while (resp == "sim") {
            // Chama o método da outra classe
            execlassmedia.main(args);
            break;
        }
        

        scanner.close();
    }  
}

