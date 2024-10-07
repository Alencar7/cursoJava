package streams;

import java.util.Arrays;
import java.util.List;

public class OutosMetodos {

    public static void main(String[] args) {
        // reusando Aluno e List<Aluno>
        Aluno a1 = new Aluno("ana", 7.2);
        Aluno a2 = new Aluno("pedro", 6.2);
        Aluno a3 = new Aluno("sofia", 5.6);
        Aluno a4 = new Aluno("jao", 10);
        Aluno a5 = new Aluno("ana", 7.2);
        Aluno a6 = new Aluno("luna", 9.2);
        Aluno a7 = new Aluno("sofia", 5.6);
        Aluno a8 = new Aluno("maria", 10);

        List<Aluno> alunos =
                Arrays.asList(a1,a2,a3,a4,a5, a6, a7, a8);

        System.out.println("distinct..."); //equals and hashcode
        // excluir os duplicados
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2) //pular 2 elementos -> sofia
                .limit(2) //pular 2 elementos -> luna
                .forEach(System.out::println);

        System.out.println("\ntakeWhile"); //pegue elementos ate acontecer isso()
        alunos.stream()
                .distinct()
                // .skip(2)//pular os 2 primeiros 1 negativo, pararia em pedro
                .takeWhile(a -> a.nota >= 7) //pegar os alunos ate chegar em 7
                .forEach(System.out::println);



    }
}
