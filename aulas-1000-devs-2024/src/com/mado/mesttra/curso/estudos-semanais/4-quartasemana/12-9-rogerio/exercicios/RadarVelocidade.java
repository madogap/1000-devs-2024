import java.util.Scanner;

public class RadarVelocidade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float velocidade;
        float velocidadeMaxima;
        // float velocidadeLimite;
        // float excedeuVelocidade;

        System.out.println("Digite a velicida maxima em Km/h: ");
        velocidadeMaxima = sc.nextFloat();

        System.out.println("Digite a velicida medida em Km/h: ");
        velocidade = sc.nextFloat();

        if (velocidade > (velocidadeMaxima * 1.07f)) {
            System.out.println("O veiculo excedeu a velocidade maxima");
        }
        sc.close();
    }
}
