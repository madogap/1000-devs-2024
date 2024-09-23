import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        // Verificar se a data é válida
        boolean dataValida = false;

        // Verificar se o mês está no intervalo válido
        if (mes >= 1 && mes <= 12) {
            int maxDias = 31; // Por padrão, meses com 31 dias

            // Verificar os dias máximos de acordo com o mês
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                maxDias = 30;
            } else if (mes == 2) {
                // Verificar se é ano bissexto para definir os dias de fevereiro
                if (isAnoBissexto(ano)) {
                    maxDias = 29;
                } else {
                    maxDias = 28;
                }
            }

            // Verificar se o dia está no intervalo válido para o mês
            if (dia >= 1 && dia <= maxDias) {
                dataValida = true;
            }
        }

        // Exibir o resultado
        if (dataValida) {
            System.out.printf("A data %02d/%02d/%04d é válida%n", dia, mes, ano);
        } else {
            System.out.printf("A data %02d/%02d/%04d é inválida%n", dia, mes, ano);
        }

        scanner.close(); // Fechar o scanner
    }

    // Função para verificar se o ano é bissexto
    public static boolean isAnoBissexto(int ano) {
        // O ano é bissexto se for divisível por 400 ou for divisível por 4 e não for
        // por 100
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }
}
