import java.util.Scanner;

public class AppInputMismatch {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano de seu nascimento:");
        int ano = sc.nextInt();

        System.out.println("Digite o ID do colaborador da sua empresa:");
        int id = sc.nextInt();

        sc.close();
    }
}
