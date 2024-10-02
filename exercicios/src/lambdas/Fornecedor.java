package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {

        Supplier<List<String>> umLista =
                //usar () pois o suplplier nao recebe parametros
                () -> Arrays.asList("Ana", "Bia", "Geo", "Ari");
        System.out.println(umLista.get());
    }
}
