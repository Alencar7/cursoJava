package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {
        List<String> linguagem = Arrays.asList("JS", "PHP", "JAVA");
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        //COM CAST - e preciso especificar o tipo aqui
        String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(linguagem);
        System.out.println(ultimaLinguagem1);
        Integer ultimoNome1 = (Integer) ListaUtil.getUltimo1(numeros);
        System.out.println(ultimoNome1);


        //SEM CAST - nao e necessario especificar o tipo aqui
        String ultimaLinguagem2 = ListaUtil.getUltimo2(linguagem);
        System.out.println(ultimaLinguagem2);
        Integer ultimoNome2 = ListaUtil.getUltimo2(numeros);
        System.out.println(ultimoNome2);
    }
}
