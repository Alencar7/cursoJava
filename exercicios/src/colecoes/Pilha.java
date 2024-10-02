package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>(); // criar a pilha

        livros.add("O pequeno principe");
        livros.push("Dom Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek()); // se nao achar nada retorna nulo
        System.out.println(livros.element()); // se nao achar retorna exception

        for(String livro : livros){
            System.out.println(livro);
        }

        System.out.println(livros.poll()); // retorna FALSE
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop()); // NoSuchElementExcepiotn
        // System.out.println(livros.remove()); // RETORNA EXECPTION

        // livros.size(); // TAMANHO
        // livros.clear(); //LIMPAR
        //livros.contains();


        // livros. -> explorar a API


    }
}
