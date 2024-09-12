
import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = teclado.nextInt();

        if (valorCompra > 100) {
            System.out.println("Você teve um desconto de 10% e o valor final de sua compra é: " + (valorCompra * 0.9));
        }
    }
}