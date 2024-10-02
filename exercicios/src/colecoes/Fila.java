package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>(); // criar a lista

        // ADD & OFFER = ADICIONAM DADOS
        // a diferenca de comportamento ocorre quando a fila esta cheia
        fila.add("Ana"); // retorna erro caso nao add
        fila.offer("Bia");// boolean - false caso nao add
        fila.add("Gui");
        fila.offer("Carlos");

        // PEEK & ELEMENt = PEGAR/OBTER ELEMENTO DA FILA E LE, MAS NAO REMOVE
        //A DIFERENCA ENTRE O COMPORTAMENTO DOS DOIS E QUANDO A FILA ESTA FAZIA
        System.out.println(fila.peek()); // RETORNA FALSE
        System.out.println(fila.element()); // RETORNA Eception in thread

        // POOL & REMOVE = PEGAR/OBTER O PROXIMO ELEMENTO DA FILA E REMOVE
        //A DIFERENCA ENTRE O COMPORTAMENTO DOS DOIS E QUANDO A FILA ESTA FAZIA
        System.out.println(fila.poll()); // retorna FALSE
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); //lanca excecao!

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains(...)


    }
}
