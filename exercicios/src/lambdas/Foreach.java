package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.
                asList("Ana", "Bia","Geo" , "Ari");

        System.out.println("Forma tradicional...");
        for(String nome : aprovados){
            System.out.println(nome);
        }

        System.out.println("\n Lambda #01 ...");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        System.out.println("\n Lambda #02 ..."); //static void meuImp
        aprovados.forEach(nome -> meuImprimir(nome + "!!!"));


        System.out.println("\n Method Reference #01...");
        aprovados.forEach(System.out::println);
        // pra cada [aprovados] -> (.forEach)
        System.out.println("\n Method Reference #02...");
        aprovados.forEach(Foreach::meuImprimir); //static void meuImp

    }

    static void meuImprimir(String nome){
        System.out.println("Oi! Meu nome e " + nome);
    }

}
