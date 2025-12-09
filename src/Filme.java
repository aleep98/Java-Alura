import java.util.Scanner;

public class Filme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do filme:");
        String nomeDoFilme = scanner.nextLine();

        System.out.println("Digite o ano de lançamento:");
        int anoDeLancamento = scanner.nextInt();

        System.out.println("avaliação do filme (de 0.0 a 10.0):");
        double avaliacaoDoFilme = scanner.nextDouble();
        System.out.println("O filme " + nomeDoFilme + " foi lançado em " + anoDeLancamento + " e tem uma avaliação de " + avaliacaoDoFilme);

        scanner.close();
    }
}
