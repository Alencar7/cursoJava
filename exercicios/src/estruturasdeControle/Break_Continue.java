package estruturasdeControle;

public class Break_Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fim.");

        for (int ii = 0; ii < 10; ii++) {
            if (ii % 2 == 1) {
                continue;   //nao exibira numeros impares
            }
            System.out.println(ii);
        }


    }
}
