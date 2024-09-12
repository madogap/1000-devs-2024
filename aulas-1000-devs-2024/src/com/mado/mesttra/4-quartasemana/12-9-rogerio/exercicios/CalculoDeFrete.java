import java.util.Scanner;

public class CalculoDeFrete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Obter o valor do produto
        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();
        // Obter o peso do pacote
        System.out.print("Digite o peso do pacote (em kg): ");
        double pesoPacote = scanner.nextDouble();
        // Calcular o custo do frete
        double custoFrete;
        if (pesoPacote <= 5) {
            custoFrete = 20.00; // Custo para pacotes até 5 kg
        } else {
            custoFrete = 50.00; // Custo para pacotes acima de 5 kg
        }
        // Calcular o valor final
        double valorFinal = valorProduto + custoFrete;
        // Exibir o resultado
        System.out.printf("O valor final com frete é: R$ %.2f%n", valorFinal);
        scanner.close();
    }
}