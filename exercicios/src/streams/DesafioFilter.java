package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    // USAR O FILTER + MAP
    // voce escolhe como fazer o desafio.
    // DADOS DA CLASSE 'ESTUDANTE'

    public static void main(String[] args) {

        Estudante e1 = new Estudante("Clara", 7.1, true);
        Estudante e2 = new Estudante("Pedro", 6.9, true);
        Estudante e3 = new Estudante("Gabriel", 9.8 , false);
        Estudante e4 = new Estudante("Danilo", 8.8 , false);
        Estudante e5 = new Estudante("Tereza", 9.2, false);
        Estudante e6 = new Estudante("Francisco", 7.0, true);
        Estudante e7 = new Estudante("Dolores", 8.7, true);

        //CRIACAO DA LIST
        List<Estudante> estudantes = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);

        //CRIACAO DAS CONDICOES/PREDICATE/Funcion
        //predicate = filter
        Predicate<Estudante> aprovacaoPorMedia = e -> e.media >= 7;
        //map = function
        Function<Estudante, String> aprovado = e -> "Parabens, " + e.nome + ". Voce passou!";
        //add Predicate<Estudante> faltasNoSemestre = e -> e.faltas >= 7;
        //add Function<Estudante, String> reprovacaoPorFaltas = e -> e.faltas >=7 && e.media >= 7 ;
        Predicate<Estudante> aprovacaoPorMediaComComportamento = e -> e.media >= 7 && e.comportamento;
        Function<Estudante, String> aprovadoComBomComportamento =
                e -> "Parabens, " + e.nome + "! Voce passou e teve um bom comportamento!";

        System.out.println("---------------------------------------------------------------");

        estudantes.stream()
                .filter(aprovacaoPorMedia)
                .map(aprovado)
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------------------");

        estudantes.stream()
                .filter(aprovacaoPorMediaComComportamento)
                .map(aprovadoComBomComportamento)
                .forEach(System.out::println);
    }


}
