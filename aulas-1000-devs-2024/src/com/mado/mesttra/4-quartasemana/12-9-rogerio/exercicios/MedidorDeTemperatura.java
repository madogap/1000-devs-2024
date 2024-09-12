import java.util.Scanner;

public class MedidorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();

            if (temperatura > 38) {
                System.out.println("A pessoa está com febre.");
            } else {
                System.out.println("A pessoa não está com febre.");
            }
        } catch (Exception e) {

            System.out.println("Erro: Entrada inválida. Por favor, insira um valor numérico.");
        } finally {
            scanner.close();
        }
    }
}
