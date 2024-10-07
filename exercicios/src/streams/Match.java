package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    // MATCH E UMA FUNCAO TERMINADORA!
    public static void main(String[] args) {
        // reusando Aluno e List<Aluno>
        Aluno a1 = new Aluno("ana", 7.2);
        Aluno a2 = new Aluno("pedro", 9.2);
        Aluno a3 = new Aluno("sofia", 8.6);
        Aluno a4 = new Aluno("jao", 10);

        java.util.List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        //criar um predicado para usar 'macth'
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate(); //negacao de aprovado

        //TODOS OS ALUNOS FORAM RPEOVADOS? -> ALLMATCH(predicate)
        System.out.println(alunos.stream().allMatch(aprovado));// boolean
        //ALGUM ALUNO FOI APROVADO? -> ANYMATCH(predicate)
        System.out.println(alunos.stream().anyMatch(aprovado)); // boolean
        //NENHUM ALUNO FOI APROVADO? -> NONEMATCH(predicate)
        System.out.println(alunos.stream().noneMatch(reprovado)); // boolean


    }
}
