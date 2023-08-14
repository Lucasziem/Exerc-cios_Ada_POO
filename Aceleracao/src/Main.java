import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o valor da força: ");
        int forca = scanner.nextInt();

        System.out.println("Escreva o valor da massa -> (maior que zero): ");
        int massa = scanner.nextInt();

        Aceleracao aceleracao = new Aceleracao(forca, massa);
        System.out.println("A aceleração é de " + aceleracao.aceleracao() + "m/s²");

        scanner.close();
    }
}