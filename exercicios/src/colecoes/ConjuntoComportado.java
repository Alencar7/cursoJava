package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        // Set<String> listaAprovados = new HashSet<>(); // COLOCANDO APENAS O TIPO STRING, usando o <>
        SortedSet<String> listaAprovados = new TreeSet<>(); //TreeSet garante a ordem
        listaAprovados.add("Adriano");
        listaAprovados.add("Onairda");
        listaAprovados.add("Ari");
        listaAprovados.add("Isis");
        listaAprovados.add("Dona Ceica");

        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> numerosInteiros = new HashSet<>();
        numerosInteiros.add(15);
        numerosInteiros.add(4);
        numerosInteiros.add(23);
        numerosInteiros.add(2);

        for (int n: numerosInteiros){
            System.out.println(n);
        }
    }
}
