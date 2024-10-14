package generics;

import java.util.List;

public class ListaUtil {

    // sem notacao generica
    public static Object getUltimo1(List<?> lista){
        return lista.get(lista.size() - 1);
    }
    // com notacao generica - nao precisa se preocupar com cast
    public static <T> T getUltimo2(List<T> lista){
        return lista.get(lista.size() - 1);
    }

}
