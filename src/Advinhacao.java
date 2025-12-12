import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100)+1;
        int tentativas = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao jogo de adivinhação!");

        while ( tentativas > 0) {
            System.out.println("Digite seu palpite (1-100): ");
            int palpite = scanner.nextInt();
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
            tentativas--;
            if (tentativas == 0) {
                System.out.println("Suas tentativas acabaram. O número secreto era: " + numeroSecreto);
            }
        }
        scanner.close();
    }
}
