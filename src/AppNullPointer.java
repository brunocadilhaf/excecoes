import java.util.List;

public class AppNullPointer {
    public static void main(String[] args) throws Exception {
        List<String> minhaLista = null;
        minhaLista.size();

        
        int[] numeros = null;
        System.out.println(numeros[3]);
    }
}
