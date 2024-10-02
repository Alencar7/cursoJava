package fundamentos;

public class notacaoPontoEmJAVA {

    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.toUpperCase(); // LETRA MAIUSCULA
        s = s.replace("X", "Senhor"); // Substitui
        s = s.concat("!!!");
        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X","Adriano");
        System.out.println(y);

        String yy = "Bom dia X"
                .replace("X","Adriano")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);
    }
}
