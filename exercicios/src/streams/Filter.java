package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Daniel", 3.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebeca", 7.1);
        Aluno a6 = new Aluno("Pedro", 7.9);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        //JEITO 1 DE FAZER
        alunos.stream().filter(a -> a.nota >= 7)
                .map(a-> "Parabens " + a.nome + "! Voce foi aprovado(a)!")
                .forEach(System.out::println);


        //JEITO 2 DE FAZER - OTIMO PARA REUSAR 'N' VEZES
        Predicate<Aluno> aprovacao = a -> a.nota >= 7 ;
        Function<Aluno, String> saudacaoAprovado =
                a -> "Parabens " + a.nome + "! Voce foi aprovado(a)!";

        alunos.stream()
                .filter(aprovacao)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
