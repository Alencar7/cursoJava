package fundamentos;

public class temperatura {

    public static void main(String[] args) {
        final double x = 5/9.0;
        int y = 32;
        double var = 86;

        double temperatura = ((var - y) * x);

        System.out.println("Resultado final e: " + temperatura);
    }
}
