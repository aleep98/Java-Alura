import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;


public class LeitorTxt {

    public static void main(String[] args) {
        Path caminho = Path.of("C:\\Users\\lalex\\Desktop\\java\\Java-Alura\\src\\entrada.txt");
        try {
            List<String> linhas = Files.readAllLines(caminho);
            for (int i = 0; i < linhas.size(); i++){
                System.out.println((i+1) + " - " + linhas.get(i));
                String[] palavras = linhas.get(i).split("\\s+" );
                System.out.println("Quantidade de palavras na linha " + (i+1) + ": " + palavras.length);
            }
            } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
    }
}
}
