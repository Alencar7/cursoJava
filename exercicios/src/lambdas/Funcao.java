package lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        // Funcion recebe um inteiro e retorna uma string
        Function<Integer, String> parOuImpar =
        numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(45)); // apply = chama a func direto

        Function<String, String> oResultadoE =
                valor -> "O resultado e " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!";

        Function<String, String> duvida =
                valor -> valor + "???";

        //JUNTANDO 2 FUNCOES
        String resultadoFinal1 = parOuImpar
                    .andThen(oResultadoE) //.andThen() = e entao
                    .andThen(empolgado)   // OBS: SAINDA E ENTRADA TEM QUE SER OBSERVADA
                    .apply(45);

        System.out.println(resultadoFinal1);

        //JUNTANDO 2 FUNCOES
        String resultadoFinal2 = parOuImpar
                .andThen(oResultadoE) //.andThen() = e entao
                .andThen(duvida)   // reutilizando
                .apply(54);

        System.out.println(resultadoFinal2);


        System.out.println(parOuImpar.apply(34));



    }

}
