package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana"); // add var in lista - endereco de memoria
        lista.add(u1); //add u1 = new usuario

        lista.add(new Usuario("Carlos")); // add objeto
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3).nome); //acessar pelo indice(get())

        lista.remove(1); //- carlos
        System.out.println(">>>>>"+ lista.remove(1)); // lia e o novo 1
        System.out.println(lista.remove(new Usuario("Manu"))); // true

        System.out.println("Tem?" + lista.contains(new Usuario("Lia"))); //contem?

        for (Usuario u : lista){
            System.out.println(u.toString());
        }

    }
}
