package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        /*
        Desafio!!! Usando MAP faca:
        1. Numero para string binaria -> 6 => "110"
        2. Reverter a string -> "110" => "011"
        3. Converter de volta para numero inteiro -> "011" => 3
        (dica: Interger)
         */

        UnaryOperator<String> inverter =
                s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> binarioParaInt =
                s -> Integer.parseInt(s, 2);

        nums.stream()
                .map(Integer::toBinaryString)//int -> binary
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);

    }

}
