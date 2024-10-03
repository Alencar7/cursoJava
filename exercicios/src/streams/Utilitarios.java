package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

    private Utilitarios(){
        //PRIVANDO O COSTRUTOR PARA NAO TER "NEW UTILITARIOS"
        //poderia colocar interrface no lugar de class
    }

    public final static UnaryOperator<String> maiuscula =
            n -> n.toUpperCase(); // maiuscula = lambda // n->n.toU... = lambdaExpressionn
    //public final static UnaryOperator<String> primeiraLetra =
    //        n -> n.charAt(0) + ""; // retorna caracter

    public static String grito (String n) {
        return n + "!!!";
    }
}
