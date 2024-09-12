
import java.util.Scanner;

public class VerficadorDeIdadeHabilitacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Pode obter!");
        } else {
            System.out.println("Não pode obter!");
        }
        sc.close();
    }
}
