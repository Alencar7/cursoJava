package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        //REFERENCIANDO 'PRINT' COMO PARAMETRO
        Consumer<String> print = System.out::println;
        Consumer<Object> println = System.out::println;
        // STREAM.OF -> CRIA STREAM(METODO STATICO)
        Stream<String> langs = Stream.of("Java","Lua", "JS\n"); //valores literais
        langs.forEach(print); // forEach para listar e chamar o print, que esta como variavel

        //FUNCAO ESTATICA
        String[] maisLangs = { "Python", "Lisp", "Perl", "Go\n"};
        Stream.of(maisLangs).forEach(print);//Stream + .of({variavel})

        //criando uma Stream com Array
        Arrays.stream(maisLangs).forEach(print); // Array.stream(pede um array)
        //SUBCONJUNTO + ARRAYS = limitando e mostrando os parametros
        Arrays.stream(maisLangs,1,2).forEach(print); // limita os indices da stream

        //LIST + ARRAYS
        List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
        outrasLangs.stream().forEach(print); // a IDE esta dizendo que pode ser sem o .stream()
        outrasLangs.parallelStream().forEach(print); //imprime em paralelo </> sem uma ordem especifica

        // GERANDO STREAM DE FORMA INFINITA
        // Stream.generate(() -> "a").forEach(println); -> print nao pode ser um String e sim um Interger ou Object
        // Stream.iterate(0, n -> n+1).forEach(println); // iterate({inicio}, {valorQueRecebe} -> {resultado}



    }
}
