package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce03 {

    public static void main(String[] args) {
        // reusando Aluno e List<Aluno>
        Aluno a1 = new Aluno("ana", 7.2);
        Aluno a2 = new Aluno("pedro", 9.2);
        Aluno a3 = new Aluno("sofia", 5.6);
        Aluno a4 = new Aluno("jao", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinarMedia =
                (m1, m2) -> Media.combinar(m1, m2);


        //reduce com tipos diferentes
        Media media = alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combinarMedia); //acumulador/ combinacao

        System.out.println("A media dos arovados e " + media.getValor());

    }

}
