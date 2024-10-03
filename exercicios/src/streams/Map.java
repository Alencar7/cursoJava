package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;


public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW","Audi", "Honda");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        //UnaryOperator<String> maiuscula = n-> n.toUpperCase(); // maiuscula = lambda // n->n.toU... = lambdaExpressionn
        UnaryOperator<String> primeiraLetra = n-> n.charAt(0) + ""; // retorna caracter
        //UnaryOperator<String> grito = n-> n + "!!!";

        //USANDO O SOUT + UNARYOP + ANDTHEN
        // se o unitaryop estivesse on
        //System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("fiat uno"));

        // COMPOSICAO EM UMA COLECAO DE DADOS
        System.out.println("Usando composicao \n");
        marcas.stream()
                .map(Utilitarios.maiuscula) // mathMethod
                .map(primeiraLetra) //
                .map(Utilitarios::grito) //meth
                .forEach(print);







    }
}
