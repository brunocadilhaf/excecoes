import java.util.ArrayList;
import java.util.List;

public class AppIndexOutOfBound {
    public static void main(String[] args) throws Exception {
        List<String> minhaLista = new ArrayList<>();
        minhaLista.add("Valor 001");
        minhaLista.add("Valor 002");
        minhaLista.add("Valor 003");

        minhaLista.get(-1);
        minhaLista.get(3);
        minhaLista.get(5);
    }
}
