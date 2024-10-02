package fundamentos;

public class ConversaoNumparaStr {

    public static void main(String[] args) {
        /** PARA CONVERTER UM INT EM STR
         * E PODER CONTAR OS NUMEROS/STR LA DENTRO
         * */
        //ex1
        Integer num1 = 10000;
        System.out.print(num1.toString().length());

        //ex2
        int num2 = 100000;
        System.out.print(Integer.toString(num2));

        //outro jeito de fazer isso de forma implicita
        System.out.print(("" + num1).length());
        System.out.print(("" + num2).length());

        // Long.toString(s);
        // Short.toString(b);

    }
}
