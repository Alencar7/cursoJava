package fundamentos;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        int a = 2 + 3 * 4;
        int b = (int) Math.pow(a,3);
        double c = Math.pow(a,3);

        System.out.println(b); // 8
        System.out.println(c); // 8.0
    }
}
