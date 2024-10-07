package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //criacao de uma funcao
        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        int total1 = nums.stream()
                .reduce(soma)
                .get(); // pegar o valor final que e Integer
        System.out.println(total1);

        Integer total2 = nums.stream() // sem get(), ja que passei o valor inicial
                .reduce(100,soma);// valor inicial = 100
        System.out.println(total2);

        // RESULTADO foi um Opcional<Intger>...
        nums.stream()
                .filter(n -> n > 5) //contagem de soma a partir do limite = 6
                .reduce(soma)
                .ifPresent(System.out::println);



    }
}
