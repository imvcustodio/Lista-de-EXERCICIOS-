import java.util.Scanner;

public class exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita entrada do usuário
        System.out.print("Nome: ");
        String nomeFuncionario = scanner.nextLine();
        
        System.out.print("salario: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Vendas em din: ");
        double VendasValor = scanner.nextDouble();

        double salariComissao = salarioFixo + (VendasValor * 0.15);
    
        
        // Exibe o resultado
        System.out.println("Funcionário: " + nomeFuncionario);
        System.out.printf("fixo = R$ %.2f%n", + salarioFixo);
        System.out.printf("vendas = R$ %.2f%n", + VendasValor);
        System.out.printf("salario com as comições = R$ R$ %.2f%n", + salariComissao);
        
        scanner.close();
    }
}

