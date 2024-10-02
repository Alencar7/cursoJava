package fundamentos;

public class ConversaoTiposPrimNum {
    public static void main(String[] args) {
        /**
         * O JAVA E MUITO EXPLICATIVO E PRECISA DA MUDANCA
         * */

        double a = 1 ; // implicita
        System.out.print(a);

        float b = (float) 1.1233456888; //EXPLICITA (CAST)
        System.out.print(b);

        int c = 340;
        byte d= (byte) c;   //EXPLICITA (CAST)
        System.out.print(d);

        double e = 1.99999;
        int f = (int) e; //EXPLICITA (CAST)
        System.out.print(f);


    }
}
