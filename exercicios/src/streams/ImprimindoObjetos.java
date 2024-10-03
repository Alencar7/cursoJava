package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("lu", "gui", "luca");

        for (int i = 0; i < aprovados.size(); i++) {
            // System.out.println(aprovados.get(i)); -> jeito normal(das cavernas)

            System.out.println("Usando forEach: ");
            for(String varNome: aprovados){ // forEach
                System.out.println(varNome);
            }

            System.out.println("\nUsando Iterator + While: ");
            Iterator<String> varIterator = aprovados.iterator(); //it recebe lista de aprovados contida em iterator
            while (varIterator.hasNext()){ //hasNext() -> tem proximo ? println : false
                System.out.println(varIterator.next());
            }

            System.out.println("\nUsando Stream + forEach: ");
            Stream<String> varStream = aprovados.stream();
            varStream.forEach(System.out::println); //LACO INTERNO ESTA AQUI DENTRO!!!

        }
    }
}
