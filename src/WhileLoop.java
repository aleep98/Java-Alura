import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Digite a nota do filme ou -1 para encerrar: " );
            nota = sc.nextDouble();
            if (nota != -1) {
                media += nota;
                totalNotas++;
            }
        }
        System.out.println("Média das notas: " + (media / totalNotas));
        sc.close();
    }
}
