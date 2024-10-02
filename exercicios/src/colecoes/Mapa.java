package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
//NAO ACEITA DUPLICADO
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        // .put( , ); coloca = add or subst
        usuarios.put(1, "Roberto"); // ADICIONANDO
        //usuarios.put(1, "Ricardo"); // SUBSTITUINDO
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size()); //TAM (qnt de chaves
        System.out.println(usuarios.isEmpty()); // vazio ou nao? = FALSE

        System.out.println(usuarios.keySet()); // retorna as chaves, n ordenada
        System.out.println(usuarios.values()); // passa os valores
        System.out.println(usuarios.entrySet()); // chave+valor

        System.out.println(usuarios.containsKey(4)); // chave = TRUE
        System.out.println(usuarios.containsValue("Rebeca")); // valor = TRUE

        System.out.println(usuarios.get(3));// chave? -> valor
        System.out.println(usuarios.remove(1)); //remove
        System.out.println(usuarios.remove(4, "Gui"));

        for(int chave: usuarios.keySet()){
            System.out.println(chave); // imprime as chaves
        }

        for(String valor: usuarios.values()){
            System.out.println(valor); // imprime os valores
        }

        //entry = entradas
        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            //System.out.println(registro); //PERCORRE CHAVE E USUARIO
            System.out.print(registro.getKey() + " => ");
            System.out.println(registro.getValue());
        }
    }
}
