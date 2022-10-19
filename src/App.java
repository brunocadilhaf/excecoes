public class App {
    public static void main(String[] args) throws Exception {
        int valor1 = 10;
        int valor2 = 0;

        System.out.println(valor1/valor2);

        if (valor1 > valor2) {
            throw new ArithmeticException("O valor 1 não pode ser maior que o valor 2");
        }

        if (valor1 >= 0) {
            throw new ArithmeticException("O valor 1 não pode ser igual a zero e nem positivo");
        }
    }
}
