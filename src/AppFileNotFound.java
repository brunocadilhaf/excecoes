import java.io.File;
import java.util.Scanner;

public class AppFileNotFound {
    public static void main(String[] args) throws Exception {
        File arquivo = new File("C:/temp/arquivo.txt");
        Scanner conteudoArquivo = new Scanner(arquivo);

        while (conteudoArquivo.hasNextLine()) {
            String data = conteudoArquivo.nextLine();
            System.out.println(data);
        }

        conteudoArquivo.close();
    }
}
