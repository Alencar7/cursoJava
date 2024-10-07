package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("ana", 7.2);
        Aluno a2 = new Aluno("pedro", 9.2);
        Aluno a3 = new Aluno("sofia", 5.6);
        Aluno a4 = new Aluno("jao", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a,b) -> a + b;

        alunos.parallelStream()//parallelStream() -> processamento em paralelo. Pode ocorrer erros de soma
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);













    }
}
