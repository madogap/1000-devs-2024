
import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = teclado.nextDouble();
        double desconto = 0;

        if (valorCompra > 100) {
            // valorCompra * 0.9
            desconto = valorCompra * 0.1;
        }
        System.out.println("Você teve um desconto de 10% e o valor final de sua compra é: " + (valorCompra - desconto));

        teclado.close();
    }
}