package colecoes;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuario = new HashSet<Usuario>();
        //ver sempre se 'Usuario' ja esta com hashcode e o equals
        // pode usar o que e fornecido pela IDE

        usuario.add(new Usuario("Pedro"));
        usuario.add(new Usuario("Ana"));
        usuario.add(new Usuario("Guilherme"));

        boolean resultado = usuario.contains(new Usuario("Guilherme"));
        System.out.println(resultado);

    }
}
